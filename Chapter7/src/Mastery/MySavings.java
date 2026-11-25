/*

Program: MySavings.Java          Last Date of this Revision: November 18, 2026

Purpose: Create a MySavings application that displays a menu of choices for entering 
pennies, nickels, dimes, and quarters into a piggy bank and then prompts the user to 
make a selection. The MySavings application should include a PiggyBank object that can 
add coins to the piggy bank, remove coins, and return the total amount in the bank. 

*/

package Mastery;

import java.util.Scanner;

//Class that handles user output and input
public class MySavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creates a new scanner object
		Scanner input = new Scanner(System.in);
		
		//Creates a new PiggyBank object called bank
		PiggyBank bank = new PiggyBank();
		
		//Declares variable
		int choice;
		
		//Creates a loop that keeps going until the user quits
		do 
		{
			//Calls the helper method to display the initial menu options
			displayMenu();
			
			//Asks the user to enter their choice from the menu
			System.out.println("Please enter your choice (a number 0 - 6): ");
			
			//Gets the user's answer
			choice = input.nextInt();
			
			//Creates a switch statement that allows different actions 
			//depending on the value of 'choice'
			switch (choice)
			{
			//When choice is equal to 1
			case 1:
				//Calls the getTotal() method from the piggyBank class
				//Display the total for the user
				System.out.println("Total in bank: $" + bank.getTotal());
				//After task is completed, ends the switch statement
				//so java doesn't continue into the next case
				break;
				
			case 2:
				//Calls an add coin method from the piggyBank class
				//Adds 1 to the existing number of that coin
				bank.addPenny(1);
				//Tells the user that the task has been completed
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
				//Calls the takeOutMoney() method from the PiggyBank class
				bank.takeOutMoney();
				//Tells the user that all the money in the bank has been taken out
				System.out.println("All money has been removed ");
				break;
				
			//When the user wants to quit, their choice will be 0
			case 0:
				//Thanks the user for using the application
				System.out.println("Thanks for using MySavings!");
				break;
				
			//If the choice chosen doesn't exist or the choice is negative
			default:
				//Tells user that they need to try again
				System.out.println("Invalid choice. Please enter a whole number between 0 and 6");
			}
		}
		
		//Loop continues until the user quits by entering 0 as their choice
		while (choice != 0);
	}
	
	//Creates a helper method that includes the option menu
	public static void displayMenu()
	{
		//Quit by entering 0
		System.out.println("0. Enter 0 to quit");
		
		//See the current total by entering 1
		System.out.println("1. Show total in bank");
		
		//Says how to add a coin
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		
		//Empty the bank by entering 6
		System.out.println("6. Take money out of bank");
	}

}

/*

0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
4
Added a dime
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
5
Added a quarter
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
1
Total in bank: $0.35
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
0
Thanks for using MySavings!



0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
1
Total in bank: $0.0
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
2
Added a penny
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
6
All money has been removed 
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
0
Thanks for using MySavings!



0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
8
Invalid choice. Please enter a whole number between 0 and 6
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
3
Added a nickel
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
3
Added a nickel
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
1
Total in bank: $0.1
0. Enter 0 to quit
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Please enter your choice (a number 0 - 6): 
0
Thanks for using MySavings!

*/