package chapter6;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:40:21
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.28
 */
public class MersennePrime {
	/** The Main */
	// Print the Mersenne Prime
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("p               2^p - 1");
		System.out.println("--------------------------------");
		for(int p = 2; p <= 31; p++) {
			int temp = (int)Math.pow(2, p) - 1;
			if(PrimePalindromes.isPrime(temp)) {         //Judge weather a prime
				System.out.printf("%2d               ", p);
				System.out.println(temp);
			}
		}
	}

}
