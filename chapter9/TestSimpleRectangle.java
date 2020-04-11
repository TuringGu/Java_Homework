package chapter9;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:50:03
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.1
 */
public class TestSimpleRectangle {
	/** Main method */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Create a rectangle with width = 4, heigth = 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		// Create a rectangle with width = 3.5, heigth = 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Output
		System.out.println("rectangle1:");
		System.out.println("Width: " + rectangle1.width + "     Heigth: " + rectangle1.heigth);
		System.out.println("Area: " + rectangle1.getArea() + "     Perimeter: " + rectangle1.getPerimeter());
		
		System.out.println();
		
		System.out.println("rectangle2:");
		System.out.println("Width: " + rectangle2.width + "     Heigth: " + rectangle2.heigth);
		System.out.println("Area: " + rectangle2.getArea() + "     Perimeter: " + rectangle2.getPerimeter());
	}
	
}

//Define the rectangle class with two constructors
class Rectangle{
	/** Data area */
	double width = 1;
	double heigth = 1;
	
	/** Construct a rectangle that takes no parameters */
	Rectangle(){
	}
	
	/** Construct a rectangle with specified value */
	Rectangle(double newWidth, double newHeigth) {
		width = newWidth;
		heigth = newHeigth;
	}
	
	/** Return the area of the rectangle */
	double getArea() {
		return width * heigth;
	}
	
	/** Return the perimeter of this rectangle */
	double getPerimeter() {
		return 2 * (width + heigth);
	}

}
