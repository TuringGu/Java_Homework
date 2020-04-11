package chapter4;
import java.util.*;

// Calculate the distance between two points one a ball surface
/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:34:54
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 4.2
 */
public class MaximumCircleDistance {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// input point1
		System.out.print("Enter point 1 (latitude and longitude) in degrees:");
		double latitudeA = input.nextDouble();
		double longitudeA = input.nextDouble();
		
		// input point2
		System.out.print("Enter point 2 (latitude and longitude) in degrees:");
		double latitudeB = input.nextDouble();
		double longitudeB = input.nextDouble();
		
		// degree to radiation
		double x1 = Math.toRadians(latitudeA);
		double y1 = Math.toRadians(longitudeA);
		double x2 = Math.toRadians(latitudeB);
		double y2 = Math.toRadians(longitudeB);
		
		// Function
		double d = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		System.out.println("The distance between the two point is " + d + " km." );

	}

}
