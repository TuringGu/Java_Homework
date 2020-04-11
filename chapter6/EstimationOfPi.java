package chapter6;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:39:10
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.14
 */
public class EstimationOfPi {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("i            m(i)");
		for(int i = 1; i <= 901; i += 100) {
			System.out.printf("%3d          ", i);
			System.out.printf("%5.4f", calculatePi(i));
			System.out.print("\n");
		}

	}
	
	
	// Calculate Pi
	public static double calculatePi(int i) {
		double sum = 0;
		for(int j = 1; j <= i; j++) {
			sum = sum + 4 * Math.pow(-1, j + 1)/(2 * j - 1);
		}
		return sum;
	}

}
