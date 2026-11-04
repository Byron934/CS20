/*

Program: PerfectInteger.Java          Last Date of this Revision: October 29, 2026

Purpose: Create an application that displays all perfect integers up to 100. A perfect
integer is a number which is equal to the sum of all its factors except itself. The
application should include a boolean method isPerfect(). Ex: 1 + 2 + 3 = 6

*/


package Mastery;

public class PerfectIntegers {

	//Main method
	public static void main(String[] args) {
		
		//Creates a loop that runs throught the numbers 1 to 100
		for (int i = 1; i <=100; i = i++)
		{
			//Calls the helper method, but the following code only runs if the boolean returns true
			if (isPerfect(i))
			{
				//If the number is a perfect integer then the number will be printed for the user
				System.out.println(i);
			}
		}
	}
	
	//Creates a helper method that returns a boolean
	public static boolean isPerfect(int number)
	{
		//Declares and initializes an accumulator that will help sum the factors of each number
		int sum = 0;
		
		//Starts a loop that determines the factors of any number 1 to 100. 
		for (int i = 1; i < number; i = i++)
		{
			//Tests if the original number is divisible one of the test numbers
			if (number % i == 0)
			{
				//If the number is divisible by a certain factor, the factor is added to the sum
				sum += i;
			}	
		}
		
		//After determining all of a numbers factors and totaling them,
		//It checks if the sum of the factors (excluding the number itself) is equal to the original number,
		//If so, the boolean returns true, because the number tested is a perfect integer.
		//If not, the boolean returns false.
		return sum == number;
		
	}

}


/*

6
28

 */
