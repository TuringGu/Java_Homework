package chapter9;
import java.util.Date;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:49:47
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.3
 */
public class TestSimpleData {
	/** Main method */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		long elapseTime = 1000;				// Initial the elapseTime
		Date[] dateArray = new Date[8];		// Create an object array: dateArray[]
		
		// Initial the dateArray & Output the data
		for(int i = 0; i < dateArray.length; i++) {
			elapseTime *= 10;
			dateArray[i] = new Date(elapseTime);
			System.out.println("The elapsed time since Jan 1, 1970 is " + dateArray[i].getTime() + " milliseconds");
			System.out.println(dateArray[i].toString());
			System.out.println();
		}
	}

}
