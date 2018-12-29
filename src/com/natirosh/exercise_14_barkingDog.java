package com.natirosh;

/**
 * We have a dog that likes to bark. We need to wake up if the dog is barking at night!
 * Write a method bark that has 2 parameters.
 * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
 * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
 * We have to wake up if the dog is barking before 8:00 or after 22:00 which would return true.
 * In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.
 **/
public class exercise_14_barkingDog {
    public static void main(String[] args) {
        if (bark(true, 9)) {
            printAction(true);
        } else printAction(false);
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        return (barking && (hourOfDay < 8 || hourOfDay > 22));
    }

    public static void printAction(boolean barkAction) {
        if (barkAction) {
            System.out.println("Wake Up");
        } else {
            System.out.println("Go to sleep");
        }
    }
}

