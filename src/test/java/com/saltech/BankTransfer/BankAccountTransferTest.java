package com.saltech.BankTransfer;

import org.junit.Before;
import org.junit.Test;

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
        payer.setBalance(200);

        // Act
        payer.transfer(50, payee);

        // Assert
        assertThat(payer.getBalance()).isEqualTo(150);
    }

}
