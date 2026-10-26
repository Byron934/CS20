package SkillBuilders;

public class GameCharacter {

	//Declare instance variables
	private String name;
	private int health;
	
	//Default constructor
	public GameCharacter()
	{
		name = null;
		health = 0;
	}
	
	//Overload Constructor
	public GameCharacter(String charName, int starHealth)
	{
		name = charName;
		health = starHealth;
		
	}
	
	public void attack()
	{
		System.out.println(name + "attacks! Deals 10 damages.");
		
	}
	
}
