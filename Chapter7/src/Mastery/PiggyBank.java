package Mastery;

//Class that tracks the coins and handles math
public class PiggyBank {

	//Declares variables for each type of coin
	//Each variable only accessible by this class
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	//Constructor method that initializes an empty bank
	public PiggyBank()
	{
		//Each type of coin set to zero
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	//Modifier methods to add a type of coin
	public void addPenny(int count)
	{
		//If user chooses the add penny option, the count will be 1
		//1 penny will be added
		//If not, nothing happens
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
		//Simply resets all the variables to zero
		pennies = 0;
		nickels = 0;
		dimes = 0;
		quarters = 0;
	}
	
	//Constructor method that calculates and returns the total dollar amount
	public double getTotal()
	{
		//Total is calculated by multiplying the number of each coin by its dollar value
		double total = (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.1) + (quarters * 0.25);
		//Final total dollar amount is returned
		return total;
	}
	
}
