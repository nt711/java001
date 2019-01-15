package com.natirosh;

public class a7_07_Main {
    public static void main(String[] args) {
        a7_08_VipPerson person1 = new a7_08_VipPerson();
        System.out.println(person1.getName());

        a7_08_VipPerson person2 = new a7_08_VipPerson("Bob", 25000.0);
        System.out.println(person2.getName());

        a7_08_VipPerson person3 = new a7_08_VipPerson("Tim", 100.0, "tim@email.com");
        System.out.println(person3.getName());

    }

}
