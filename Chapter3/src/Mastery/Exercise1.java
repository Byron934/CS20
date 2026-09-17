package Mastery;

import java.util.Scanner;

public class Exercise1 {

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
		t = userinput.nextInt();
		
		//Calculate t^2 first and then the height based on the given time
		x = t*t;
		h = 100 -4.9*x;
		
		//Display the height for the user
		System.out.println("The height of the object is: " + h);
		
	}

}
