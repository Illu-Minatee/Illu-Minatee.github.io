/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presto;

/**
 *
 * @author kasul
 */
public class PrestoCard {
    
    // Private variables - only this class can access
    private String name;
    private double balance;
    
    /**
     * Constructor - Creates a new PrestoCard Object
     * @param name The cardholder's name
     * @param balance The initial balance
     */
    public PrestoCard(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
    /**
     * Getter method to access the cardholder's name
     * @return The cardholder's name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter method to access the card's current balance
     * @return The card's current dollar balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Tap method - deducts $2.50 fare from the card
     * @return true if tap was successful, false if insufficient funds
     */
    public boolean tap() {
        final double FARE = 2.50;
        
        // Check if enough funds are available
        if (balance >= FARE) {
            balance -= FARE;  // Deduct the fare
            return true;      // Successful tap
        } else {
            return false;     // Insufficient funds
        }
    }
    
    /**
     * Top-up method - adds money to the card's balance
     * @param amount The amount to add (minimum $1.00)
     */
    public void topUp(double amount) {
        if (amount >= 1.00) {  // Minimum top-up is $1.00
            balance += amount;
        }
    }
    
}
