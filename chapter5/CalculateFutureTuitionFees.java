package chapter5;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:36:24
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 5.7
 */
public class CalculateFutureTuitionFees {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		double tuition = 10000;
		double sum = 0;
		
		// Calculate the tuition fees of ten years later
		for(int i = 1; i <= 10; i++) {
			tuition *= 1.05; 
		}
		
		// Calculate the summary of the tuition fees in eleven to fourteen years
		for(int j = 11; j <= 14; j++) {
			tuition *= 1.05;
			sum += tuition;
		}

		System.out.println("Ten years later, the tuition fees is: " + tuition + "/n");
		System.out.println("The four years fees in eleven to fourteen years is: " + sum);
	}

}
