package com.lalitha;

import java.util.ArrayList;

public class Ex03 {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        System.out.println("Initial list:"+daysOfWeek);

        daysOfWeek.add(4,"Thursday");

        System.out.println("Final  list:"+daysOfWeek);

    }
}
