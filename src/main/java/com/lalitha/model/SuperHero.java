package com.lalitha.model;

public class SuperHero implements Comparable<SuperHero> {
    private int id;
    private String name;
    private int age;

    public SuperHero(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(SuperHero hero) {
        if(age > hero.age){
            return 1;
        } else if(age < hero.age){
            return -1;
        }else return 0;
    }
}
