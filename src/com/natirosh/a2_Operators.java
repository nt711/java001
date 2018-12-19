package com.natirosh;

public class a2_Operators {

    public static void main(String[] args) {
        System.out.println("a2_Operators section 7.1");
        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less the  100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if(newValue ==50)
            System.out.println("This is true");
        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not supposed to happened");

/*challenge:
 * 1. create a double veriable with the value of 20
 * 2. create additional with value ot 80
 * 3. add both numbers and multiply by 25
 * 4. check what is the reminder from last calc divided by 40
 * 5. if the reminder is less or equal to 40 write a message 'total is over the limit'
 */
        double verDouble1 = 20d;
        double verDouble2 = 80d;
        double summary = (verDouble1 + verDouble2)* 25;
        double reminder = summary % 40;
        System.out.println("reminder is: " + reminder );
        if(reminder <= 20)
            System.out.println("Total is over the limit");
        }


}
