package com.saltech.BankTransfer;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class BankAccountTransferTest {

    private Account payer;
    private Account payee;

    @Before
    public void setUp() {
        payer = new Account("001ABC");
        payee = new Account("999XYZ");
    }

    @Test
    public void should_reduce_the_balance_of_payer_account_by_transaction_amount() {

        // Arrange
        payer.setBalance(new BigDecimal(200));

        // Act
        payer.transfer(new BigDecimal(50), payee);

        // Assert
        assertThat(payer.getBalance()).isEqualTo(new BigDecimal(150));
    }

    @Test
    public void should_increase_the_payee_balance_by_the_amount_of_transacion() {

        //Arrange
        payer.setBalance(new BigDecimal(200));

        //Act
        payer.transfer(new BigDecimal(50), payee);

        //Assert
        assertThat(payee.getBalance()).isEqualTo(new BigDecimal(50));
    }

    @Test
    public void should_record_transaction_as_debit_in_payer_transaction_history() {


        // Arrange
        payer.setBalance(new BigDecimal(200));

        // Act
        payer.transfer(new BigDecimal(50), payee);
        List<Transaction> transactions = payee.getTransactions();
        Transaction transaction = transactions.get(0);

        // Assert
        assertThat(transactions.size()).isEqualTo(1);

        assertThat(transaction.getType()).isEqualTo("Credit");
        assertThat(transaction.getOtherAccount()).isEqualTo(payer);
        assertThat(transaction.getAmount()).isEqualTo(new BigDecimal(50));

    }

    @Test
    public void should_be_able_to_query_to_and_from_account() {

        payer.addTransaction(new Transaction("Credit", payee, new BigDecimal(100)));
        payer.addTransaction(new Transaction("Debit", payee, new BigDecimal(100)));
        payer.addTransaction(new Transaction("Credit", payee, new BigDecimal(100)));
        payer.addTransaction(new Transaction("Debit", new Account("786XYZ"), new BigDecimal(100)));

        List<Transaction> payerResults = payer.getTransactionWhere("Debit", payee);

        assertThat(payerResults.size()).isEqualTo(1);
    }


}
