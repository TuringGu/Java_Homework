/**
 * @Project_name: JavaMyHomework
 * @File_name: TestBigIntegerRational.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月8日	
 * @Time: 下午8:36:43
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.math.BigInteger;

/**
 * @author Turing-G
 * Exam 13.18
 */
public class TestBigIntegerRational {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Data preparation
		BigIntegerRational sum = new BigIntegerRational(BigInteger.ZERO, BigInteger.ONE);
		BigInteger numerator = BigInteger.ZERO;
		BigInteger denominator = BigInteger.ONE;
		BigIntegerRational fraction = new BigIntegerRational(numerator, denominator);
		
		// Print the history result
		System.out.println("The history result: ");
		System.out.println("1/2 + 2/3 + ... + 10/11");
		System.out.println("result: 221209/27720");
		System.out.println("time < 1s");
		System.out.println("**************************************");
		
		System.out.println("1/2 + 2/3 + ... + 17/18");
		System.out.println("result: 59239139/4084080");
		System.out.println("time > 17s");
		System.out.println("**************************************");
		
		// Tell to wait
		System.out.println("1/2 + 2/3 + ... + 99/100");
		System.out.println("Keep waiting the result if you like Orz");
		
		// Calculate the sum
		for(int i = 1; i <= 99; i++) {
			// fraction updates
			numerator = numerator.add(BigInteger.ONE);
			denominator = denominator.add(BigInteger.ONE);
			fraction = new BigIntegerRational(numerator, denominator);

			// sum updates
			sum = sum.add(fraction);
		}
		
		// Print the result
		System.out.println("result: " + sum);

	}

}
