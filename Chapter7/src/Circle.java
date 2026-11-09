
public class Circle 
{
	//Instance variables
	//number will never change
	private static final double PI = 3.14;
	private double radius;
	
	//Constructor method
	public Circle()
	{
		radius = 1.0;
	}
	
	//Overload Constructor method
	public Circle(double r) 
	{
		radius = r;	
	}
	
	//Modifier method
	public void setradius(double r) {
		radius = r;
	}
	
	//Accessor method
	public double getRadius()
	{
		return radius;
	}
	
	//Area method
	public double area()
	{
		double cArea;
		
		cArea = PI * radius * radius;
		
		return cArea;
	}
	
	//Circumference method
	public double circumference()
	{
		double c = 2 * PI * radius;
		
		return c;
	}
	
	public String toString()
	{
		String c;
		
		c = "Circle has radius: " + radius;
		
		return c;
	}
	
}//Closes the class
