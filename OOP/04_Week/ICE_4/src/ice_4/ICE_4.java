/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 26, 2025
// App name: ICE_4
// Description: 

package ice_4;

import java.util.Scanner;


public class ICE_4 {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    /**
     * title: " Nischal "
     * ===========
     * = Nischal =
     * ===========
     */
    static String topBottom="";
    // User input
    static Scanner scanner = new Scanner(System.in);
    static String formatBanner(String title)
    {
    String middle = "= "+ title + " =";
        for(int count=0;count<middle.length();count++ )
        {
        topBottom += "=";
        }
        return topBottom+"\n"+middle+"\n"+topBottom;
    }
    
    
    /**
     * Recreate the input() function from Python
     */
    static String input(String prompt)
    {
        System.out.print(prompt);
        
    
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "MadLibs - Nischal Shrestha Kasula");

        
        
        // TODO code application logic here
        System.out.println(formatBanner("MadLibs - The amazing word game"));
        
        
        // Input screen
        
        
        
        //Output screen
        
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}