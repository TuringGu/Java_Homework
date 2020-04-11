package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:47:33
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 8.33
 */
public class SubAreaOfAPolygon {

	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		// Initial
		double[][] polygon = CreatePolygon(4);	// Create a quadrangle
		
		// An example you could put to use quickly
        /*double[][] polygon = {
				{-2.5, 2},
				{4, 4},
				{3, -2},
				{-2, -3.5}
		};*/
		
		// An example you could put to use quickly
		/*double[][] polygon = {
				{-2, 2}, {-1, -1}, {1, -1}, {2, 2}
		};*/
		
		
		double[][][] triangles = divideQuadrangleIntoTriangles(polygon);	// Divide it to four triangles
		double[] areaOfTriangles = new double[triangles.length];	// Memorize the area of the triangles
		
		// Calculate the area of triangles assigning to areaOfTriangle[]
		for(int i = 0; i < areaOfTriangles.length; i++) {
			areaOfTriangles[i] = calculateAreaOfTriangle(triangles[i]);
		}
		
		// Output
		System.out.print("The areas are ");
		printlnAreaByAscendingOrder(areaOfTriangles);
		System.out.println();
	}

	
	/** Create a polygon with n edges, store it into a 2D array by points location
	 * The creation must be brushstroke to become a polygon*/
	public static double[][] CreatePolygon(int n) {
		double[][] polygon = new double[n][2];	// Initial a 2D array
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Data input
		System.out.println("Create a polygon with " + n + " edges: ");
		for(int i = 0; i < polygon.length; i++) {	// Get a point's location
			System.out.println("Enter v" + i + ": ");
			System.out.print("x" + i + ": ");	polygon[i][0] = input.nextDouble();
			System.out.print("y" + i + ": ");	polygon[i][1] = input.nextDouble();
		}
		
		return polygon;
	}
	
	
	// Divide a quadrangle into four sub triangles 
	public static double[][][] divideQuadrangleIntoTriangles(double[][] polygon) {
		double[] crossoverPoint = findCrossoverPoint(polygon);
		double[][][] triangles = new double[4][3][2];
		for(int z = 0; z < triangles.length; z++) {
			
			// Use three point to make up a triangle
			triangles[z][0][0] = crossoverPoint[0];
			triangles[z][0][1] = crossoverPoint[1];
			
			if(z == triangles.length - 1) {		// At the bound of the array
				triangles[z][1][0] = polygon[z][0];
				triangles[z][1][1] = polygon[z][1];
				triangles[z][2][0] = polygon[0][0];
				triangles[z][2][1] = polygon[0][1];
			}
			else {
				triangles[z][1][0] = polygon[z][0];
				triangles[z][1][1] = polygon[z][1];
				triangles[z][2][0] = polygon[z + 1][0];
				triangles[z][2][1] = polygon[z + 1][1];				
			}
		}
		return triangles;
	}
	
	
	// Find the crossover points from the quadrangle
	public static double[] findCrossoverPoint(double[][] polygon) {
		
		// Calculate the coefficient of the two equations
		double a0 = polygon[2][1] - polygon[0][1];
		double a1 = polygon[3][1] - polygon[1][1];
		
		double b0 = polygon[0][0] - polygon[2][0];
		double b1 = polygon[1][0] - polygon[3][0];
		
		double c0 = polygon[2][0] * polygon[0][1] - polygon[0][0] * polygon[2][1];
		double c1 = polygon[3][0] * polygon[1][1] - polygon[1][0] * polygon[3][1];
		
		// Calculate the crossover point
		double x = (c1/b1 - c0/b0) / (a0/b0 - a1/b1);
		double y = -(a1/b1) * x - (c1/b1);
		
		// Return the point
		double [] point = {x, y};
		return point;
	}
	
	
	// Calculate the area of a triangle
	public static double calculateAreaOfTriangle(double[][] triangle) {
		
		// Calculate the length of the edge
		double a = distanceOfTwoPoints(triangle[0][0], triangle[0][1], triangle[1][0], triangle[1][1]);
		double b = distanceOfTwoPoints(triangle[1][0], triangle[1][1], triangle[2][0], triangle[2][1]);
		double c = distanceOfTwoPoints(triangle[2][0], triangle[2][1], triangle[0][0], triangle[0][1]);
		
		// Perimeter of triangle
		double perimeter = a + b + c;
		
		// p is half of perimeter
		double p = perimeter / 2;
		
		// Heron's formula
		double area = Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);

		// Return result
		return area;
	}
	
	
	// Calculate distance of two points
	public static double distanceOfTwoPoints(double x1, double y1, double x2, double y2) {
		double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
		return distance;
	}
	
	
	// Println triangles area by Ascending order
	public static void printlnAreaByAscendingOrder(double[] areaOfTriangles) {
		
		// Initial flag with -1
		int[] flag = new int[areaOfTriangles.length];	// Control the loop
		for(int i = 0; i < flag.length; i++) {
			flag[i] = -1;
		}
		
		// Get the order and put it into flag[]
		for(int i = 0; i < areaOfTriangles.length; i++) {
			double min = 2147483647;	// Initial the min with 2147483647
			int temp = 0; 				// Store the log
			for(int k = 0; k < areaOfTriangles.length; k++) {
				if(min > areaOfTriangles[k] && flag[k] == -1) {	// Hadn't trace 
					
					// Update the min
					min = areaOfTriangles[k];
					temp = k;	
				}
			}
			flag[temp] = i;		// Marking: had traced Area[temp] and assigning its order with i
		}
		
		// Output
		for(int i = 0; i < flag.length; i++) {
			for(int k = 0; k < flag.length; k++) {
				if(flag[k] == i) {
					System.out.printf("%.2f ", areaOfTriangles[k]);
					break;
				}
			}
		}
	}
	
}
