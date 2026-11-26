package Mastery;

public class AdditionProblem {

	//Declare variables for the 2 randomly generated numbers and the calculated answer
	//They are only accessible to this class
	private int num1, num2, answer;
	
	public AdditionProblem()
	{
		num1 = (int)Math.random() * 21;
		num2 = (int)Math.random() * 21;
		
		answer = num1 + num2;
	}
	
	public int getNum1()
	{
		return num1;
	}
	
	public int getNum2()
	{
		return num2;
	}
	
	public boolean checkAnswer(int guess)
	{
		return guess == answer;
	}
	
	public int getAnswer()
	{
		return answer;
	}
}
