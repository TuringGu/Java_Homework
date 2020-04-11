package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:47:50
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.35
 */
public class TheLargestBlock {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter the n of the matrix: ");
		int[][] inputMatrix = inputToCreateMatrix(input.nextInt());

		// An example you could put to use quickly
		/*int[][] inputMatrix = {
				{0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0},
				{1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1},
				{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0},
				{0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0},
				{0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1},
				{1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0},
				{1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0},
				{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
		};*/
		
		int[] returnArray = findLargestBlock(inputMatrix);
		
		// Output
		if(returnArray[2] == 0) {
			System.out.println("The matrix don't have 1 block, the size is 0");
		}
		else {
			System.out.println("The maximum sqaure submatrix is at (" + returnArray[0] + ", " + returnArray[1] + ") with size " + returnArray[2]);
		}
		
	}
	
	
	/** Find the largest block
	 * for the return 1D array: [0] row, [1] column, [2] the number of the row of the block */
	public static int[] findLargestBlock(int[][] m) {
		
		int n = 0;	// Store the max size of the block
		int[] returnArray = {-1, -1, -1};	// The return array
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {

				// Find weather have (n + 1) * (n + 1) block
				while(haveBlockN(m, n + 1, i, j)){
					
					returnArray[0] = i;
					returnArray[1] = j;
					returnArray[2] = n + 1;
					n += 1;
				} 
			}
		}
		
		return returnArray;
	}
	
	
	// Judging weather have a n * n block, m[i][j] is the first element of the block
	public static boolean haveBlockN(int[][] m, int n, int i, int j) {
		
		// Judging weather have the 1 * 1 sub block
		if(n == 1) {
			if(i < 0 || i > m.length - 1 || j < 0 || j > m.length - 1) {
				return false;	// Out of bound
			}
			else if(m[i][j] == 1) {	
				return true;
			}
		}
		
		else {
			if(	// Judging weather have the four (n - 1) * (n - 1) sub block
				haveBlockN(m, n - 1, i, j) &&
				haveBlockN(m, n - 1, i, j + 1) &&
				haveBlockN(m, n - 1, i + 1, j) &&
				haveBlockN(m, n - 1, i + 1, j + 1)
			) {
				return true;
			}
		}
		
		// Don't have the n * n block
		return false;
	}
	

	
	// Create a matrix of n * n by user's input
	public static int[][] inputToCreateMatrix(int n) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the matrix row by row: ");
		int[][] m = new int[n][n];
		for(int row = 0; row < m.length; row++) {
			for(int column = 0; column < m[row].length; column++) {
				m[row][column] = input.nextInt();
			}
		}
		return m;
	}
	
	
}
