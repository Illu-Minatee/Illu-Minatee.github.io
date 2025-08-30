/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 27, 2025
// App name: MethodsOverload
// Description: 

package methodsoverload;

import java.util.Scanner;


public class MethodsOverload {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String SET_COLOR = "\033[%sm";
    
    static final int DARK_COLOR = 30;
    static final int BRIGHT_COLOR = 90;
    static final int RESET_COLOR = 0;
    // User input
    static Scanner scanner = new Scanner(System.in);
    
    /**
     * Prints text ending with a new line
     */
    
    static void print(String text)
    {
        System.out.println(text);
    }    
    
    
    /**
     * Print a colored text ending with a new line
     * @parm text The text to be printed
     * @param color Color of the text
     */
    static void print(String text, int color)
    {
        System.out.printf(SET_COLOR, color);
        print(text);
        System.out.printf(SET_COLOR, RESET_COLOR);
    }
    
    /**
     * Print a colored text ending with a new line
     * @parm text The text to be printed
     * @param color Color of the text
     */
    static void print(String text, int color, int intensity)
    {
        System.out.printf(SET_COLOR, color + intensity);
        print(text);
        System.out.printf(SET_COLOR, RESET_COLOR);
    }
  
    /**
     * Print a colored text and background ending with a new line
     * @parm text The text to be printed
     * @param foreColor Color of the text
     * @param backColor Color of the background
     */
    static void print(String text, int foreColor, int foreIntensity,
            int backColor, int backIntensity)
    {
        System.out.printf(SET_COLOR, foreColor + foreIntensity);
        System.out.printf(SET_COLOR, backColor+10 + backIntensity);
        print(text);
        System.out.printf(SET_COLOR, RESET_COLOR);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "MethodsOverload - Nischal Shrestha Kasula");

        // Input
        
        print(" Method Overloads ", 
                Color.CYAN.ordinal(),BRIGHT_COLOR, 
                Color.BLUE.ordinal(), DARK_COLOR);
        
        print("\nAll 16 terminal colors!!!", Color.BLUE.ordinal(), BRIGHT_COLOR);
        
        for (int code = 30; code < 38; code++) 
        {
            print("Color code: "+code,code);
        }
        
        for (int code = 90; code < 98; code++) 
        {
            print("Color code: "+code,code);
        }
        
        // Exit prompt - So the terminal doesn't close in our faces!
        print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}