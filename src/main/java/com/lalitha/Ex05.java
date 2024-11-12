package com.lalitha;

import java.util.HashSet;

public class Ex05 {
    public static void main(String[] args) {
        HashSet<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("SUNDAY");
        daysOfWeek.add("MONDAY");
        daysOfWeek.add("TUESDAY");
        daysOfWeek.add("WEDNESDAY");
        daysOfWeek.add("THURSDAY");
        daysOfWeek.add("FRIDAY");
        daysOfWeek.add("SATURDAY");

        System.out.println(daysOfWeek);

        HashSet<String> daysOfWeek2 = new HashSet<>();
        daysOfWeek2.add("Sunday");
        daysOfWeek2.add("Monday");
        daysOfWeek2.add("Tuesday");
        daysOfWeek2.add("Wednesday");
        daysOfWeek2.add("Thursday");
        daysOfWeek2.add("Friday");
        daysOfWeek2.add("Saturday");

        System.out.println(daysOfWeek2);
    }
}
