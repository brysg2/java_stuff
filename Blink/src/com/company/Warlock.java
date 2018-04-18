package com.company;

public class Warlock extends Titan {
    private String grenade = "Pulse";
    public String name;

    public Warlock(String name) {
        this.name = name;
    }

    public void castGrenade() {
        System.out.println("Casts " + grenade);
    }

}

