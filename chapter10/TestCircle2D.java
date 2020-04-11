package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:52:56
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.11
 */
public class TestCircle2D {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub

		// Create an object of Circle2D
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		// Display the information about this circle
		System.out.println("The 2D circle: ");
		System.out.println("Area: " + c1.getArea() + "     " + "Perimeter: " + c1.getPerimeter());
		System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)):  " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
