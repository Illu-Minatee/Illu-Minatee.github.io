/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package budget.tracker;

import java.time.LocalDate;

/**
 *
 * @author kasul
 */
public class transaction {
    
    
    
        // Private variables to hold the data for one transaction
    private String description;
    private double amount;
    private LocalDate date;
    private String category;

    /**
     * Constructor to create a new transaction object.
     */
    public transaction(String description, double amount, LocalDate date, String category) {
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    // --- GETTER METHODS ---
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    // --- SETTER METHODS ---
    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
}
