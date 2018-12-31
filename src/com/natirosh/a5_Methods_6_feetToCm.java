package com.natirosh;

public class a5_Methods_6_feetToCm {
    public static void main(String[] args) {
        double b = calcFeetAndInchesToCentimeters(14);
        int c = (int) b;
        double a = calcFeetAndInchesToCentimeters(c, 8);
        System.out.println(a);

    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0 && (inches >= 0 && inches <= 12))) {
            return (((feet * 12) + (inches)) * 2.54);
        } else return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            return ((inches/12));
        } else return -1;
    }

}
