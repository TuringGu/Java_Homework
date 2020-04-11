package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:46:58
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 *
 * Exam 8.15
 */
public class IsInALine {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] points = new double[5][2];
		
		// Enter the points
		for(int i = 0; i < points.length; i++) {
			for(int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		
		// Output
		if(sameLine(points)) {
			System.out.println("The five points are in the same line");
		}
		else {
			System.out.println("The five points are not in the same line");
		}
		
		
	}
	
	
	// Check weather the points are all in the same line (points >= 3)
	public static boolean sameLine(double[][] points) {
		boolean flag = true;
		for(int i = 0; i < points.length - 2; i++) {
			
			// Exist Three points are not in the same line
			if(!onTheSameLine(points[i][0], points[i][1], points[i + 1][0], 
					points[i + 1][1],points[i + 2][0], points[i + 2][1]) ) {
				flag = false;
			}
		}
		
		return flag;
	}
	
	
	/** Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)*/
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		boolean flag = false;
		double delta = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if(Math.abs(delta) < 0.00000001) {	// In a line
			flag = true;
		}
		else {								// Not in a line
			flag = false;
		}
		return flag;
		
	}

}
