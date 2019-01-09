package com.natirosh;

import java.util.Scanner;

public class a6_readingUserInput_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        while (counter < 10) {
            counter ++;

            System.out.println("Enter number #" + counter + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                sum += scanner.nextInt();

            }else {
                System.out.println("Invalid Number");

                scanner.close();
            }

        }
        System.out.println(" Sum of all numbers is " + sum);

    }
}
