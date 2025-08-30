 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritanceshapes;

/**
 *Sub-class that inherits from the class shape
 * @author kasul
 */
public class Triangle extends Shape
{
    
    /**
     * Constructor - Make objects
     */
    Triangle( String name, double width, double height) 
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    
    /**
     * The area of the triangle
     * @return 
     */
    @Override
    double getArea()
    {
        return width * height / 2;
    }
    
    
}
