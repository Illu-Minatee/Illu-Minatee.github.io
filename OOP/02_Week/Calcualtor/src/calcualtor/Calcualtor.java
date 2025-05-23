/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 21, 2025
// App name: Calcualtor
// Description: Practising Java Boolean COnditions and Operators

package calcualtor;

import java.util.Scanner;


public class Calcualtor {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
                                 -==--=-=-=-=-=--=-=-=--
                                  Arithmetic Calculator
                                 -==-=-=-=-=-=-=-=-=-=--
                                 
                                 Instructions:
                                 Enter a calculation using this format only. 
                                 number operator number
                                 e.g 2 + 6
                                 """;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "Calcualtor - Nischal Shrestha Kasula");
        
        // Variables
        float number1, number2, result=0;
        String operator;
        boolean divideBy0=false;

        // User input
        Scanner scanner = new Scanner(System.in);
        
       //Input screen
        System.out.print(BANNER+ "\nEnter the Calculation: ");
        // Get number operator number
        number1 = scanner.nextInt();
        operator = scanner.next();
        number2 = scanner.nextInt();
        // to get rid of extra inputs
        scanner.nextLine();
        
        
        // Calculations
        //----------------------------------
        switch(operator)
        {
            case "+":
                result = number1 + number2;
                break; // prevent going to the next case
                
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                if (number2 == 0)
                {
                    System.out.println("Can't divide by 0");
                    divideBy0 = true;
                }
                result = number1 / number2;
                break;
            
            //Executed when all of the above is false
            default:
                System.out.printf("Error - %s is not a valid operator.\n", operator);
                divideBy0 = true; // so that it doesn't show calculations
        
        }
        
        
        
        
        //Output!!!!!!!!
        
        if(!divideBy0)
        {
            System.out.println(CLEAR_TERMINAL + BANNER);
            System.out.printf("Clc: %s %s %s = %s\n", number1, operator, number2, result);
        }
       
       
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("\nPress [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}
