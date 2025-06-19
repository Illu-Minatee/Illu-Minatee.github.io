/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockscissorspaper;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kasul
 */
public class Game 
{
    // User input
        static private Scanner scanner = new Scanner(System.in);
        static private Random random = new Random();
        static final int randomMax = 3, randomMin = 0;
        /**
         * Ask the player to choose either Rock, Paper or Scissors
         * @return a string with players choice
         */
        static public String getPlayersChoice()
        {
            System.out.print("Enter Rock, Paper or Scissors: ");
            String player = scanner.nextLine();
            
            // Error in case the player chooose an invalid option
            if (    !player.equalsIgnoreCase("rock")
                &&  !player.equalsIgnoreCase("paper")
                &&  !player.equalsIgnoreCase("scissors")) 
            {
                // Recursively ask the player to re-enter theri input
                System.out.println("Error - Invalid Option!!");
                return getPlayersChoice();
            }
            // Valid option
            return player;
        }
        
        
        /**
         * @return Either Rock, Paper or Scissors
         */
        public static String getAiChoice()
        {
            // 0 = rock
            // 1 = paper
            // 2 = scissors
            int aiChoice = random.nextInt(randomMin, randomMax);
            
            switch(aiChoice)
            {
                case 0: return "ROCK";
                case 1: return "PAPER";
                case 2: return "SCISSORS";
                default: return "ERROR!!";
            
            }
        }
        
        /**
         * recieve the player and AI's choice as parameters
         * compare them to know who wins
         * @return the winner
         */
        static public String getResult(String player, String ai)
        {
            // All conditions that he player wins
            if (    player.equalsIgnoreCase("rock") && ai.equalsIgnoreCase("scissors")
                 || player.equalsIgnoreCase("scissors") && ai.equalsIgnoreCase("paper")
                 || player.equalsIgnoreCase("paper") && ai.equalsIgnoreCase("rock") ) 
            {
                return"Player wins ";
            }
            
            // Draw
            else if(player.equalsIgnoreCase(ai))
            {
                return "Draww Bruh! Come onn!!";
            }
            
            // Ai wins
            else
            {
                return "AI ROCKS!!!";
            }
        }
        
        
        
    /**
     * Ask the user if they wanna replay the game
     * @return true if YES, false if NO
     */
    public static boolean askPlayAgain()
    {
        System.out.print("Wanna Replay the game ? (y/n): ");
        String input = scanner.nextLine();
        // In case the input is "y" and not "n"
        // Error and repeat the question
        if (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) 
        {
            System.out.print("Error! Enter either 'y'/'n': ");
            return askPlayAgain();
        }
        //Valid answer - true if y, n if false
        return input.equalsIgnoreCase("y");
    }
}
