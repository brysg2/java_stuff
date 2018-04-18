package com.company;

import java.util.Scanner;

public class Blink implements Skills {
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getRandomNum());

        int guessResult = 1;
        int randomGuess;

        while(guessResult != -1) {
            System.out.print("Guess a number between 0 and 50: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }

    }

    public static int getRandomNum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guess) {
        if (guess == randomNumber) {
            return -1;
        } else {
            return guess;
        }
    }

    int level = 50;

    public void getInfo() {
        System.out.println(level);
    }
}

