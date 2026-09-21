/*

Program: Exercise5.java          Last Date of this Revision: September 21, 2026

Purpose: Create an application that prompts the user for an dollar ammount (ideally under $1.00)
and then displays the minumum number of coins necessary to make the change. Displays the

*/


package Mastery;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	
		//Declare Variables
		int change, quarters, dimes, nickels, pennies;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the amount of change
		System.out.print("Please enter an amount of change less than $1.00: ");
		
		//Get the change from the user
		change = userinput.nextInt();
		
		//Calculate the minimum amount of coins
		quarters = change / 25;
		dimes = change % 25 / 10;
		nickels = change % 25 % 10 / 5;
		pennies = change % 25 % 10 % 5 / 1;
		
		
		//Display the number of coins for the user
		System.out.println("The number of quarters is: " + quarters);
		System.out.println("The number of dimes is: " + dimes);
		System.out.println("The number of nickels is: " + nickels);
		System.out.println("The number of pennies is: " + pennies);
		
	}

}

/* Screen Dump
 
 Please enter an amount of change less than $1.00: 99
The number of quarters is: 3
The number of dimes is: 2
The number of nickels is: 0
The number of pennies is: 4


Please enter an amount of change less than $1.00: 33
The number of quarters is: 1
The number of dimes is: 0
The number of nickels is: 1
The number of pennies is: 3

 */