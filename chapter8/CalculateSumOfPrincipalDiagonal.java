package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:45:52
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.2
 */
public class CalculateSumOfPrincipalDiagonal {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] m = inputToCreateMatrix(4);
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
	}
	
	
	// Calculate the sum of the major diagonal of the n * n matrix
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;	// The sum will be return
		for(int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}
		return sum;
	}
	
	
	// Create a matrix of n * n by user's input
	public static double[][] inputToCreateMatrix(int n) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[][] m = new double[n][n];
		for(int row = 0; row < m.length; row++) {
			for(int column = 0; column < m[row].length; column++) {
				m[row][column] = input.nextDouble();
			}
		}
		return m;
	}
	
	
	// println the n * n matrix m
	public static void outputMatrix(double[][] m) {
		for(int row = 0; row < m.length; row++) {
			for(int column = 0; column < m[row].length; column++) {
				System.out.print(m[row][column]);
			}
			System.out.println();
		}
	}
}
