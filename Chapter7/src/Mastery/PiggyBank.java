package Mastery;

public class PiggyBank {

	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	//Constructor method that initializes an empty bank
	public PiggyBank()
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	//Modifier methods to add coins
	public void addPenny(int count)
	{
		if (count > 0) pennies += count;
	}
	
	public void addNickel(int count)
	{
		if (count > 0) nickels += count;
	}
	
	public void addDime(int count)
	{
		if (count > 0) dimes += count;
	}
	
	public void addQuarter(int count)
	{
		if (count > 0) quarters += count;
	}
	
	//Constructor method to take all coins out of bank
	public void takeOutMoney()
	{
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	//Constructor method that calculates and returns the total dollar amount
	public double getTotal()
	{
		double total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25);
		return total;
	}
	
}
