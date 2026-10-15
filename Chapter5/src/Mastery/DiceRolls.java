package Mastery;

import java.util.Scanner;
import java.util.Random;

public class DiceRolls {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		Random random = new Random();

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
		
		int roll11 = random.nextInt(6) + 1;
		int roll12 = random.nextInt(6) +1;
		
		int sum1 = roll1 + roll2;
		int sum2 = roll3 + roll4;
		int sum3 = roll5 + roll6;
		int sum4 = roll7 + roll8;
		int sum5 = roll9 + roll10;
		int sum6 = roll11 + roll12;
		
		System.out.println("Dice 1   Dice 2   Total");
		System.out.println("  "+roll1+"    "+roll2+"	"+sum1);
		System.out.println("  "+roll3+"    "+roll4+"	"+sum2);
		System.out.println("  "+roll5+"    "+roll6+"	"+sum3);
		System.out.println("  "+roll7+"    "+roll8+"	"+sum4);
		System.out.println("  "+roll9+"    "+roll10+"	"+sum5);
		System.out.println("  "+roll11+"    "+roll12+"	"+sum6);
	}

}
