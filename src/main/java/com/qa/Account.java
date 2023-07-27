package com.qa;

import java.util.Arrays;

public class Account implements Comparable<Account> {

    private String[] cardTypes;
    private String sortCode;
    private String accountNumber;
    private String password;

    public Account(String[] cardTypes, String sortCode, String accountNumber, String password) {
        this.cardTypes = cardTypes;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.password = password;
    }

    public String[] getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        this.cardTypes = cardTypes;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int compareTo(Account o) {
        if(Arrays.asList(this.cardTypes).contains(o.cardTypes[0]) &&
        this.accountNumber.equals(o.accountNumber) &&
                this.password.equals(o.password) &&
        this.sortCode.equals(o.sortCode)) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardTypes=" + Arrays.toString(cardTypes) +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
