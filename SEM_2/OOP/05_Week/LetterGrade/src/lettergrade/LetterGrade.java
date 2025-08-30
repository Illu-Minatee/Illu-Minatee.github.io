/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: June 16, 2025
// App name: LetterGrade
// Description: 

package lettergrade;

import java.util.Scanner;


public class LetterGrade {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
            =========================
             Letter Grade Converter
            =========================
            """;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "LetterGrade - Nischal Shrestha Kasula");

        // User input
        Scanner scanner = new Scanner(System.in);
        
        // Run the app at least once
        do {
            // Clear terminal and show banner
            System.out.println(CLEAR_TERMINAL + BANNER);

            // Get valid percentage (bonus method)
            float percentage = Grade.getPercentage(scanner);

            // Convert and get feedback
            String letter = Grade.getLetter(percentage);
            String feedback = Grade.getFeedback(letter);

            // Clear screen again and show results
            System.out.println(CLEAR_TERMINAL + BANNER);
            System.out.printf("A grade of %.2f%% is equivalent to %s which is considered \"%s\"!\n\n", 
                              percentage, letter, feedback);

            // Prompt to restart
            System.out.print("Enter 'r' to restart: ");
        } while (scanner.nextLine().equalsIgnoreCase("r"));
        
        
    }

}