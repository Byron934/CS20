/*

Program: Grade.java          Last Date of this Revision: October 7, 2026

Purpose: Create a Grade application that prompts the user for the percentage 
earned on a test or assignment and then displays a corresponding grade.

*/

package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

	int percentage;
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.print("Please enter your grade as a percentage: ");
	
	percentage = userinput.nextInt();

	if (percentage == 100 ) {
		 System.out.println("Your grade on the profficiency scale is: EX2");
	} 
	
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