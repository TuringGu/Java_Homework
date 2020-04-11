package chapter10;
import java.math.BigInteger;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:51:22
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.16
 */
public class ExactlyDivisibleBy2Or3 {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Data preparation
		BigInteger bigNumber = new BigInteger("1");
		
		// Create a BigInteger with 50 decimal
		for(int i = 1; i < 50; i++) {
			bigNumber = bigNumber.multiply(new BigInteger("10"));
		}
		
		// Judge weather can exactly divisible by 2 or 3
		System.out.println("The solution:");
		int i = 0;
		while(i < 10) {
			if(bigNumber.remainder(new BigInteger("2")).equals(new BigInteger("0")) ||
					bigNumber.remainder(new BigInteger("3")).equals(new BigInteger("0"))
					) {
				i++;
				System.out.println(bigNumber);	// Print the bigNumber
			}
			bigNumber = bigNumber.add(new BigInteger("1"));	// Update the bigNumber
		}
	}

}
