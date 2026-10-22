package SkillBuilders;

import java.util.Scanner;

public class TimeConverter {
	
	//Method1
	public static double hoursToMinutes(double hours)
	{
		return hours * 60;
	}
	
	//Method2
	public static double daysToHours(double days)
	{
		return days * 24;
	}
	
	//Method3
	public static double minutesToHours(double minutes)
	{
		return minutes / 60;
	}
	
	//Method4
	public static double hoursToDays(double hours)
	{
		return hours / 24;
	}
	
	public static void main(String[] args) {
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please choose a time conversion:");
		System.out.println("For hours to minutes, enter '1' ");
		System.out.println("For days to hours, enter '2' ");
		System.out.println("For minutes to hours, enter '3' ");
		System.out.println("For hours to days, enter '4' ");
		
		int choice = userinput.nextInt();
		
		System.out.println("Please enter the time in the unit of your choice: ");
		
		double time = userinput.nextDouble();
		
		double newTime = 0;
		
		 switch (choice) {
         case 1:
             newTime = hoursToMinutes(time);
             break;
         case 2:
             newTime = daysToHours(time);
             break;
         case 3:
             newTime = minutesToHours(time);
             break;
         case 4:
             newTime = hoursToDays(time);
             break;
         default:
             System.out.println("Invalid choice. Please enter 1, 2, 3 or 4.");
             break;
		

	}
		 System.out.println("The converted time is: " + newTime);
}
}
