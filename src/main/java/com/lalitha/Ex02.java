package com.lalitha;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Sunday");
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");

        //Using for loop
        System.out.println("---------------Using for loop------------");
        for(String day : daysOfWeek){
            System.out.println(day);
        }

        //Using Iterator
        System.out.println("---------------Using Iterator------------");
        Iterator<String> iterator = daysOfWeek.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
