/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lettergrade;

import java.util.Scanner;

/**
 *
 * @author kasul
 */
public class Grade 
{
    /**
     * BONUS: Recursively gets a valid percentage from the user
     * @param scanner The Scanner object passed from main
     * @return A float between 0.0 and 100.0
     */
    public static float getPercentage(Scanner scanner) {
        System.out.print("Enter your grade percentage: ");
        String input = scanner.nextLine();

        try {
            float percentage = Float.parseFloat(input);
            if (percentage < 0 || percentage > 100) {
                System.out.println("Error - Grade percentage must be between 0 and 100 percent!");
                return getPercentage(scanner);
            }
            return percentage;
        } catch (NumberFormatException e) {
            System.out.println("Error - Grade percentage must be numeric!");
            return getPercentage(scanner);
        }
    }

    /**
     * Converts a percentage into a letter grade based on Durham grading system
     * @param percentage The numeric grade
     * @return The corresponding letter grade (e.g. A+, B-, F)
     */
    public static String getLetter(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 85) return "A";
        else if (percentage >= 80) return "A-";
        else if (percentage >= 75) return "B+";
        else if (percentage >= 70) return "B";
        else if (percentage >= 65) return "B-";
        else if (percentage >= 60) return "C";
        else if (percentage >= 55) return "D+";
        else if (percentage >= 50) return "D-";
        else return "F";
    }

    /**
     * Provides feedback based on a letter grade
     * @param letterGrade The letter grade
     * @return A string of feedback
     */
    public static String getFeedback(String letterGrade) {
        switch (letterGrade) {
            case "A+": return "Outstanding";
            case "A": return "Exemplary";
            case "A-": return "Excellent";
            case "B+": return "Very Good";
            case "B": return "Good";
            case "B-": return "Satisfactory";
            case "C": return "Acceptable";
            case "D+": return "Conditional Pass";
            case "D-": return "Conditional Pass";
            case "F": return "Fail";
            default: return "Invalid Grade";
        }
    }

    
}
