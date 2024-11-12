package com.lalitha;

import java.util.HashMap;
import java.util.Map;

public class Ex09 {
    public static void main(String[] args) {
        HashMap<Integer,String> cars = new HashMap<>();
        cars.put(100,"Volvo");
        cars.put(101,"Kia");
        cars.put(102,"Toyoto");

        for(Map.Entry<Integer, String> car : cars.entrySet()){
            System.out.println("ID:"+car.getKey()+" Car:"+car.getValue());
        }
    }
}
