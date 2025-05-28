/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 27, 2025
// App name: LabOne
// Description: 

package labone;

import java.util.Scanner;


public class LabOne {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
                                --==--=-=-=-=-=--=-=-=-=-=-==
                                  ASTROLOGICAL ZODIAC SIGNS
                                --==-=-=-=-=-=-=-=-=-=-=-=-==
                                 """;
    
    // Zodiac date constants
    static final int ARIES_START = 321, ARIES_END = 419;
    static final int TAURUS_START = 420, TAURUS_END = 520;
    static final int GEMINI_START = 521, GEMINI_END = 620;
    static final int CANCER_START = 621, CANCER_END = 722;
    static final int LEO_START = 723, LEO_END = 822;
    static final int VIRGO_START = 823, VIRGO_END = 922;
    static final int LIBRA_START = 923, LIBRA_END = 1022;
    static final int SCORPIO_START = 1023, SCORPIO_END = 1121;
    static final int SAGITTARIUS_START = 1122, SAGITTARIUS_END = 1221;
    static final int CAPRICORN_START = 1222, CAPRICORN_END = 119;
    static final int AQUARIUS_START = 120, AQUARIUS_END = 218;
    static final int PISCES_START = 219, PISCES_END = 320;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Set the title
        System.out.printf(SET_TITLE, "Zodiac Sign Finder - Nischal Shrestha Kasula");
        
        // User input
        Scanner scanner = new Scanner(System.in);
        
        // Variable declarations
        int month=0, day=0, date=0;
        boolean validInput = false;
        String zodiacSign = "";

        // Input validation loop
        do 
        {
        System.out.print(BANNER + "\nEnter your birth month and day (e.g., 5 20): ");
    
            try 
            {
            month = scanner.nextInt();
            day = scanner.nextInt();
            scanner.nextLine();
        
                if (month >= 1 && month <= 12 && day >= 1 && day <= 31) 
                {
                    validInput = true; // Input is valid
                } 
                else 
                {
                System.out.println("Error - Invalid date. Month must be between 1-12 and day must be between 1-31.");
                }
            } 
            catch (Exception e) 
            {
            System.out.println("Error - Please enter numeric values for month and day.");
            scanner.nextLine(); // Clear invalid input
            }

        } while (!validInput);
        
        // Convert date to integer format
        date = month * 100 + day;
        
        // Determine zodiac sign using integer comparisons
        if (date >= ARIES_START && date <= ARIES_END) zodiacSign = "Aries";
        else if (date >= TAURUS_START && date <= TAURUS_END) zodiacSign = "Taurus";
        else if (date >= GEMINI_START && date <= GEMINI_END) zodiacSign = "Gemini";
        else if (date >= CANCER_START && date <= CANCER_END) zodiacSign = "Cancer";
        else if (date >= LEO_START && date <= LEO_END) zodiacSign = "Leo";
        else if (date >= VIRGO_START && date <= VIRGO_END) zodiacSign = "Virgo";
        else if (date >= LIBRA_START && date <= LIBRA_END) zodiacSign = "Libra";
        else if (date >= SCORPIO_START && date <= SCORPIO_END) zodiacSign = "Scorpio";
        else if (date >= SAGITTARIUS_START && date <= SAGITTARIUS_END) zodiacSign = "Sagittarius";
        else if ((date >= CAPRICORN_START && date <=1231) || (date >= 101 && date <= CAPRICORN_END)) zodiacSign = "Capricorn";
        else if (date >= AQUARIUS_START && date <= AQUARIUS_END) zodiacSign = "Aquarius";
        else if (date >= PISCES_START && date <= PISCES_END) zodiacSign = "Pisces";

        // Output result
        System.out.println(CLEAR_TERMINAL + BANNER + "Your zodiac sign is: " + zodiacSign);
        
        // Print the corresponding ASCII art using if-else
        if (zodiacSign.equals("Aries")) {
            System.out.println(AsciiArts.ARIES);
        } else if (zodiacSign.equals("Taurus")) {
            System.out.println(AsciiArts.TAURUS);
        } else if (zodiacSign.equals("Gemini")) {
            System.out.println(AsciiArts.GEMINI);
        } else if (zodiacSign.equals("Cancer")) {
            System.out.println(AsciiArts.CANCER);
        } else if (zodiacSign.equals("Leo")) {
            System.out.println(AsciiArts.LEO);
        } else if (zodiacSign.equals("Virgo")) {
            System.out.println(AsciiArts.VIRGO);
        } else if (zodiacSign.equals("Libra")) {
            System.out.println(AsciiArts.LIBRA);
        } else if (zodiacSign.equals("Scorpio")) {
            System.out.println(AsciiArts.SCORPIO);
        } else if (zodiacSign.equals("Sagittarius")) {
            System.out.println(AsciiArts.SAGITTARIUS);
        } else if (zodiacSign.equals("Capricorn")) {
            System.out.println(AsciiArts.CAPRICORN);
        } else if (zodiacSign.equals("Aquarius")) {
            System.out.println(AsciiArts.AQUARIUS);
        } else if (zodiacSign.equals("Pisces")) {
            System.out.println(AsciiArts.PISCES);
        } else {
            System.out.println("No ASCII art available.");
        }


        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}