/*

Program: PerfectInteger.Java          Last Date of this Revision: October 29, 2026

Purpose: Create an application that displays all perfect inegers up to 100. A perfect
integer is a number which is equal to the sum of all its factors except itself. The
application should include a boolean method isPerfect(). Ex: 1 + 2 + 3 = 6

*/


package Mastery;

public class PerfectIntegers {

	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++)
		{
			if (isPerfect(i))
			{
				System.out.println(i);
			}
		}

	}
	
	public static boolean isPerfect(int number)
	{
		int sum = 0;
				
		for (int i = 1; i < number; i = i + 1)
		{
			if (number % i == 0)
			{
				sum = sum + i;
			}
			
		}
		
		return sum == number;
		
	}

}


/*




 */
