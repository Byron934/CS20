package SkillBuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {

		int number;
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Please enter a whole number: ");
		
		number = userinput.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while (i <= number) {
			
			System.out.println(i);
			sum += i;
			i += 2;
			
		}
		
		System.out.println("The sum of the odd numbers between 1 and the number entered is: " + sum);
		
	}

}
