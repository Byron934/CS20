package SkillBuilders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {

		//Declare variables for each dimension to be entered
		int length, width, height;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt the user to enter the length
		System.out.print("Please enter the length of the package (less then 10): ");
		
		//Get the length from the user
		length = userinput.nextInt();
		
		//Prompt the user to enter the length
		System.out.print("Please enter the width of the package (less then 10): ");
		
		//Get the width from the user
		width = userinput.nextInt();
		
		//Prompt the user to enter the length
		System.out.print("Please enter the height of the package (less then 10): ");
		
		//Get the height from the user
		height = userinput.nextInt();
		
		//Display whether or not each dimension is accepted (less than or equal to 10)
		if (length <= 10) {
			 System.out.println("Length is accepted");
		} else {
		    System.out.println("Length is rejected");
		}
		
		if (width <= 10) {
			 System.out.println("Width is accepted");
		} else {
		    System.out.println("Width is rejected");
		}
		
		if (height <= 10) {
			 System.out.println("Height is accepted");
		} else {
		    System.out.println("Height is rejected");
		}
		
		}

	}
