package com.natirosh;

public class a7_08_VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //This is a constructor which calls the main constructor and only passes default values for name, credit and email
    public a7_08_VipPerson() {
        this("Default name", 50000.0, "default@email.com");
    }

    //This is a constructor which calls the main constructor and passes 2 real parameters (name and creditLimit),
    // but passes default email value)
    public a7_08_VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
    }

    //This is a constructor which can get values from both previous constructors, and in addition,
    // sets the values in the parameters (name, creditLimit, email)
    public a7_08_VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
