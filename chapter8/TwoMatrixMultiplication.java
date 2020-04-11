package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:48:33
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.6
 */
public class TwoMatrixMultiplication {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Input 
		double[][] a = createMatrix(3, 3);
		double[][] b = createMatrix(3, 3);
		
		/* The Example that you can use directly
		 * double[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		double[][] b = {
				{0, 2.0, 4.0, 5.0},
				{1, 4.5, 2.2, 6.0},
				{1.1, 4.3, 5.2, 7.0}
		};*/
		
		// Multiply
		double[][] c = multiplyMatrix(a, b);
		
		// Println
		printlnMultiplication(a, b, c);
	}
	
	
	// multiply two matrix
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[a.length][b[0].length];	// Initial result matrix c
		if(isLegallyMultiplication(a, b)) {	// Legally multiplication
			
			// assigning results to matrix c
			for(int i = 0; i < c.length; i++) {
				for(int j = 0; j < c[i].length; j++) {
					c[i][j] = 0;	// Initial elements of c
					
					// The multiplication progress of every elements of c
					for(int k = 0; k < a[i].length; k++) {
							c[i][j] += a[i][k] * b[k][j];
						}
					}
				}
			}
		else{
			System.out.println("The multiplication is illegally");
		}
		return c;
	}
	
	
	// Judge weather the multiplication is legally
	public static boolean isLegallyMultiplication(double[][] a, double[][] b) {
		boolean value = true;	// The value will be return
		for(int i = 0; i < a.length; i++) {
			if(a[i].length != b.length) {
				value = false;
				break;
			}
		}
		return value;
	}
	
	
	// Create a m * n matrix
	public static double[][] createMatrix(int m, int n) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[m][n];	// Initial
		
		System.out.print("Enter matrix with size(" + m + " * " + n + "): \n");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}
	
	
	// println the multiplication 
	public static void printlnMultiplication(double[][] a, double[][] b, double[][] c) {
		
		// Get the size of printArray[][]
		int iPrintArray = 0;	int jPrintArray = 0;	
		iPrintArray = (a[0].length > b[0].length) ? a[0].length : b[0].length;	// The max of row a[][] & b[][]
		jPrintArray = a.length + b.length + c.length + 6;						// The max of column
		
		double[][] printArray = new double[iPrintArray][jPrintArray];
		initialMatrixWithZero(printArray);										// Assigning with 0
		
		// Assigning what should be println
		// The a[][]
		for(int pi = printArray.length - 1, i = a.length - 1; pi > printArray.length - a.length - 1; pi--, i--) {
			for(int pj = 0, j = 0; pj < a[pi].length; pj++, j++) {
				printArray[pi][pj] = a[i][j];
			}
		}
		// The b[][]
		for(int pi = printArray.length - 1, i = b.length - 1; pi > printArray.length - b.length - 1; pi--, i--) {
			for(int pj = a[0].length + 3, j = 0; pj < a[0].length + b[0].length + 3; pj++, j++) {
				printArray[pi][pj] = b[i][j];
			}
		}
		// The c[][]
		for(int pi = printArray.length - 1, i = c.length - 1; pi > printArray.length - c.length - 1; pi--, i--) {
			for(int pj = a[0].length + b[0].length + 6, j = 0; pj < printArray[0].length; pj++, j++) {
				printArray[pi][pj] = c[i][j];
			}
		}
		// The sign (-20162001: *, -20162002: =)
		
		// The location of sign
		int iSign1, iSign2, jSign1, jSign2;
		int temp = Math.abs(a[0].length - b[0].length);
		iSign1 = iSign2 = temp + (iPrintArray - temp)/2;
		jSign1 = a[0].length + 1;
		jSign2 = a[0].length + b[0].length + 4;
		
		printArray[iSign1][jSign1] = -20162001;	// The *
		printArray[iSign2][jSign2] = -20162002; // The =
		
		// Println
		System.out.println("The multiplication of the matrices is: ");
		printlnMatrix(printArray);
	}
	
	
	// Initial the matrix (assigning all elements with 2147483647)
	public static void initialMatrixWithZero(double[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = 2147483647;	// Special value
			}
		}
	}
	
	
	// Println the matrix
	public static void printlnMatrix(double[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++){
				switch((int)matrix[i][j]) {
				case 2147483647:	{
					System.out.print("      ");
					break;
				}
				case -20162001: {	// Sign * 
					System.out.print("  *   ");
					break;
				}
				case -20162002: {	// Sing =
					System.out.print("  =   ");
					break;
				}
				default: {
					System.out.printf("%5.1f ", matrix[i][j]);
				}
				}
			}
			System.out.println();
		}
	}

}
