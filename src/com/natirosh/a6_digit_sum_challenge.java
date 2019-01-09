package com.natirosh;

public class a6_digit_sum_challenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-1234));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(123456789));

    }
    private static int sumDigits (int number){
        if (number <10) {
            return -1;
        }
        int sum = 0;
        while (number >0) {
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
}
