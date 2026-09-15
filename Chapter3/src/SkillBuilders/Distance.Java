package SkillBuilders;

import java.util.Scanner;

public class Distance
{

	public static void main(String[] args) 
	{
	    //Declare Variables
		float split1;
		float split2;
		float split3;
		
		//Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Ask the user to enter the distance
		System.out.print("Please enter distance (km) of the first segment: ");
				
		//Get the distance of the first segment from the user
		split1 = userinput.nextInt();
		
		//Ask the user to enter the distance
		System.out.print("Please enter distance (km) of the second segment: ");
				
		//Get the distance of the second segment from the user
		split2 = userinput.nextInt();
		
		//Ask the user to enter the distance
		System.out.print("Please enter distance (km) of the third segment: ");
				
		//Get the distance of the third segment from the user
		split3 = userinput.nextInt();
		
		//Calculate the area and display the area on the console		
		total = split1 + split2 +split3;
		System.out.println("The total distance of the race is: " + total);
		
	}
	

}