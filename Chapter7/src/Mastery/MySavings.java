/*

Program: MySavings.Java          Last Date of this Revision: November 18, 2026

Purpose: Create a MySavings application that displays a menu of choices for entering 
pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to 
make a selection. The MySavings application should include a PiggyBank object that can 
add coins to the piggy bank, remove coins, and return the total amount in the bank. 

*/

package Mastery;

import java.util.Scanner;

public class MySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		PiggyBank bank = new PiggyBank();
		int choice;
		
		do 
		{
			displayMenu();
			System.out.println("Please enter your choice (a number 0 - 6): ");
			choice = input.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Total in bank: $" + bank.getTotal());
				break;
				
			case 2:
				bank.addPenny(1);
				System.out.println("Added a penny");
				break;
				
			case 3:
				bank.addNickel(1);
				System.out.println("Added a nickel");
				break;
				
			case 4:
				bank.addDime(1);
				System.out.println("Added a dime");
				break;
				
			case 5:
				bank.addQuarter(1);
				System.out.println("Added a quarter");
				break;
				
			case 6:
				bank.takeOutMoney();
				System.out.println("All money has been removed ");
				break;
				
			case 0:
				System.out.println("Thanks for using MySavings!");
				break;
				
			default:
				System.out.println("Invalid choice. Please enter a whole number between 0 and 6");
			}
		}
		while (choice != 0);
		
	}
	
	public static void displayMenu()
	{
		System.out.println("0. Enter 0 to quit");
		System.out.println("1. Show total in bank");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("6. Take money out of bank");
	}

}

/*



*/