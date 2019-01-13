package com.natirosh;

public class a7_04_classes_Bank {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setCustomerName(String customerName) {
        String validCustomerName = customerName.toLowerCase();
        if (validCustomerName.contains("customer")) {
            this.customerName = customerName;
        } else {
            this.customerName = "Not Valid Customer Name";
        }
    }

    public void setEmail(String email) {
        String validEmail = email.toLowerCase();
        if (validEmail.contains("@")) {
            this.email = email;
        } else {
            this.email = "Not Valid email";
        }
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int depositFunds(int sum) {
        balance +=sum;
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int withdrawFunds(int sum) {
        if (sum > balance) {
            return -1;
        } else {
            balance -=sum;
            return balance;
        }

    }


    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;

    }

    public int getBalance() {
        return this.balance;
    }
}
