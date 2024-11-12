package com.lalitha;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex06 {
    public static void main(String[] args) {
        HashSet<String> daysOfWeek = new HashSet<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        ArrayList<String> arrList = new ArrayList<>(daysOfWeek);
        System.out.println(arrList);
    }
}
