package com.lalitha;

import com.lalitha.model.SuperHero;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge03 {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero(1, "Tony Stark", 40);
        SuperHero batMan = new SuperHero(2, "Wayne", 35);
        SuperHero thor = new SuperHero(3,"Thor odinson",90);
        SuperHero cap = new SuperHero(4,"Steve Rogers",110);

        ArrayList<SuperHero> superheroes = new ArrayList<>();
        superheroes.add(ironMan);
        superheroes.add(batMan);
        superheroes.add(thor);
        superheroes.add(cap);

        Collections.sort(superheroes);
        for(SuperHero hero : superheroes){
            System.out.println("ID: "+hero.getId()+", Name:"+hero.getName()+", Age:"+hero.getAge());
        }
    }
}
