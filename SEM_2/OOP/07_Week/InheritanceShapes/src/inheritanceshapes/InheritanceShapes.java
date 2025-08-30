/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: July 02, 2025
// App name: InheritanceShapes
// Description: Practicing Class Inheritance

package inheritanceshapes;

import java.util.Scanner;


public class InheritanceShapes {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "InheritanceShapes - Nischal Shrestha Kasula");

        // User input
        Scanner scanner = new Scanner(System.in);
        
        // Create some shapes
        Square square = new Square("Square", 5, 5);
        Circle circle = new Circle("Ciecle", 10);
        Triangle triangle = new Triangle("Triangle", 5,5);
        
        // Print the shapes
        square.printInfo();
        circle.printInfo();
        triangle.printInfo();
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}