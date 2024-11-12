package com.lalitha;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Challenge02 {
    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("lalitha@gmail.com","Lalitha");
        hashmap.put("dinesh@gmail.com","Dinesh");
        hashmap.put("abhiram@gmail.com","Abhiram");

        HashSet<String> hashset = new HashSet<>();
        for(Map.Entry<String,String> k : hashmap.entrySet()){
            hashset.add(k.getKey());
        }
        System.out.println("Map : "+hashmap);
        System.out.println("Set : "+hashset);
    }
}
