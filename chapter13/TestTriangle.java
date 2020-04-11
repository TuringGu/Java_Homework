/**
 * @Project_name: JavaMyHomework
 * @File_name: TestTriangle.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月12日	
 * @Time: 下午9:37:35
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.awt.geom.Point2D;
import java.util.Scanner;

/**
 * @author Turing-G
 * Exam 13.1
 */
public class TestTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Data initial
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Test begin: ");
		
		// User's input & Create an object of Triangle
		System.out.println("Enter three edges with three points: ");
		GeometricObject triangle = new Triangle(new Point2D.Double(input.nextDouble(), input.nextDouble()),
				new Point2D.Double(input.nextDouble(), input.nextDouble()), 
				new Point2D.Double(input.nextDouble(), input.nextDouble()));
		
		// color & filled
		System.out.print("color: ");
		triangle.setColor(input.next());

		System.out.print("is filled?: ");
		triangle.setFilled(input.nextBoolean());
		
		
		// Debug
		System.out.println("The Triangle: ");
		System.out.println(triangle.toString());
		
	}

}
