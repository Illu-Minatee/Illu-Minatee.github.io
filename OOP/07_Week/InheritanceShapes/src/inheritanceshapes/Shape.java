/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceshapes;

/**
 * Super Class - Meant to be inherited
 * @author kasul
 */
public abstract class Shape 
{
    // Constants
    final double PI = Math.PI;
    
    // Vairbales - also available in the sub-classes
    String name;
    double width, height, radius;

    // Will be implemented in the sub-classes
    abstract double getArea();
    
    /**
     * This methods can be used by the sub- classes
     */
    void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("--------------------------");
    }
    
}
