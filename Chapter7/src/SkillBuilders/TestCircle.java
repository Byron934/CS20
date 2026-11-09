package SkillBuilders;

import java.text.DecimalFormat;

public class TestCircle {

	public static void main(String[] args)
	{
		Circle c1 = new Circle(2.9);
		Circle c2 = new Circle(12.5);
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println("c1 radius: " + c1.getRadius());
		
		System.out.println("c1 area: " + dc.format(c1.area()));
		
		System.out.println("c1 circumference: " + dc.format(c1.circumference()));
		
		if (c1.equals(c2))
		{
			System.out.println("Circles are equal");
		}
		else 
		{
			System.out.println("Circles are not equal");
		}
	}
}
