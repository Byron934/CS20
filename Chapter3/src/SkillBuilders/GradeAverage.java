package SkillBuilders;

import java.util.Scanner;

public class GradeAverage 
{

	public static void main(String[] args) 
	{

	//Declare Variables
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    int grade5;
    
	//Create a Scanner object
	Scanner userinput = new Scanner(System.in);
	
	//Ask the user to enter their first grade
	System.out.print("Please enter the your first grade: ");
	
	//Get the grade from the user
	grade1 = userinput.nextInt();
	
	//Declare variable and add grade to total sum
	int sum1;
	sum1 = grade1;
	
	//Ask the user to enter their second grade
	System.out.print("Please enter the your second grade: ");
	
	//Get the grade from the user
	grade2 = userinput.nextInt();
	
	//Declare variable and add grade to total sum
	int sum2;
	sum2 = sum1 + grade2;
	
	//Ask the user to enter their third grade
	System.out.print("Please enter the your third grade: ");
	
	//Get the grade from the user
	grade3 = userinput.nextInt();
	
	//Declare variable and add grade to total sum
	int sum3;
	sum3 = sum2 + grade3;
	
	//Ask the user to enter their fourth grade
	System.out.print("Please enter the your fourth grade: ");
	
	//Get the grade from the user
	grade4 = userinput.nextInt();
	
	//Declare variable and add grade to total sum
	int sum4;
	sum4 = sum3 + grade4;
	
	//Ask the user to enter their fifth grade
	System.out.print("Please enter the your fifth grade: ");
	
	//Get the grade from the user
	grade5 = userinput.nextInt();
	
	//Declare variable and add grade to total sum
	int totalsum;
	totalsum = sum4 + grade5;
	
	//Declare variable and divide total sum by 5 to get grade average
	int Avg;
	Avg =  totalsum / 5;
	
	//Display grade average on console for user
	System.out.println("Your average grade is: " + Avg);
	
	}
	

}
