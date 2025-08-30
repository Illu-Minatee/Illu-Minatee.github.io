/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: July 08, 2025
// App name: HorseRace
// Description: 

package horserace;

import java.util.Scanner;


public class HorseRace {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final int HALF_SECOND = 500;
    static final int FINISH_LINE = 20;
    static final String BANNER = """
                                 
                                                    #    #          Y8baad8888888888ba,_
                                               %%% ##   ##        aaad88888888888888888888b,
                                            %%%%% ###%%###        `Y8888888888888888888888888b,
                                           %%%%% ### %%% #          `"8888888888888888888888888ba,
                                         %%%%%% ### %%% ###            Y888( )888888888888888888888ba, 
                                          %%%% ## %% #######           `Y888888888888888888888888888888ba,
                                         %%%%% # %% #O#####              `Y88888888888888888888888888888888888888888888888888888888888888888b,
                                       %%%%%% # % #########                 Y88888888'888888888888888888888888888888888888888888888888888=88888b
                                      %%%%% ##### #########                 `88888888 88888888888888888888888888888888888888888888888888888=8888I
                            ###        %% ####### #########                  Y8"88888 888888888888888888888888888888888888888888888888888888=888b
                   %%% ############    ########### ########                   Y88888P 888888888888888888888888888888888888888888888888888888=8888
                %%%% ############################### #######                  \\8888  88888888888888888888888888888888888888888888888888888=8888
              %%%%% ################################## ######                        (88888888888888888888888888888888888888888888888888888=8888
            %%%%%% #################################### #C###                        `88888888888888888888888888888888888888888888888888888=888(
           %%%%%% #####################################  ###                          `888888888888888888888888888888888888888888888888888=8888I
           %%%%% #######################################                                d88888888888888888888888888888888888888888888888888=8888I
          %%%%%% ########################################                              ,d888888PY88888888888P"Y888888P"88888888888888888888=88888(
       % %%%%%%% ########################################                             d888888P'  Y8888888888'           888888888888888888=8888888
        %%%%%%%%% #######################################                             d88888P"    `Y888888888            I8888888"Y88888888=8888888
       %%%%%%%%%% ########################################                            d88888(,      `Y8888888P            `888888P  `Y888888 Y88888P
    %%% %%%%%%%%   ###### ################################                            `Y88888b,      `Y888888I             888888'   `888888  `\\888
      %%%%%%%%      ###### #################### ##########                              `Y88888b,  __ `888888'            ,88888P     888888
   % %%%%%%%%        ####### ########### ###### ##########                                `Y88888bd88b `88888             I88888'     Y88888
    %%%%%%%%%         #######  ########### ###### ########                                  `Y88888888b 88888             88888P      `88888
   %%%%%%%%%%          ##### ###  ######### ####### ######                                    `Y888888888888P            d8888P'       88888,
    %%%%%%%%%%          #### ##               ####### ####                                       `\\99,d8888I        ,ad888888'        Y8888I
    %%%%%%%%%%%           ## #                  ##### ###                                         ,a8888888'       d888888P'         ,d88888
     %%  %% % %%         # ##                      ## ###                                       d8888888'         88888888       ,d8888888P
       %   %    %        # ###                      # ###                                       88888888                         88888888'                             
                          # ###                     ## ###                                                  
                          # ###                     ## ###                                                  
                          # ####                   #### ##                                                  
                         ### ###                  ##### ###                                                 
                        ####  ###                 ####   ##                                                 
                       #####   ###                 ##    ##                                                 
                      #####    ####                      ###                                                
                       ##        ###                     ###                                                
                                  ####                     ##                                                
                                   ####                    ###                                                
                                                           ####                                                
                                                            ##
                                   
        ================
           Horse Race
        ================                                 """;

    
    /**
     * Waits for half a second
     */
    static void waitHalfSecond() {
        try {
            Thread.sleep(HALF_SECOND);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted.");
        }
    }

    /**
     * Prints the horse's progress as dotted line
     */
    static void printDottedLine(Horse horse) {
        
        for (int i = 0; i < horse.getDistanceCovered(); i++) {
            System.out.print(".");
        }
        System.out.println(" " + horse.getName());
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "HorseRace - Nischal Shrestha Kasula");

        // User input
        Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        
       // Create horses
       Horse[] horses = {
            new Horse("Shadowfax"),
            new Horse("Epona"),
            new Horse("Roach"),
            new Horse("Bucephalus"),
            new Horse("Spirit")
        };

        boolean racing = true;

        // Race loop
        while (racing) {
            System.out.print(CLEAR_TERMINAL + BANNER +"\n\n");

            // Each horse runs and prints progress
            for (Horse horse : horses) {
                horse.run();
                printDottedLine(horse);
            }

            // Check for winner(s)
            for (Horse horse : horses) {
                if (horse.getDistanceCovered() >= FINISH_LINE) {
                    racing = false;
                }
            }

            waitHalfSecond();
        }

        // Declare winners
        System.out.println();
        for (Horse horse : horses) {
            if (horse.getDistanceCovered() >= FINISH_LINE) {
                System.out.println(horse.getName() + " wins!");
            }
        }

        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}