package SkillBuilders;

public class Rectangle {
	
	//Member variables
	private double length;
	private double width;
	
	//Constructor method
	public Rectangle()
		{
			length = 0.0;
			width = 0.0;
		}
		
	//Overload Constructor method
	public Rectangle (double l, double w) 
		{
			length = l;
			width = w;
		}
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
		
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public double getPerimeter()
	{
		return 2*(length*width);
	}
	
	public static void displayAreaFormula()
		{
			System.out.println("Area = Length * Width");
		}
	
public boolean equals(Object obj) {
	if (this == obj)
	{
		return true;
	}
	
	if (obj == null || getClass() != obj.getClass())
	{
		return false;
	}

	Rectangle other = (Rectangle) obj;

    return Double.compare(length, other.length) == 0
        && Double.compare(width, other.width) == 0;
}


public String toString() {
    return "Rectangle [Length = " + length
            + ", Width = " + width
            + ", Area = " + getArea()
            + ", Perimeter = " + getPerimeter() + "]";
	
}
}
