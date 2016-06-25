package com.saltech.BankTransfer;

import java.math.BigDecimal;

public class Transaction {

    private String type;
    private Account otherAccount;
    private BigDecimal amount;

    public Transaction(String type, Account account, BigDecimal amount) {
        this.type = type;
        this.otherAccount = account;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public Account getOtherAccount() {
        return otherAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
