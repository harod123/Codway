/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atminterface;

import java.util.Scanner;

/**
 *
 * @author prade
 */
public class AtmInterface {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Bank");
        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        while (true) {
            atm.displayMenu();
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
