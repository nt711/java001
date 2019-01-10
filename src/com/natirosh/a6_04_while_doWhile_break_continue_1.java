package com.natirosh;

public class a6_04_while_doWhile_break_continue_1 {
    public static void main(String[] args) {
        //while loop:
        //no semicolon, will run only if condition true, counter needs to be declared outside the loop.
        int a =0;
        while (a <10) {
            a++;
            System.out.println(a);
        }
        //do while:
        //runs at leas one, condition only at the end, semicolon only after the while condition at rhe end.
        a = 0;
        do {
            a++;
            System.out.println(a);
        } while (a <10);

        //continue: the loop will stop running the code and will CONTINUE with next iteration
        //break: the loop will stop running the code and will BREAK the look to the code after the loop.


    }
}
