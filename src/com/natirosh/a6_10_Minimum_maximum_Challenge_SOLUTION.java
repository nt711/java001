package com.natirosh;

import java.util.Scanner;

public class a6_10_Minimum_maximum_Challenge_SOLUTION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {

            System.out.println("Enter Number:");
            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input enter
        }

        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        scanner.close();

    }
}









