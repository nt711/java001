package com.natirosh;

import java.util.Scanner;

public class a6_09_Minimum_maximum_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean activeMin = false;
        int min = 0;
        int max = 0;
        int currentNumber = 0;
        while (true) {
            System.out.println("Enter Number:");

            boolean isNumber = scanner.hasNextInt();

            if (!isNumber) {
                System.out.println("The minimum number is: " + min);
                System.out.println("The maximum number is: " + max);
                scanner.close();
                break;
            } else
                currentNumber = scanner.nextInt();

            if (currentNumber > max) {
                max = currentNumber;


            } else if (!activeMin) {
                min = currentNumber;
                activeMin = true;

            } else if (currentNumber < min) {
                min = currentNumber;

            }


        }
    }


}






