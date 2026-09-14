package SkillBuilders;

import java.util.Scanner;

public class Rectangle 
{

	public static void main(String[] args) 
	{
	    //Declare Variables
		int length;
		int width;
		int area;
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the width
		System.out.print("Please enter the width: ");
		
		//Get the width value from the user
		width = userinput.nextInt();
		
		//Ask the user to enter the length
		System.out.print("Please enter the length: ");
		
		//Get the length value from the user
		length = userinput.nextInt();
		
		//Display the width and length on the console
		System.out.println("The width is: " + width );
		System.out.println("The length is: " + length );
		
		//Calculate the area and display the area on the console
		area = length * width;
		System.out.println("The area is: " + area);
		
		//Display the perimeter on the console
		System.out.println("The perimeter is: " + 2 * (length + width));
		
	}
	

}
