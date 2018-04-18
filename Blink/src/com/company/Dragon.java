package com.company;

public class Dragon {
    public String name;
    private int health;
    private String specialAttack;
    boolean gameOver = false;
    private double x = 0.0;
    private double y = 0.1;

    public Dragon(String name, int health, String specialAttack) {
        this.name = name;
        this.health = health;
        this.specialAttack = specialAttack;
    }

    public int takeDamage(int damageTaken) {
        int totalDamage = this.health - damageTaken;
        return totalDamage;

    }
    
    public void moveUp() {
        x += 0.5;
        y += 1.0;
    }

    public boolean gameOver() {
        if (health <= 0) {
            gameOver = true;
        }
    }




    public static void main(String[] args) {
        Dragon blink = new Dragon("Blink", 100, "Frostbolt");
        Dragon jenasaur = new Dragon("Jenasaur", 1000, "Arcane Missles");

        System.out.println(blink.takeDamage(50));
    }
}
