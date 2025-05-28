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
    /**
     * Prints text ending with a new line
     */
    
    static void print(String text)
    {
        System.out.println(text);
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "MethodsOverload - Nischal Shrestha Kasula");

        // User input
        Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}