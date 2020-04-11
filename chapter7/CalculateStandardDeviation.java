package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:42:26
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.11
 */
public class CalculateStandardDeviation {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double[] numberArray = new double[10 + 1]; // Declare an array to memorize the input numbers [1 ~ 10]
		
		// Input
		System.out.print("Enter ten numbers: ");
		for(int i = 1; i <= numberArray.length - 1; i++) {
			numberArray[i] = input.nextDouble();
		}
		
		// Output
		System.out.printf("The mean is %.2f\n", mean(numberArray));
		System.out.printf("The standart deviation is %.5f\n", deviation(numberArray));
	}
	
	/** Compute the deviation of double values */
	public static double deviation(double[] x) {
		double temp = 0; 
		for(int i = 1; i <= x.length - 1; i++) {
			temp += Math.pow(x[i] - mean(x), 2);
		}
		return Math.pow(temp/((x.length - 1) - 1), 0.5);
	}
	
	/** Compute the mean of an array of double values */
	public static double mean(double[] x) {
		double sum = 0; // The sum of the array
		for(int i = 1; i <= x.length - 1; i++) {
			sum += x[i];
		}
		return (sum/(x.length - 1));
	}

}
