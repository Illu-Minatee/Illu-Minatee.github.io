/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 20, 2025
// App name: ICE_3
// Description: App that calculates how far the lightning strikes

package ice_3;

import java.util.Scanner;


public class ICE_3 {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final double SOUND_SPEED_MILES = 0.213 ;
    static final double SOUND_SPEED_KM = 0.342;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "Lightning Strike");

        // User input
        Scanner scanner = new Scanner(System.in);
        double seconds = 0;
        boolean valid = false;
        double distanceKM = 0;
        double distanceMiles = 0;
        
        // Execute at least once
        do {
            // Print the lightning strike from AsciiArt Class
            System.out.println(CLEAR_TERMINAL + AsciiArts.LIGHTNING);
            
            // Input---------------------------------------------
            System.out.println("Count how many seconds it takes tto hear the thunder after seeing the lightning strike!");
            
            
            do{
            System.out.print("Enter in seconds: ");
            //Validation
                try
                {
                seconds = Double.parseDouble(scanner.nextLine());
                valid = true;
                
                }
                catch (Exception exception)
                {
                valid = false;
                }
            // Error in case the number is not numeric or negative
            if(valid == false || seconds < 0 )
            {
                System.out.println("Error - Invalid Number");
                valid = false; // Not valid anymore!
            }   
                
            }while(valid==false);
            
            //Calculations
            distanceKM= seconds* SOUND_SPEED_KM;
            distanceMiles= seconds* SOUND_SPEED_MILES;
        
            // Output
            System.out.println(CLEAR_TERMINAL + AsciiArts.LIGHTNING);
            
            //In case the distance/seconds is 0.
            if(seconds == 0)
            {
                System.out.println("It struck You.");
        
            }
            // Otherwise shows the distance
            else
            {
                System.out.printf("The lightning struck is %.2f km / %.2f miles away from you!!!",
                distanceKM, distanceMiles);
                
            }
        
            
            //Restart if the user enters 'r'
            System.out.print("\n\nEnter 'r' to restart: ");       
        }while(scanner.nextLine().equalsIgnoreCase("r"));
        scanner.close();
    }

}