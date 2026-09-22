/*

Program: Exercise1.java          Last Date of this Revision: September 22, 2026

Purpose: Create an application that can display the height of an object at any given time 
that was dropped from a starting height of 100 meters and is accelerating downwards 
at 4.9 meters per second squared.

*/


package Mastery;

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
	
		//Declare variables for time, time to the power of 2, and the height of the object
	    float time, timeSquared, height;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt the user to enter the time
		System.out.print("Please enter a time less than 4.5s: ");
		
		//Get the grade from the user
		time = userinput.nextFloat();
		
		//Calculate t^2 first and then the height based on the given time
		timeSquared = time*time;
		height = 100 -4.9f*timeSquared;
		
		//Display the height in meters for the user
		System.out.println("The height of the object is: " + height +"m");
		
	}

}

/* Screen Dump
 
Please enter a time less than 4.5s: 1.5
The height of the object is: 88.975m


Please enter a time less than 4.5s: 3.7
The height of the object is: 32.919m
 
 */

