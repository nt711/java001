package com.natirosh;

public class a5_Methods_7_Seconds_Minutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(301, 22));

    }
    public static String getDurationString (int minutes, int seconds) {
        if ((minutes <0) || (seconds <0 || seconds >60)) {
            return "Invalid Value";
        }
        if (minutes >=60) {
//            minutes += hours % 60;
//            hours = minutes / 60;

        }
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
