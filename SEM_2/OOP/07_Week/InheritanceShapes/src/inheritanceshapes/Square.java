/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceshapes;

/**
 * Sub-class that inherits from the class shape
 * @author kasul
 */
public class Square extends Shape
{

    /**
     * Constructor - Make objects
     */
    Square( String name, double width, double height) 
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    
    /**
     * The area of the square
     * @return 
     */
    @Override
    double getArea()
    {
        return height * width;
    }
    
}
