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
		answer = num1 / num2;

	}

	//Display the equation to the user
	System.out.print(num1 + symbol + num2 + " = ");

	//Get users answer
	int userAnswer = Input.nextInt();
	
	//Check the answer and the display whether or not the user was correct
	if (userAnswer == answer) {
		System.out.print("Correct!");
		
	}
	else
	{
		System.out.print("Incorrect!");
		System.out.print("The correct answer is" + answer);
	}
}
	
}
