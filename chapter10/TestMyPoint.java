package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:53:26
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.4
 */
public class TestMyPoint {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub

		// Create two MyPoint objects
		Point myPoint1 = new Point();
		Point myPoint2 = new Point(10, 30.5);
		
		// Print the distance between them
		System.out.println("The distance between them: " + myPoint1.distance(myPoint2));
	}

}
