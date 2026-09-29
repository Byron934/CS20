package SkillBuilders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		int Input, Root, Square;
	    
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Please enter any integer: ");
		
		Input = userinput.nextInt();
		
		Root = (int) Math.sqrt(Input);
		Square = Root * Root;
		
		if (Square == Input) {
		    System.out.println(Input + " is a perfect square!");
		} else {
		    System.out.println(Input + " is not a perfect square");
		}

	}

}
