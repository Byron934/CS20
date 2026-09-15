package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{

	        Scanner userinput = new Scanner(System.in);
	        
	        System.out.print("Enter a 2-digit number: ");
	        int number = userinput.nextInt();
	        
	        // Extract tens and ones digits
	        int tens = number / 10;
	        int ones = number % 10;
	        
	        // Display the results
	        System.out.println("Tens place digit: " + tens);
	        System.out.println("Ones place digit: " + ones);
	        
	        userinput.close();
	}
	

}