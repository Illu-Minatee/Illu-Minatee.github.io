/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: June 12, 2025
// App name: Fibonacci
// Description: 

package ice_5;

import java.util.Scanner;


public class ICE_5 {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
                                ~~~~~~~~~~~~~~~~~~~~
                                 Fibonacci Sequence
                                ~~~~~~~~~~~~~~~~~~~~ 
                                 """;
        // User input
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * Ask for the max index of the Fibonacci series
     * @return 
     */
    
    static int askForMax()
    {   int max = 0;
        System.out.print("Enter a maximum index from 0-40 : ");
        
        try
        {
            max = Integer.parseInt(scanner.nextLine());
            
        }
        catch(Exception exception)
        {
            System.out.println("Not a number.");
            max = askForMax();
        }
        
        // Error in case max is negative or greater than 40
        if(max < 0 || max > 40)
        {    
            System.out.println("Error! Max should be a positive number up to 40.");
            max = askForMax();
        }   
        
        // Return the max index
        return max;
    }
    
    /**
     * return value in the fibonacci sequence at a given index
     * @param max 
     */
    static int fibonacci(int index)
    {
        if(index < 2 ) return index;
        
        return fibonacci(index - 1)+ fibonacci(index-2);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "Fibonacci - Nischal Shrestha Kasula");

        
        // Input Screen --------------------
        System.out.println(CLEAR_TERMINAL+BANNER);
        int max = askForMax();
        
        System.out.println("MAx is  "+max);
        
        
        // Output Screen --------------------
        System.out.println(CLEAR_TERMINAL+BANNER);
        
        // Go thororugh all indices from 0 to max
        for (int index = 0; index <= max; index++) 
        {
            System.out.print(fibonacci (index)+ " ");    
        }
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("\n\nEnter 'r' to restart: ");
        if(scanner.nextLine().equalsIgnoreCase("r")) main(args);
        scanner.close();
    }

}