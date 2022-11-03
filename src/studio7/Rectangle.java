package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public double Area() {
		area = length * width;
		return area;
	}
	
	public double Perimeter() {
		perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public boolean isBigger(Rectangle other) {
		if (this.area > other.area) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
