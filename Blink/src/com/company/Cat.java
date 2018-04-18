package com.company;

public class Cat extends Animal {
    private String favToy = "Yarn";

    public void playWith() {
        System.out.println("Yay " + favToy);
    }

    public void walksAround() {
        System.out.println(this.getName() + " stalks around.");
    }

    public Cat() {

    }

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, String favFood) {
        super(name, favFood);
    }
}
