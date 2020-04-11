package chapter5;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:36:00
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 *  
 * Exam 5.45
 */
public class CalculateAverageAndStandardDeviation {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		Scanner input = new Scanner(System.in);
		
		double[] arrayEnter = new double[10 + 1];
		double sum = 0, average = 0, standardDeviation = 0;
		
		// Input
		System.out.print("Enter ten numbers: ");
		for(int i = 1; i <= 10; i++) {
			arrayEnter[i] = input.nextDouble();
			sum += arrayEnter[i];
		}
		
		// The average
		average = sum/10;
		
		// The calculate of standard Deviation
		double temp = 0;
		for(int i = 1; i <= 10; i++) {
			temp += Math.pow(arrayEnter[i], 2);
		}
		
		standardDeviation = Math.pow(((temp - (Math.pow(sum, 2))/10)/(10 - 1)), 0.5);
		
		// Output
		System.out.println("The mean is: " + average);
		System.out.println("The standard deviation is: " + standardDeviation);
		
		
	}

}
