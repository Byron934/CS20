package Mastery;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

	int percentage;
	
	Scanner userinput = new Scanner(System.in);
	
	System.out.print("Please enter you grade as a percentage: ");
	
	percentage = userinput.nextInt();

	if (percentage >= 90 ) {
		 System.out.println("Your letter grade is: A");
	} 
	
	else if (percentage >= 80) {
		 System.out.println("Your letter grade is: B");
	} 
	
	else if (percentage >= 70) {
		 System.out.println("Your letter grade is: C");
	} 
	
	else if (percentage >= 60) {
		 System.out.println("Your letter grade is: D");
	} 
	
	else {
		 System.out.println("Your letter grade is: F");
	}
	
	}

}
