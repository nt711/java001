package com.natirosh;

public class a6_digit_sum_challenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(71));
    }
    private static int sumDigits (int number){
        if (number <10) {
            return -1;
        }
        int sum = 0;
        int lastDigit = 0;
        while (number >=10) {
            lastDigit = number % 10;
            number = number / 10;
            sum += lastDigit;
        }

        return sum + number;
    }
}
