package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:54:19
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.12
 */
public class TestTriangle2D {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Create three 2D triangles
		Triangle2D t1 = new Triangle2D(new Point(2.5, 2), new Point(4.2, 3), new Point(5, 3.5));
		
		// Display
		System.out.println("Area: " + t1.getArea() + "      " + "Perimeter: " + t1.getPerimeter());
		
		System.out.println("Does the point(3, 3) in the triangle t1?");
		System.out.println(t1.contains(new Point(3, 3)));
		System.out.println();

		System.out.println("Does the triangle((2.9, 2), (4, 1), (1, 3.4)) in the triangle t1?");
		System.out.println(t1.contains(new Triangle2D(new Point(2.9, 2), new Point(4, 1), new Point(1, 3.4))));
		System.out.println();

		System.out.println("Does the triangle((2, 5.5), (4, -3), (2, 6.5)) overlaps the triangle t1?");
		System.out.println(t1.overlaps(new Triangle2D(new Point(2, 5.5), new Point(4, -3), new Point(2, 6.5))));
		System.out.println();		
	}

}
