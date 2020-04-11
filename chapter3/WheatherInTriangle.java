package chapter3;
import java.util.*;


//To calculate weather a point is in a triangle
/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:32:55
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 3.27
 */
public class WheatherInTriangle {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// Function
		if(x > 0 && y > 0 && y < (100 - x/2)) {
			System.out.println("The point is in the triangle");
			}
		else {
			System.out.println("The point is not in the triangle");
			}
		
	}

}
