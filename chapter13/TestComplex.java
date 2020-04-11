/**
 * @Project_name: JavaMyHomework
 * @File_name: TestComplex.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月8日	
 * @Time: 下午8:10:22
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.util.Scanner;

/**
 * @author Turing-G
 * Exam 13.17
 */
public class TestComplex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Data input
		System.out.print("Enter the first complex number: ");
		double a1 = input.nextDouble();
		double b1 = input.nextDouble();
		System.out.print("Enter the second complex number: ");
		double a2 = input.nextDouble();
		double b2 = input.nextDouble();
		
		// Objects creating
		Complex comp1 = new Complex(a1, b1);
		Complex comp2 = new Complex(a2, b2);
		
		// Data processing
		// Add
		System.out.println("(" + comp1.toString() + ") + (" + comp2.toString() +
				") = " + comp1.add(comp2).toString());
		// Subtract
		System.out.println("(" + comp1.toString() + ") - (" + comp2.toString() +
				") = " + comp1.subtract(comp2).toString());
		// Multiply
		System.out.println("(" + comp1.toString() + ") * (" + comp2.toString() +
				") = " + comp1.multiply(comp2).toString());
		// Divide
		System.out.println("(" + comp1.toString() + ") / (" + comp2.toString() +
				") = " + comp1.divide(comp2).toString());
		// Absolution
		System.out.println("|(" + comp1.toString() + "|) = " + comp1.abs());
	}

}
