package com.company;

public class Titan {
    private String grenade = "Pulse";
    public String name;

    public Titan() {

    }
    public Titan(String name) {
        this.name = name;
    }

    public void castGrenade() {
        System.out.println("Casts " + grenade);
    }

    public static void main(String[] args) {
        Titan arc = new Warlock("Bryan");
    }
}
