/*

Program: Exercise5.java          Last Date of this Revision: September 18, 2026

Purpose: 

Author: Byron Hedges, 
School: CHHS
Course: Computer Programming 20

*/


package Mastery;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	
		//Declare Variables
	    float t;
	    float x;
	    float h;
	    
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
 
 */