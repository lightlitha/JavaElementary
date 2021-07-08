/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author faceless
 */
public class ComputeArea {
    public static void main(String[] args){
        double radius;
        double area;
        // Step 1: assign a radius
        radius = 20;
        // Step 2: Compute area
        area = radius * radius * 3.14159;
        // Step 3: Display the area
        System.out.println("The Area of the circle of radius " + radius + " is " + area);
    }
}
