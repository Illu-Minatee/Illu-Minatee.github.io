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
    
    // User input
    static Scanner scanner = new Scanner(System.in);
    
    static String formatBanner(String title)
    {
        String middle = "= " + title + " =";
        String topBottom="";
        
            //for count in range(len(middle)):
            for(int count=0;count<middle.length();count++)
            {
                topBottom += "=";
            }
            //return the formatted banner
            return topBottom+"\n"+middle+"\n"+topBottom;
    }
    
    
    /**
     * Recreate the input() function from Python
     */
    static String input(String prompt)
    {
        System.out.print(prompt);
        return scanner.nextLine();
    
    }
    
    /**
     * Recreate print() from python
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
        System.out.printf(SET_TITLE, "MadLibs - Nischal Shrestha Kasula");

        
        
        // TODO code application logic here
        System.out.println(formatBanner("MadLibs - The amazing word game"));
        
        
        // Input screen
        String adjective = input("Enter an adjective: ");
        String adjective2 = input("Enter another adjective: ");
        String comparative = input("Enter a comparative adjective: ");
        String noun = input("Enter a singular noun: ");
        String nonPlural = input("Enter a Plural noun: ");
        String verb = input("Enter a verb in present tense: ");
        String quote = input("Enter a famous quote: ");
        
        //Output screen
        print(CLEAR_TERMINAL);
        print(formatBanner("Programming is "+adjective+"!"));
        
        print("When I code, I feel " + adjective2 + " and unstoppable.");
        print("It's " + comparative + " than solving a " + noun + " puzzle.");
        print("Every day, programmers face countless " + nonPlural + " and tackle them one step at a time.");
        print("I like to " + verb + " because it makes my code smarter.");
        print("Remember, \"" + quote + "\"—and never stop learning!");

        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}