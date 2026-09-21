/*

Program: Exercise1.java          Last Date of this Revision: September 21, 2026

Purpose: Create an application that can display the height of an object at any given time 
that was dropped from a starting height of 100 meters and is accelerating downwards 
at 4.9 meters per second squared.

*/


package Mastery;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
	
		//Declare Variables
	    float t, x, h;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the time
		System.out.print("Please enter a time less than 4.5s: ");
		
		//Get the grade from the user
		t = userinput.nextFloat();
		
		//Calculate t^2 first and then the height based on the given time
		x = t*t;
		h = 100 -4.9f*x;
		
		//Display the height for the user
		System.out.println("The height of the object is: " + h +"m");
		
	}

}

/* Screen Dump
 
Please enter a time less than 4.5s: 1.5
The height of the object is: 88.975m


Please enter a time less than 4.5s: 3.7
The height of the object is: 32.919m
 
 */

