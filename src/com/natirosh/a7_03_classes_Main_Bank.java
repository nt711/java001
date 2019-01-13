package com.natirosh;

public class a7_03_classes_Main_Bank {
    public static void main(String[] args) {
        a7_04_classes_Bank Diskont = new a7_04_classes_Bank();
        a7_04_classes_Bank Hapoalim = new a7_04_classes_Bank();
        Diskont.setCustomerName("Customer 01");
        Hapoalim.setCustomerName("Customer 02");
        System.out.println("C Name is " + Diskont.getCustomerName());
        System.out.println("C Name is " + Hapoalim.getCustomerName());

        a7_04_classes_Bank email = new a7_04_classes_Bank();
        email.setEmail("1@2.com");
        System.out.println("email is " + email.getEmail());

        a7_04_classes_Bank Balance = new a7_04_classes_Bank();
        Balance.setBalance(1000);
        System.out.println("current balance is " + Balance.getBalance());
        Balance.depositFunds(100);
        System.out.println("New balance is " + Balance.getBalance());

        if (Balance.withdrawFunds(100) > 0) {
            System.out.println("New balance is " + Balance.getBalance());
        } else {
            System.out.println("Your balance is too low, try to withdrawal less. Current balance remains " + Balance.getBalance());
        }


    }

}
