package com.lalitha;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex08 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Lalitha");
        names.add("Dinesh");
        names.add("Abhiram");
        names.add("John");
        names.add("Doe");

        Set<String> sortedSet = new TreeSet<>(names);

        System.out.println("Sorted tree set:"+sortedSet);

    }
}
