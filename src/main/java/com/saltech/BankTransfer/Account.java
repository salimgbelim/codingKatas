package com.saltech.BankTransfer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Account {

    private final String accountName;
    private BigDecimal balance = BigDecimal.ZERO;
    private List<Transaction> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions =  new ArrayList<>();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void transfer(BigDecimal amount, Account payeeAccount) {
        balance = balance.subtract(amount);
        payeeAccount.setBalance(amount);
        payeeAccount.transactions.add(new Transaction("Credit", this, amount));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionWhere(String type, Account payee) {
        return transactions.stream().filter(x ->  x.getType() == type && x.getOtherAccount().equals(payee) ).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountName != null ? accountName.equals(account.accountName) : account.accountName == null;

    }

    @Override
    public int hashCode() {
        return accountName != null ? accountName.hashCode() : 0;
    }
}
