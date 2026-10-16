/*

Program: DiceRolls.java          Last Date of this Revision: October 16, 2026

Purpose: Create and application thet displays five rolls of two dice where each die is numbered from 1 to 6.
The application should also show the total of each roll.

 */

package Mastery;

import java.util.Scanner;
import java.util.Random;

public class DiceRolls {

	public static void main(String[] args) {
		
		//Create scanner and random
		Scanner Input = new Scanner(System.in);
		Random random = new Random();

		//Randomly generate 10 dice rolls (numbered 1 - 6)
		int roll1 = random.nextInt(6) + 1;
		int roll2 = random.nextInt(6) +1;
		
		int roll3 = random.nextInt(6) + 1;
		int roll4 = random.nextInt(6) +1;
		
		int roll5 = random.nextInt(6) + 1;
		int roll6 = random.nextInt(6) +1;
		
		int roll7 = random.nextInt(6) + 1;
		int roll8 = random.nextInt(6) +1;
		
		int roll9 = random.nextInt(6) + 1;
		int roll10 = random.nextInt(6) +1;
		
		//Sum up five pairs of the dice rolls
		int sum1 = roll1 + roll2;
		int sum2 = roll3 + roll4;
		int sum3 = roll5 + roll6;
		int sum4 = roll7 + roll8;
		int sum5 = roll9 + roll10;
		
		//Display the five pairs of dice rolls and then the sum of each pair
		System.out.println("Dice 1   Dice 2   Total");
		System.out.println("   "+roll1+"        "+roll2+"	    "+sum1);
		System.out.println("   "+roll3+"        "+roll4+"	    "+sum2);
		System.out.println("   "+roll5+"        "+roll6+"	    "+sum3);
		System.out.println("   "+roll7+"        "+roll8+"	    "+sum4);
		System.out.println("   "+roll9+"        "+roll10+"       "+sum5);
	}

}

/*

Dice 1   Dice 2   Total
   4        1	    5
   2        5	    7
   6        4	    10
   6        2	    8
   6        4       10


Dice 1   Dice 2   Total
   5        4	    9
   1        3	    4
   6        5	    11
   5        2	    7
   2        4       6

*/
