package chapter4;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:35:19
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 4.6
 */
public class TheRandomPointInCircle {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Randomly generated three points in the circle");
		
		// The radius of circle
		double r = 40;	
		
		// generate the randomly radiation in (0, 2 * PI)
		double t1 = (double)(Math.random() * (2 * Math.PI));
		double x1 = r * Math.cos(t1);	double y1 = r * Math.sin(t1);
		double t2 = (double)(Math.random() * (2 * Math.PI));
		double x2 = r * Math.cos(t2);	double y2 = r * Math.sin(t2);
		double t3 = (double)(Math.random() * (2 * Math.PI));
		double x3 = r * Math.cos(t3);	double y3 = r * Math.sin(t3);
		
		//*******The main function*****************	
		// The triangle's edges
		double a = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2));
		double b = Math.sqrt(Math.pow((x2 - x3),2) + Math.pow((y2 - y3), 2));
		double c = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1), 2));
		
		// Calculate the angles(radiation)
		double A = Math.acos((a * a - b * b - c * c)/(-2 * b * c));
		double B = Math.acos((b * b - a * a - c * c)/(-2 * a * c));
		double C = Math.acos((c * c - b * b - a * a)/(-2 * a * b));
		
		// To degree
		A = Math.toDegrees(A);
		B = Math.toDegrees(B);
		C = Math.toDegrees(C);
		//*****************************************
		
		// Output the points
		System.out.println("The three points are:\n");
		System.out.println("point1:" + "(" + x1 + ", " + y1 + ")\n");
		System.out.println("point2:" + "(" + x2 + ", " + y2 + ")\n");
		System.out.println("point3:" + "(" + x3 + ", " + y3 + ")\n");
		
		// Output the angle
		System.out.println("The three angles are:" + A + " " + B + " " + C);

	}

}
