/*Problem Title: The Geometry Hierarchy 
Input: 
0 0 3 4 
5 
2 
1 2 
Output: 
Distance: 5.0 
Circle Area: 78.54 
Square Area: 4.0 
Translated Point1: (1.0, 2.0) */

import java.util.*;
import java.lang.Math;
 class Point {
	double x, y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double distance(Point other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}

	void translate(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}

	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}
 class Circle {
	Point center;
	double radius;

	Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
}
 class Square {
	Point topLeft;
	double side;

	Square(Point topLeft, double side) {
		this.topLeft = topLeft;
		this.side = side;
	}

	double area() {
		return Math.pow(this.side, 2);
	}
}



public class Week2_Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double radius = scanner.nextDouble();
		double side = scanner.nextDouble();
		double dx = scanner.nextDouble();
		double dy = scanner.nextDouble();
		Point point1 = new Point(x1, y1);
		Point point2 = new Point(x2, y2);
		Circle circle = new Circle(point1, radius);
		Square square = new Square(point2, side);
		double distance = point1.distance(point2);
		double circleArea = circle.area();
		double squareArea = square.area();
		point1.translate(dx, dy);
		System.out.printf("Distance: %.1f\n", distance);
		System.out.printf("Circle Area: %.2f\n", circleArea);	
		System.out.printf("Square Area: %.1f\n", squareArea);
		System.out.println("Translated Point1: " + point1 .toString());
		scanner.close();

	}
}