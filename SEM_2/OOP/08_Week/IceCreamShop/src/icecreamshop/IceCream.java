/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icecreamshop;

/**
 * A template to create Ice Cream objects
 * @author kasul
 */
public class IceCream 
{

    // Private - only this class can access
    private String name;
    private double price;

    
    /**
     * Constructor - Creates a new IceCream Object
     * @param name
     * @param price 
     */
    public IceCream(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * 
     * @return Flavour's name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return Flavour's price 
     */
    public double getPrice() {
        return price;
    }
    
}
