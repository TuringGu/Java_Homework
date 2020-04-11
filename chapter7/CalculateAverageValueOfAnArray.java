package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:42:08
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.8
 */
public class CalculateAverageValueOfAnArray {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double[] numberArray = new double[10]; // Declare an array
		
		// Input
		System.out.print("Enter ten number(Double): ");
		for(int i = 0; i <= 10 - 1; i++) {
			numberArray[i] = input.nextDouble();
		}
		
		// Output
		System.out.println("The average value: " + average(numberArray));
	
	}
	
	// Return the average value(Integer) of an array
	public static int average(int[] array) {
		int sum = 0; // The sum of the array
		for(int i = 0; i <= array.length - 1; i++) {
			sum += array[i];
		}
		return (int)(sum/array.length);
	}
	
	// Return the average value(Double) of an array
	public static double average(double[] array) {
		double sum = 0; // The sum of the array
		for(int i = 0; i <= array.length - 1; i++) {
			sum += array[i];
		}
		return (sum/array.length);
	}
}
