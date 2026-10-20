/*

Program: DigitsSum.Java          Last Date of this Revision: October 14, 2026

Purpose: Create an application that prompts the user for a non-negative integer 
and then displays the sum of the digits.

*/

package Mastery;

import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
	
		//Declare a variable for the number that will be entered and the sum of the digits
		int number;
		//Also set sum = 0
		int sum = 0;
		
		//Create a new scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Display a prompt for the user to enter a non-negative integer
		System.out.print("Please enter a whole number: ");
		
		//Get the users answer
		number = userinput.nextInt();
		
		//Output a seperate message if the number input was zero
		if (number == 0) {
			System.out.println("The digit is: 0");
			System.out.println("The sum of the digits is 0.");
		}
		
		//Help correct the user if they accidently input a negative integer
		else if (number < 0) {
			System.out.println("Please only enter a POSITIVE integer.");
		}
		
		else {
		
			//Tell the user what the program is about to display
			System.out.println("Starting from the ones digit, the digits are:");
			
			//As long as there is a number greater than zero,
			//the program continues to process the digits from right to left
			while (number > 0) {
				//Find the ones digit of the number
				int digit = number % 10;
				//Display the digit to the user
				System.out.println(digit);
				//Add the digit to the total sum
				sum += digit;
				//Dividing by 10 removes the last digit because it becomes and decimal and is truncated
				number = number / 10;
			}
		    //Display the the sum of the digits to the user
			System.out.println("The sum of the digits is: " + sum);
		}
	}

}

/*

Please enter a whole number: -65
Please only enter a POSITIVE integer.


Please enter a whole number: 0972347
Starting from the ones digit, the digits are:
7
4
3
2
7
9
The sum of the digits is: 32


Please enter a whole number: 0
The digit is: 0
The sum of the digits is 0.

*/