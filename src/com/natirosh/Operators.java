package com.natirosh;

public class Operators {

    public static void main(String[] args) {
        System.out.println("Operators section 7.1");
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less the  100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

    }
}
