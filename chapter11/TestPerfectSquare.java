/**
 * @Project_name: JavaMyHomework
 * @File_name: TestPerfectSquare.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午6:58:56
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Turing-G
 * Exam 11.17
 */
public class TestPerfectSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Data preparation
		System.out.print("Enter an integer m: ");
		long m = input.nextInt();

		// Display
		long n = minNumberToMakePerfectSquare(m);
		System.out.println("The smallest number n for m * n to be a perfect sqare is " + n);
		System.out.println("m * n is " + m * n);
	}
	
	
	/** Find the minimum integer n to make the m * n is a perfect square */
	public static long minNumberToMakePerfectSquare(long m) {
		
		// The wrong m (terminate the function)
		if(m < 0) {
			System.out.println("Error: m can't < 0");
			System.exit(0);
		}
		
		// The special case (terminate the function)
		if(m == 0 && m == 1) {
			return m;
		}
		
		// Initial the n & temp
		long n = 1;	
		long temp = 0;	// To disable the duplicate elements
			
		// Store all the minimum factors to an ArrayList<Long>
		ArrayList<Long> factorsList = solutionsOfFactoring(m);
		
		//Find the minimum n
		for(int i = 0; i < factorsList.size(); i++) {
			
			// If the element appear odd numbers 
			if(((occurrenceNumber(factorsList, factorsList.get(i)) % 2) == 1) &&	
					(temp != factorsList.get(i))) {		// The element is not duplicate
				n *= factorsList.get(i);
				temp = factorsList.get(i);	// Update the temp
			}
		}
		
		// Return 
		return n;
	}
	
	
	
	/** Store all the minimum factors to an ArrayList */
	public static ArrayList<Long> solutionsOfFactoring(long m) {
		// Initial
		ArrayList<Long> factorsList = new ArrayList<>();
		long remain = m;	// The temp 
		
		for(long i = 2; remain != 1 ; i++) {	// When remain == 1, terminate the loop
			while(remain % i == 0) {
				factorsList.add(new Long(i));	// Assigning
				remain /= i;	// Update the remain
			}
		}
		
		return factorsList;
	}
	
	
	/** Calculate the occurrence number of an element in an ArrayList<Long>*/
	public static long occurrenceNumber(ArrayList<Long> list, long element) {
		long times = 0;
		for(int i = 0; i < list.size(); i++) {
			if(element == list.get(i)) {
				times++;
			}
		}
		return times;
	}

	
}
