package SkillBuilders;

import java.util.Scanner;

public class Digits 

{
	public static void main(String[] args) 
	{

	int number, onesPlace, tensPlace, userinput;
		
    Scanner userinput1 = new Scanner(System.in);
		        
    //Get a 2 digit number from the user
	System.out.print("Enter a 2-digit number: ");
	number = userinput1.nextInt();
		        
    // Extract tens and ones digits
	onesPlace = number % 10;
	tensPlace = number / 10;
		        
	// Display the results
	System.out.println("Tens place digit: " + tensPlace);
	System.out.println("Ones place digit: " + onesPlace);
		        
	}
		

}

