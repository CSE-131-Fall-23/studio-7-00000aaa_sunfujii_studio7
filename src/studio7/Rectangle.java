package studio7;


/**
 * Calculate rectangle
 * 
 * @param length
 * @param width
 * @return perimeter and area of rectangle
 */

public class Rectangle {
	
	private double length;
	private double width;
	public Rectangle (double InitLength, double InitWidth) {
		length = InitLength;
		width = InitWidth;
	}
	
	public double Area() {
		return (length * width);
	}
	
	public double Perimeter() {
		return ((2 * length) + 2 * (width));
	}
	
	
	
	public boolean Compare(Rectangle rectangle2) {

		if(this.Area() > rectangle2.Area()) { //"this" refers to object calling the method
			return true;
		}
		else {
			return false;
		}
	}
		

	
	public static void main (String[] args) {
		Rectangle r1 = new Rectangle(2, 3);
		System.out.println(r1.Area());
		System.out.println(r1.Perimeter());
		
		Rectangle r2 = new Rectangle(1,1);
		
		if(r1.Compare(r2)) {
			System.out.println("r1 is larger");
		}
		else {
			System.out.println("r1 is smaller");
		}
	}

}
