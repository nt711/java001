package com.natirosh;


public class a5_Methods_6_feetToCm_solution {
    public static void main(String[] args) {
        double centimeters = calcFeetAcdInchesToCM(6, 13);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calcFeetAcdInchesToCM(157);
    }

    public static double calcFeetAcdInchesToCM(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAcdInchesToCM(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println("Inches is equal to " + feet + " feet and " + remainingInches + " inches") ;
        return calcFeetAcdInchesToCM(feet, remainingInches);
    }


}




