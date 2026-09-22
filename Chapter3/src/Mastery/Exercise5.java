/*

Program: Exercise5.java          Last Date of this Revision: September 22, 2026

Purpose: Create an application that prompts the user for an dollar ammount (ideally under $1.00)
and then displays the minumum number of coins necessary to make the change. Displays the

*/


package Mastery;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
	
		//Declare variables for the amount of change, total number of coins and each individual coin
		int change, quarters, dimes, nickels, pennies, totalCoins;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt the user to enter the amount of change under $1.00
		System.out.print("Please enter an amount of change less than $1.00: ");
		
		//Get the change from the user and apply the number to the variable "change"
		change = userinput.nextInt();
		
		//Calculate the total minimum amount of coins and the least possible amount of each
		quarters = change / 25;
		dimes = change % 25 / 10;
		nickels = change % 25 % 10 / 5;
		pennies = change % 25 % 10 % 5 / 1;
		totalCoins = quarters + dimes + nickels + pennies;
		
		//Display the total number of coins used and the number of each coin for the user
		System.out.println("The minimum number of coins is: " + totalCoins);
		System.out.println("The number of quarters is: " + quarters);
		System.out.println("The number of dimes is: " + dimes);
		System.out.println("The number of nickels is: " + nickels);
		System.out.println("The number of pennies is: " + pennies);
		
	}

}

/* Screen Dump
 
Please enter an amount of change less than $1.00: 99
The minimum number of coins is: 9
The number of quarters is: 3
The number of dimes is: 2
The number of nickels is: 0
The number of pennies is: 4


Please enter an amount of change less than $1.00: 33
The minimum number of coins is: 5
The number of quarters is: 1
The number of dimes is: 0
The number of nickels is: 1
The number of pennies is: 3

 */