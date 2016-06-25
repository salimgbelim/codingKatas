package com.saltech.BankTransfer;

public class Account {

    private final String accountName;
    private int balance = 0;

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void transfer(int amount, Account payeeAccount) {
        balance = balance - amount;
    }
}
