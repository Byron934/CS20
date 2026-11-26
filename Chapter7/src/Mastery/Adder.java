/*

Program: AddCoins.Java          Last Date of this Revision: November 18, 2026

Purpose: The Adder game prompts a player for the answer to an addition problem. 
The Adder game creates a problem from 2 randomly selected integers between 0 and 20.
Adder allows the player three tries to enter a correct answer. If the correct answer is 
entered on the first try, the player is awarded 5 points. If the correct answer is 
entered on the second try, 3 points are awarded. The correct answer on the third 
try earns 1 point. If, after three tries, the correct answer is still not entered, the
player receives no points and the correct answer is displayed. The game continues until
999 is entered as an answer. At the end of the game, Adder displays the players score.

*/

package Mastery;

import java.util.Scanner;

//Class that runs the game, and manages user input and output
public class Adder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int score = 0, guess = 0;
		
		while (guess != 999)
		{
			AdditionProblem problem = new AdditionProblem();
			
			System.out.println(problem.getNum1() + " + " + problem.getNum2() + " = ");
			
			for (int attempt = 1; attempt <= 3; attempt++)
			{
				guess = input.nextInt();
				
				if (guess == 999)
				{
					break;
				}
				
				if (problem.checkAnswer(guess))
				{
					if (attempt == 1)
					{
						score += 5;
					}
					
					else if (attempt == 2)
					{
						score += 3;
					}
					
					else
					{
						score += 1;
					}
					
					break;
				}
				
				else
				{
					System.out.println("Wrong answer. Enter another answer: ");
					
					if (attempt == 3)
					{
						System.out.print("The correct answer was " + problem.getAnswer());
					}
				}
			}
			
		}
		
		System.out.println("Your score is:" + score);
	}

}

/*



*/
