package com.lalitha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ex07 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Lalitha");
        names.add("Dinesh");
        names.add("Abhiram");
        names.add("John");
        names.add("Doe");

        ArrayList<String> namesArr = new ArrayList<>(names);
        System.out.println("Before sorting Arraylist:"+namesArr);

        Collections.sort(namesArr);
        System.out.println("After sorting Arraylist:"+namesArr);

    }
}
