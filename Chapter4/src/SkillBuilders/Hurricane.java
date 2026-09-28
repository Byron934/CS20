package SkillBuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {

		//Declare variable for the hurricane category
		int category;
	    
	    //Create a Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Prompt the user to enter the hurricane category
		System.out.print("Please enter a hurricane category as a whole number between 1 and 5: ");
		
		//Get the category from the user and apply the number to the variable "category"
		category = userinput.nextInt();
		
		//Display the wind speed for the given category to the user
		 switch (category) {
         case 1:
             System.out.println("Category 1: 74-95mph or 64-82 kt or 119-153 km/h");
             break;
         case 2:
             System.out.println("Category 2: 96-110mph or 83-95 kt or 154-177 km/h");
             break;
         case 3:
             System.out.println("Category 3: 111-130mph or 96-113 kt or 178-209 km/h");
             break;
         case 4:
             System.out.println("Category 4: 131-155mph or 114-135 kt or 210-249 km/h");
             break;
         case 5:
             System.out.println("Category 5: greater than 155mph or 135 kt or 249 km/h");
             break;
         default:
             System.out.println("Invalid category"); // Runs if user enters a different category (Ex: 6)
             break;

	}

}
	
}
