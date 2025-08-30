/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: June 16, 2025
// App name: RandomNumberGenerator
// Description: 

package randomnumbergenerator;

import java.util.Random;
import java.util.Scanner;



public class RandomNumberGenerator {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final int MIN = 0, MAX = 5;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "Random Number Generator - Nischal Shrestha Kasula");

        // User input
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
       
        int randomNumber = random.nextInt(MIN, MAX);
        
        System.out.printf("Random number from %s  to %s is %s\n", MIN, MAX, randomNumber);
        
        
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}