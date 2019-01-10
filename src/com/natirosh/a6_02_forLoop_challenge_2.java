package com.natirosh;

public class a6_02_forLoop_challenge_2 {
    public static void main(String[] args) {

        int count = 0; // need to define the count out of the loop otherwise it will be reseated all over...
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++; // it is preferred to increment the count as soon as you meet the state
//                System.out.println("count is: " + count);
                System.out.println("Number " + i + " is a prime number");
                if (count == 10) {
                    break;
                }

            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
