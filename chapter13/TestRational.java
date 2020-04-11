/**
 * @Project_name: JavaMyHomework
 * @File_name: TestRational.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月8日	
 * @Time: 上午11:26:29
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

/**
 * @author Turing-G
 * Exam 13.14
 */
public class TestRational {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initial three rational objects
		Rational r1 = new Rational(729, 23);
		Rational r2 = new Rational(23, 7);
		Rational r3 = new Rational(74, 278);
		
		// About testing
		System.out.println("r1 + r2 = " + r1.add(r2));
		System.out.println("r2 - r3 = " + r2.subtract(r3));
		System.out.println("r3 * r1 = " + r3.multiply(r1));
		System.out.println("r1 / r3 = " + r1.divide(r3));
		System.out.println("r1 / r3 to String = " + r1.divide(r3).toString());
		System.out.println("r1 compareTo r3 = " + r1.compareTo(r3));
		System.out.println("r1 to int = " + r1.intValue());
		System.out.println("r1 to float = " + r1.floatValue());
		System.out.println("r1 to long = " + r1.longValue());
	}

}
