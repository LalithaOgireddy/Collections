package com.lalitha;

import java.util.HashMap;
import java.util.Map;

public class Ex10 {
    public static void main(String[] args) {
        HashMap<Integer, String> cars = new HashMap<>();
        cars.put(101,"Volvo");
        cars.put(102,"Maruti");
        cars.put(103,"Renault Nissan");

        for(Map.Entry<Integer, String> car : cars.entrySet()){
            System.out.println(car.getKey());
        }

    }
}
