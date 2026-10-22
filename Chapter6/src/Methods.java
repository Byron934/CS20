
public class Methods {

	public static void main(String[] args) {

	//Method1
	addWelcome();

	//Method2
	greetStudent("Kyle");
	
	//Method3
	int total = addnumbers(8,71); 
	
	System.out.println("Total is: " + total);
	
	//Method4
	double area = calculateArea(2.75);
	System.out.println("Area: "+ area);
	
	//Method5
	isPassing(85);
	//System.out.println("Passing: " + result);
	
	}

	//Method #1 no parameters and no return value
	public static void addWelcome() 
	{
		System.out.println("Welcome to our class!");
	}
	
	//Method #2 one parameter but no return value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, " + name);	
	}
	
	//Method #3 Two parameter, return an integer
	public static int addnumbers(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
	
	//Method #4: one parameter, returns a decimal
	public static double calculateArea(double radius)
	{
		double area = 3.14 * radius * radius;
		return area;
	}
	
	//Method #5: One parameter, return a boolean
	public static boolean isPassing(int mark)
	{
		return mark >= 50;
	}
	
	
}
