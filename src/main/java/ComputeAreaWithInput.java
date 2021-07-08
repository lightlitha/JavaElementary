/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner; // Scanner is in the java.util package (Can Use For Input)

/**
 *
 * @author faceless
 */
public class ComputeAreaWithInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Scanner Object
        
        // User Prompt
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        
        // Compute
        double area = radius * radius * 3.14159;
        
        // Output
        System.out.println("The Area of the circle of radius " + radius + " is " + area);
    }
}
