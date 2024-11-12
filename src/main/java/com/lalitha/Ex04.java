package com.lalitha;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        List<String> newSubList = daysOfWeek.subList(0,3);
        System.out.println("New sub list is : "+newSubList);
    }
}
