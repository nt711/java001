package com.natirosh;

import java.util.Scanner;

public class a6_readingUserInput_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;
        while (counter <= 3) {

            System.out.println("Enter number #" + counter + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (!isAnInt) {
                System.out.println("Invalid Number");
                scanner.next();

            } else {
                counter++;
                sum += scanner.nextInt();

            }

        }
        scanner.close();
        System.out.println(" Sum of all numbers is " + sum);

    }
}
