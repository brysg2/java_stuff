package com.company;

public class Animal {
    private String name = "Animal";
    private String favFood = "Food";

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String favFood) {
        this(name);
        this.favFood = favFood;
    }

    public void walksAround() {
        System.out.println(this.name + " walks around.");
    }

    public void eatsFavFood() {
        System.out.println(this.name + " eats " + this.favFood);
    }

    public String getName() {
        return name;
    }

}
