package com.natirosh;

public class a6_forLoop_challenge_3_sum3and5 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                System.out.println(i);
                sum += i;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("The sum is: "+sum);

    }


}


