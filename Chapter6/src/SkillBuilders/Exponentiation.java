package SkillBuilders;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
	
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter any integer: ");
		int Num1 = userinput.nextInt();

		System.out.println("Please enter any integer: ");
		int Num2 = userinput.nextInt();
		
		double result = powerOf(Num1, Num2);
		System.out.println("The power of the first integer raised to the second integer is: "
				+ result);
	}
	
	public static double powerOf(int Num1, int Num2)
	{
		double power = (double) Math.pow(Num1, Num2);
		return power;
	}

}
