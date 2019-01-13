package com.natirosh;

public class a7_05_Main {
    public static void main(String[] args) {
        a7_06_Account bobsAccount = new a7_06_Account("12345", 2468.0, "Customer Name12", "1@2.name", "052222333");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

    }

}
