package com.lalitha;

import java.util.ArrayList;

public class Challenge01 {
    public static void main(String[] args) {
        ArrayList<String> allDays = new ArrayList<>();
        allDays.add("Sunday");
        allDays.add("Monday");
        allDays.add("Tuesday");
        allDays.add("Wednesday");
        allDays.add("Thursday");
        allDays.add("Friday");
        allDays.add("Saturday");

        System.out.println("First Arraylist: "+allDays);

        ArrayList<String> weekEnd = new ArrayList<>();
        weekEnd.add("Saturday");
        weekEnd.add("Sunday");

        System.out.println("Second list: "+weekEnd);

        allDays.retainAll(weekEnd);
        System.out.println(allDays);

        System.out.println("First list after retaining only second list elements: "+allDays);

    }
}
