package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:46:09
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.27
 */
public class ColumnSort {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		double [][] input2DArray = createMatrix(3, 3);		// Create a 3 * 3 matrix
		
		// An Example you can put to use quickly
		/*double[][] input2DArray = {
				{0.15, 0.875, 0.375, 0.478},
				{0.55, 0.005, 0.225, 0.037},
				{0.30, 0.12 , 0.4  , 0.532},
				{0.43, 0.22 , 0.323, 0.232},
				{0.22, 0.032, 0.6  , 0.520}
		};*/
		
		double[][] new2DArray = sortColumn(input2DArray);	// Sort the column
		println2DArray(new2DArray);							// Output Array

	}

	
	// Sort a 2D array by column, return a new array
	public static double[][] sortColumn(double[][] m) {
		double[][] return2DArray = copy2DArray(m);	// Copy the 2D array to a new one
		
		// Sort the column
		for(int j = 0; j < return2DArray[0].length; j++) {
			double[] columnArray = new double[return2DArray.length];
			for(int i = 0; i < return2DArray.length; i++) {		// Assigning data
				columnArray[i] = return2DArray[i][j];
			}
			sort1DArrayAscending(columnArray);					// Sort
			for(int i = 0; i < return2DArray.length; i++) {		// Assigning back
				return2DArray[i][j] = columnArray[i]; 			
			}
		}
		
		return return2DArray;
	}
	
	
	// Copy an array to a new array, and return the new one(2D array)
	public static double[][] copy2DArray(double[][] m) {
		double [][] return2DArray = new double[m.length][m[0].length];	// Create a new array
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				return2DArray[i][j] = m[i][j];
			}
		}
		return return2DArray;
		
	}
	
	
	// Sort a 1D array by ascending order, and return the result
	public static void sort1DArrayAscending(double[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int k = i; k < array.length; k++) {
				if(array[i] > array[k]) {
					
					// Swap
					double temp = array[i];
					array[i] = array[k];
					array[k] = temp;
				}
			}
		}
	}
	
	
	// Create a m * n matrix
	public static double[][] createMatrix(int m, int n) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[m][n];	// Initial
		
		System.out.print("Enter matrix with size(" + m + " * " + n + ") row by row: \n");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}
	
	
	// Output 2D array
	public static void println2DArray(double[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.printf("%5.3f   ", array[i][j]);
			}
			System.out.println();
		}
	}

	
}
