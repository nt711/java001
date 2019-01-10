package com.natirosh;

public class a5_05_Methods_5_OverLoading {
    public static void main(String[] args) {
        double a = calcFeetAndInchesToCentimeters(6, 4);
        System.out.println("Value is " + a + "cm");

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0 || (inches >= 0 && inches <= 12))) {
            return -1;
        }
        return (feet * 12) + (inches * 2.54);

    }
}
