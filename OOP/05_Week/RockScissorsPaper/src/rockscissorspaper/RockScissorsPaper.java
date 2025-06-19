/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: June 16, 2025
// App name: RockScissorsPaper
// Description: 

package rockscissorspaper;

public class RockScissorsPaper {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
                                ======================
                                 Rock PAPERS SCISSORS
                                ====================== 
                                 """;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "RockScissorsPaper - Nischal Shrestha Kasula");

        // Run the game at least once
        do 
        {
            System.out.println(CLEAR_TERMINAL + BANNER);
            String player = Game.getPlayersChoice();
            String ai = Game.getAiChoice();
            
            
            // Output Screeen 
            System.out.println(CLEAR_TERMINAL + BANNER);
                // get result and show it
                String result = Game.getResult(player, ai);
                System.out.printf("%s VS %s = %s\n\n", player,ai,result);
            
            // Ask if the player wants to replay the game
            
        } 
        while (Game.askPlayAgain());      
       
    }

}