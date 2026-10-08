/*

Program: MathTutor.java          Last Date of this Revision: October 7, 2026

Purpose: Create a MathTutor application that displays math problems by randomly generating 
2 numbers (1-10) and an operator (+-/*), and then prompts the user for an answer. 
The application should check the answer, display a message and the correct answer if necessary.

*/

package Mastery;

import java.util.Scanner;
import java.util.Random;

public class MathTutor {

	public static void main(String[] args) {

	//Create scanner and random
	Scanner Input = new Scanner(System.in);
	Random random = new Random();
	
    //Randomly generate 2 numbers between from 1 to 10
	int num1 = random.nextInt(10) + 1;
	int num2 = random.nextInt(10) +1;
	
	//Generate a random number from 0 - 3
	int operator = random.nextInt(4);
	
	//Declare variables for the users answer and the operator
	int answer;
	String symbol;
	
	//Match the random number from 0 - 3 to an operator
	if (operator == 0) {
	
		symbol = "+";
		answer = num1 + num2;

	}
	else if (operator == 1) {
		
		symbol = "-";
		answer = num1 - num2;

	}
	else if (operator == 2) {
		
		symbol = "*";
		answer = num1 * num2;

	}
	else {
		
		symbol = "/";
		
		//Change num2 until it can divide num1 evenly (reaminder = 0)
		while (num1 % num2 != 0) {
			num2 = random.nextInt(10) + 1;
		}
		
		answer = num1 / num2;

	}

	//Display the equation to the user
	System.out.print(num1 + symbol + num2 + " = ");

	//Get users answer
	int userAnswer = Input.nextInt();
	
	//Check the answer and the display whether or not the user was correct 
	//as well as the correct answer if need be
	if (userAnswer == answer) {
		System.out.print("Correct!");
		
	}
	else
	{
		System.out.println("Incorrect!");
		System.out.print("The correct answer is " + answer);
	}
}
	
}

/*

9*4 = 36
Correct!


8-3 = 6
Incorrect!
The correct answer is 5


10/5 = 2
Correct!

 */

