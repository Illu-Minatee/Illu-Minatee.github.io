/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceshapes;

/**
 *Sub-class that inherits from the class shape
 * @author kasul
 */
public class Circle extends Shape

{
    
    /**
     * Constructor - Make objects
     */
    Circle( String name, double radius) 
    {
        this.name = name;
        this.radius = radius;
    }
    
    
    /**
     * The area of the circle
     * @return 
     */
    @Override
    double getArea()
    {
        return PI * Math.pow(radius, 2);
    }
    
    /**
     * This methods can be used by the sub- classes
     */
    
    @Override
    void printInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("--------------------------");
    }
}
