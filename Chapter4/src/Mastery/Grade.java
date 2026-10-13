/*

Program: Grade.java          Last Date of this Revision: October 7, 2026

Purpose: Create a Grade application that prompts the user for the percentage 
earned on a test or assignment and then displays a corresponding grade.

*/

package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

	//Declare a variable for the percentage that will be entered
	int percentage;
	
	//Create a new scanner object
	Scanner userinput = new Scanner(System.in);
	
	//Ask the user to enter one of their grades as a percentage
	System.out.print("Please enter your grade as a percentage: ");
	
	//Get the users answer
	percentage = userinput.nextInt();

	//Beginning with the top (most restrictive mark) determine which mark
	//on the proffieciency scale best matches the percentage
	if (percentage == 100 ) {
		 System.out.println("Your grade on the profficiency scale is: EX2");
	} 
	
	//If a percentage aligns with the requirements of a certain mark, the grade is displayed
	//Otherwise the program continues until "percentage" aligns with one of the marks
	else if (percentage >= 95) {
		 System.out.println("Your grade on the profficiency scale is: EX1");
	} 
	
	else if (percentage >= 85) {
		 System.out.println("Your grade on the profficiency scale is: PR2");
	} 
	
	else if (percentage >= 75) {
		 System.out.println("Your grade on the profficiency scale is: PR1");
	} 
	
	else if (percentage >= 65) {
		 System.out.println("Your grade on the profficiency scale is: DV2");
	} 
	
	else if (percentage >= 55) {
		 System.out.println("Your grade on the profficiency scale is: DV1");
	} 
	
	else if (percentage >= 40) {
		 System.out.println("Your grade on the profficiency scale is: BG2");
	} 
	
	//Anything that has not been given a higher mark will fall under this
	//BG1 is displayed to the user
	else {
		 System.out.println("Your grade on the profficiency scale is: BG1");
	}
	
	}

}

/*

Please enter your grade as a percentage: 87
Your grade on the profficiency scale is: PR2


Please enter your grade as a percentage: 45
Your grade on the profficiency scale is: BG2


Please enter your grade as a percentage: 6
Your grade on the profficiency scale is: BG1

*/