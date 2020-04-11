package chapter8;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:47:14
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.11
 */
public class NineFrontAndBackGame {

	/** The Main */
	public static void main(String[] args) {

		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int inputNumber = input.nextInt();
		if(inputNumber < 0 || inputNumber > 511) {
			System.out.println("Error input!");
			return;
		}
		
		// Create array[][]
		int[][] array = createArray(3);
		int[] binaryArray = integerToBinary(inputNumber);
		
		// Assigning
		for(int i = 0, k = array.length * array[i].length - 1; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(k < binaryArray.length && k >= 0) {
					array[i][j] = binaryArray[k];					
				}
				k--;
			}
		}
		
		// Output
		printlnArray(array);
		return;
	}
	
	
	// Create the 3 * 3 Array(int)
	public static int[][] createArray(int n) {
		
		int[][] array = new int[n][n];	// Initial
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = 0;
			}
		}
		return array;
	}
	
	
	// Integer to binary
	public static int[] integerToBinary(int inputNumber) {
		int[] binaryArray = new int[getSizeOfIntegerToBinary(inputNumber)];
		for(int i = 0; i < binaryArray.length; i++) {
			binaryArray[i] = inputNumber % 2;
			inputNumber /= 2;
		}
		return binaryArray;
	}
	
	/** Return the when the integer to binary ,the digit of number */ 
	public static int getSizeOfIntegerToBinary(int d) {
		int sizeOfNumber = 0;
		while(d / 2 >= 1) {
			d = d / 2;
			sizeOfNumber ++;
		}
		sizeOfNumber ++;
		return sizeOfNumber;
	}
	
	
	// Println the condition of the array
	public static void printlnArray(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == 0) {
					System.out.print("H ");
				}
				else if(array[i][j] == 1) {
					System.out.print("T ");
				}
				else {
					System.out.println("Error: PrintlnArray, The array" + "[" + i + "]" + "[" + j + "] = " + array[i][j]);
				}
			}
			System.out.println();
		}
		return;
	}
	

	
	

	

}
