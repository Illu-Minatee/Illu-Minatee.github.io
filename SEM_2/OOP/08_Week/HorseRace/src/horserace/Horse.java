/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horserace;

import java.util.Random;

/**
 *
 * @author kasul
 */
public class Horse 
{
    // Private variables
    private String name;
    private int distanceCovered = 0;
    private Random random = new Random();

    /**
     * Constructor - Initializes horse with a name
     */
    public Horse(String name) {
        this.name = name;
    }

    /**
     * Accessor for name
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for distance covered
     */
    public int getDistanceCovered() {
        return distanceCovered;
    }

    /**
     * Simulates the horse running by randomly adding 0 or 1
     */
    public void run() {
        distanceCovered += random.nextInt(2); // 0 or 1
    }


    
}
