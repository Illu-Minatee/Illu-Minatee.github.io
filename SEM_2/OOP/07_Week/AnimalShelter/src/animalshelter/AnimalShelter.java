/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Name: Nischal Shrestha Kasula
// Student ID: 100995481
// Date: July 02, 2025
// App name: AnimalShelter
// Description: 

package animalshelter;

import java.util.Scanner;


public class AnimalShelter {
    
    // Constants
    static final String CLEAR_TERMINAL = "\033c";
    static final String SET_TITLE = "\033]0;%s\007";
    static final String BANNER = """
                                 `-:-.   ,-;"`-:-.   ,-;"`-:-.   ,-;"`-:-.   ,-;"
                                    `=`,'=/     `=`,'=/     `=`,'=/     `=`,'=/
                                      y==/        y==/        y==/        y==/
                                    ,=,-<=`.    ,=,-<=`.    ,=,-<=`.    ,=,-<=`.
                                 ,-'-'   `-=_,-'-'   `-=_,-'-'   `-=_,-'-'   `-=_
                                 
                                 """;
    static Scanner scanner = new Scanner(System.in);
    
    
    /**
     * Create a new object of the class Animal
     * @return an animal object
     */
    static public Animal registerAnimal()
    {
        System.out.println(CLEAR_TERMINAL + BANNER);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
    
        System.out.print("Enter "+ name +" species: ");
        String species = scanner.nextLine();
        
        System.out.print("Enter "+ name +" breed: ");
        String breed = scanner.nextLine();
        
        System.out.print("Enter "+ name +" colour: ");
        String colour = scanner.nextLine();
        
        System.out.println("\n " + name + " has been successfully registered!\n");
        System.out.print("Press [enter] to continue: ");
        scanner.nextLine(); // Pause so message doesn't vanish
        
        
        // make and return a new animal
        return new Animal(name, species, breed, colour); 
    }
    
    
    /**
     * Prints all information of a certain animal
     * @param animal 
     */
    static public void printData(Animal animal)
    {
        System.out.println("Name: "+animal.name);
        System.out.println("Species: "+animal.species);
        System.out.println("Breed: "+animal.breed);
        System.out.println("Colour: "+animal.colour);
        System.out.println("-------------------------------");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set the title
        System.out.printf(SET_TITLE, "AnimalShelter - Nischal Shrestha Kasula");

        
        
        // Register 3 new animals
        Animal animal1 = registerAnimal();
        Animal animal2 = registerAnimal();
        Animal animal3 = registerAnimal();
        
        //Output Screen
        System.out.println(CLEAR_TERMINAL + BANNER);
        
        // Print info of all three animals
        printData(animal1);
        printData(animal2);
        printData(animal3);
        
        // Exit prompt - So the terminal doesn't close in our faces!
        System.out.print("Press [enter] to exit: ");
        scanner.nextLine();
        scanner.close();
    }

}