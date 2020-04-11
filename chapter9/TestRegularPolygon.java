package chapter9;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:49:27
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.9
 */
public class TestRegularPolygon {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub

		// Create Three object of RegularPolygon
		RegularPolygon regularPolygon1 = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		// Print The objects of RegularPolygon
		System.out.println("regularPolygon1 ");
		System.out.println("Perimeter: " + regularPolygon1.getPerimeter() + "   " +
				"Area: " + regularPolygon1.getArea());
		
		System.out.println("regularPolygon2 ");
		System.out.println("Perimeter: " + regularPolygon2.getPerimeter() + "   " +
				"Area: " + regularPolygon2.getArea());

		System.out.println("regularPolygon3 ");
		System.out.println("Perimeter: " + regularPolygon3.getPerimeter() + "   " +
				"Area: " + regularPolygon3.getArea());
	}

}

// Define the RegularPolygon class with 3 constructors 
class RegularPolygon {
	/** Data area */
	private int n;
	private int side; 
	private double x; 
	private double y; 
	
	/** Construct the RegularPolygon takes no parameters */
	RegularPolygon() {
		n = 3;	side = 1;	x = 0;	y = 0;
	}
	
	/** Construct the RegularPolygon with n, side, (0, 0) */
	RegularPolygon(int newN, int newSide) {
		n = newN;
		side = newSide;
		x = 0;	y = 0;
	}
	
	/** Construct the RegularPolygon with n, side, ��x, y�� */
	RegularPolygon(int newN, int newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;	y = newY;
	}
	
	/** Return n */
	int nAccessor() {
		return n;
	}
	
	/** Return side */
	int sideAccessor() {
		return side;
	}
	
	/** Return x */
	double xAccessor() {
		return x;
	}
	
	/** Return y */
	double yAccessor() {
		return y;
	}
	
	/** Set a new n */ 
	void nModifier(int newN) {
		n = newN;
	}
	
	/** Set a new side */
	void sideModifier(int newSide) {
		side = newSide;
	}
	
	/** Set a new x */
	void xModifier(double newX) {
		x = newX;
	}
	
	/** Set a new y */
	void yModifier(double newY) {
		y = newY;
	}
	
	/** The method of return the perimeter of the regular polygon */
	double getPerimeter() {
		return side * n;
	}
	
	/** The method of return the area of the regular polygon */
	double getArea() {
		return (n * side * side) / (4 * Math.tan(Math.PI / n));
	}

}