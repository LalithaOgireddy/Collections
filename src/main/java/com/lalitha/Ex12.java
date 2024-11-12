package com.lalitha;

import com.lalitha.model.Car;

import java.util.HashMap;
import java.util.Map;

public class Ex12 {
    public static void main(String[] args) {
        HashMap<Integer,Car> cars = new HashMap<>();
        Car car1 = new Car(101,"Volvo","CD1");
        Car car2 = new Car(102,"Toyota","Fortuner");
        Car car3 = new Car(103,"Renault","S23");

        cars.put(car1.getId(),car1);
        cars.put(car2.getId(),car2);
        cars.put(car3.getId(),car3);

        for(Map.Entry<Integer, Car> car: cars.entrySet()){
            System.out.println(car.getValue().getBrand());
        }
    }
}
