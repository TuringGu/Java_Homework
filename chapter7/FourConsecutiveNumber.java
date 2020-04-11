package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:43:54
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 7.30
 */
public class FourConsecutiveNumber {
	
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Create array
		int[] arrayTest = createIntArrayN();
		
		// Output & function
		if(isConsecutiveFour(arrayTest)) {
			System.out.println("The list has consecutive fours");
		}
		else {
			System.out.println("The list has no consecutive fours");
		}
		
	}
	
	
	/** Testing weather the array have four consecutive elements */
	public static boolean isConsecutiveFour(int[] values) {
		
		for(int i = 0; i < values.length - 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(values[i] != values[i + j]) {
					break;
				}
				else if(j == 3) {	// Already has consecutive fours
					return true;
				}
			}
		}
		return false;				// Not find consecutive fours
	}
	
	
	/** Create an array with n elements of numbers */
	public static int[] createIntArrayN() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Input length of the array
		System.out.print("Enter the number of values: ");
		int n = input.nextInt();
		
		// Create the array
		int[] intArray = new int[n];
		
		// Input the elements of the array
		System.out.print("Enter the values: ");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = input.nextInt();
		}
		
		return intArray;
	}
	
	

}
