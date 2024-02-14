

package com.mycompany.numbergame;

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5; // Limiting the number of attempts
        int rounds = 0;
        int totalAttempts = 0;
        int totalRoundsWon = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        
        // Game loop for multiple rounds
        while (true) {
            rounds++;
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            
            System.out.println("Round " + rounds + ":");
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");
            
            // Guessing loop for each round
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (Attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
                int userGuess = scanner.nextInt();
                attempts++;
                totalAttempts++;
                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + generatedNumber);
                    totalRoundsWon++;
                    break; // Break out of guessing loop if the number is guessed correctly
                } else if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try guessing a higher number.");
                } else {
                    System.out.println("Too high! Try guessing a lower number.");
                }
            }
            
            // If the user couldn't guess the number within the attempts limit
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + generatedNumber);
            }
            
            // Ask if the user wants to play another round
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.next();
            
            if (!playAgain.equalsIgnoreCase("yes")) {
                break; // Break out of the game loop if the user doesn't want to play another round
            }
        }
        
        // Displaying the user's score
        System.out.println("Game Over!");
        System.out.println("Total rounds played: " + rounds);
        System.out.println("Total rounds won: " + totalRoundsWon);
        System.out.println("Total attempts made: " + totalAttempts);
        
       
    }
}


