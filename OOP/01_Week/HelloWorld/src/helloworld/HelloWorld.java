/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: 2025/05/13
// Description: A simple Hello World program
package helloworld;

import java.util.Scanner;

/**
 *
 * @author kasul
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final String SET_TITLE = "\033]0;TITLE TITLE\007";
        System.out.println(SET_TITLE);
        // TODO code application logic here
        // Scanner - gets the user input 
        Scanner scanner = new Scanner(System.in);
        
        // TODO code application logic here
        System.out.println("Hello World");
        
        //Exit prompt So that the terminal doesnt close to our faces.
        System.out.print("Press [Enter] to exit: ");
        scanner.nextLine();
    }
    
}
