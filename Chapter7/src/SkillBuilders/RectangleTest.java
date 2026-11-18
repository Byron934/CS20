package SkillBuilders;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		
		rectangle1.setLength(10);
		rectangle1.setWidth(5);
		
		Rectangle rectangle2 = new Rectangle(10,5);
		
		System.out.println("rectangle 1 length: " + rectangle1.getLength());
		System.out.println("rectangle 1 width: " + rectangle1.getWidth());
		System.out.println("Rectangle 1 Area: " + rectangle1.getArea());
		System.out.println("Rectangle 1 Perimeter: " + rectangle1.getPerimeter());
		
		Rectangle.displayAreaFormula();
		
		System.out.println("\nRectangle 1:");
		System.out.println(rectangle1.toString());

		System.out.println("\nRectangle 2:");
		System.out.println(rectangle2.toString());
		
		System.out.println("\nAre the rectangles equal? " + rectangle1.equals(rectangle2));
		
		Rectangle rectangle3 = new Rectangle(8,4);
		System.out.println("Are Rectangle 1 and Rectangle 3 equal? " + rectangle1.equals(rectangle3));
		
	}

}
