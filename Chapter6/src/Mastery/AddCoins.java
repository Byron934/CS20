/*

Program: AddCoins.Java          Last Date of this Revision: October 27, 2026

Purpose: Create an application that prompts the user for the number of pennies, 
nickels, dimes, and quarters, and then displays their total dollar amount. 
The app should include a getDollarAmount() method that has 4 int parameters 
corresponding to the number pennies, nickels, dimes, and quarters, and returns 
a String that corresponds to the dollar value of the coins. Note that the string 
returned should include the currency sign ($).

*/

package Mastery;

import java.util.Scanner;

public class AddCoins {

	//Main method
	public static void main(String[] args) {
		
		//Creates a new scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Asks the user for the amount of a certain coin
		System.out.println("Please enter your number of quarters: ");
		//Stores the users answer
		int quarters = userinput.nextInt();
		
		System.out.println("Please enter your number of dimes: ");
		int dimes = userinput.nextInt();
		
		System.out.println("Please enter your number of nickels: ");
		int nickels = userinput.nextInt();
		
		System.out.println("Please enter your number of pennies: ");
		int pennies = userinput.nextInt();
		
		//Calls the helper method and stores the returned string
		String totalSum = getDollarAmount(quarters, dimes, nickels, pennies);
		//Displays the total dollar amount to the user
		System.out.println("Total: " + totalSum);

	}
	
	//Creates a helper method to calculate the total dollar amount
	public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies)
	{
		//Calculate the total dollar amount of each coin
		double total1 = quarters * 0.25;
		double total2 = dimes * 0.10;
		double total3 = nickels * 0.05;
		double total4 = pennies * 0.01;
		
		//Sum the totals
		double totalSum = total1 + total2 + total3 + total4;
		
		//Ensures that the dollar sign will be included in the output
		String display = "$" + totalSum;
		
		//Sends the string back to the main method where it was called
		return display;
	}

}


/*

Please enter your number of quarters: 
2
Please enter your number of dimes: 
10
Please enter your number of nickels: 
20
Please enter your number of pennies: 
50
$3.0


Please enter your number of quarters: 
4
Please enter your number of dimes: 
4
Please enter your number of nickels: 
4
Please enter your number of pennies: 
4
$1.64


Please enter your number of quarters: 
6
Please enter your number of dimes: 
22
Please enter your number of nickels: 
0
Please enter your number of pennies: 
47
$4.17

*/
