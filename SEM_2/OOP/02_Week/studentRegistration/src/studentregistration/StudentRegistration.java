/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: May 21, 2025
// App name: StudentRegistration
// Description: Practicing  basic Input/Output and datatypes

package studentregistration;

import java.util.Scanner;


public class StudentRegistration {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER ="""
                                ----------------------
                                 Student Registration
                                ----------------------
                                """;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "StudentRegistration - Nischal Shrestha Kasula");
        
        //Printing the Banner
        System.out.println(BANNER);
        
        //------------------------------------
        // User input screen
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name:  ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your course name:  ");
        String courseName = scanner.nextLine();
        
        System.out.print("Enter your course duration in semesters:  ");
        int duration = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter your current semester:  ");
        int currentSemester = Integer.parseInt(scanner.nextLine());
        
        
        // Output Screen
        System.out.println(CLEAR_TERMINAL + BANNER);
        
        System.out.println("Name: " + name);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course duration: " + duration + " semesters");
        System.out.printf("Current semester: %s \n", currentSemester );
        System.out.printf("%s semesters is left bruh!\n\n ", duration-currentSemester);
        
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}
