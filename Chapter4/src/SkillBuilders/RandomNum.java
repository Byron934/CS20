package SkillBuilders;

import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
	
		//Declare Variables
        int min, max;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the minimum value
		System.out.print("Please enter enter any integer: ");
		
		//Get the min from the user
		min = userinput.nextInt();	
	
		//Ask the user to enter the maximum value
		System.out.print("Please enter enter any integer greater than the previous integer: ");
		
		//Get the grade from the user
		max = userinput.nextInt();
		
		//Generate the random number (0.0 - 1.0)
		System.out.print("Random Number: " + (int) ((max - min +1) * Math.random() + min));
	}

}
