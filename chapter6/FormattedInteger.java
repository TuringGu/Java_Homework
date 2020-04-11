package chapter6;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:39:35
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.37
 */
public class FormattedInteger {
	/**The Main*/
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number and the output width you want.");
		System.out.print("number: ");		int number = input.nextInt();
		System.out.print("width: ");		int width = input.nextInt();
		
		// Output
		System.out.println("The output: " + format(number, width));
	}
	
	// Format the integer to the specified width
	public static String format(int number, int width) {
		String numberString = null;         // The digit number of int < 12
		numberString = Integer.toString(number);
		
		if(getSize(number) >= width) {      
			return numberString;
		}
		else {								// Add "0" on the head
			for(int i = 1; i <= (width - getSize(number)); i++) {
				numberString = "0" + numberString;
			}
			return numberString;
		}
	}
	
	/** Return the number of digits in d */ 
	public static int getSize(int d) {
		int sizeOfNumber = 0;
		while(d / 10 >= 1) {
			d = d / 10;
			sizeOfNumber ++;
		}
		sizeOfNumber ++;
		return sizeOfNumber;
	}
	
}
