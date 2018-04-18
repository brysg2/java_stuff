package com.company;
import java.util.Scanner;

public class Hanabi {
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println(getRandomNumber());
        int guessResult = 1;
        int randomGuess;

        while (guessResult != -1) {
            System.out.print("Guess the random number: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);

        }

    }

    public static int getRandomNumber() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guessNum) {
        if (guessNum == randomNumber) {
            return -1;
        } else {
            return 1;
        }

    }
}
