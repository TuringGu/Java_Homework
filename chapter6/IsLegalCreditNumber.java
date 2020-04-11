package chapter6;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:39:58
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.30
 */
public class IsLegalCreditNumber {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Input  (eg: 4388576018402626 is valid   4388576018410707 is invalid)
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number as a long integer: ");
		long creditNumber = input.nextLong();
	
		// Output
		if(isValid(creditNumber)) {
			System.out.println(creditNumber + " is valid");
		}
		else {
			System.out.println(creditNumber + " is invalid");
		}
	}
	
	/** Return true if the card number is valid*/
	public static boolean isValid(long number) {
		
		// 13 <= size <= 16
		if(getSize(number) >= 13 && getSize(number) <= 16) {	
			// Prefix number matched 4 or 5 or 37 or 6
			if(prefixMatched(number, 4) || prefixMatched(number, 5) || 
					prefixMatched(number, 37) || prefixMatched(number, 6)) {
				// The special sum should be divisible by 10
				if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;                        				// The value will be return
		do{
			sum += getDigit(2 * (int)getPrefix(number, 1));	// Get every digit from left to right
			
			// delete the head one digit in number
			number -= getPrefix(number, 1) * Math.pow(10, getSize(number) - 1);
		} while(number != 0);								// Use the last digit 
		
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits */
	public static int getDigit(int number)  {
		int value = 0;
		if (getSize(number) == 1 || getSize(number) == 2) {
			value = number/10 + number % 10;
		}
		else {  						// throw out
			System.out.println("The getDigit get wrong!");
			return -1;
		}
		return value;
	}
	
	/** Return sum of odd-place digits in number */
	/* from left to right */
	public static int sumOfOddPlace(long number) {
		int sum = 0;                        // The value will be return
		do{
			sum += getPrefix(number, 1);	// Get the odd-place digits
			// delete the head two digit in number
			number -= getPrefix(number, 2) * Math.pow(10, getSize(number) - 2);
		} while(getSize(number) >= 2);
		if(number != 0) {              		// When the last number is a single digit
			sum += number;
		}
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		if(getPrefix(number, getSize(d)) == d) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Return the number of digits in d */ 
	public static int getSize(long d) {
		int sizeOfNumber = 0;
		while(d / 10 >= 1) {
			d = d / 10;
			sizeOfNumber ++;
		}
		sizeOfNumber ++;
		return sizeOfNumber;
	}
	
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		if(k > getSize(number)) {
			return number;
		}
		else {
			return (int)(number/Math.pow(10, getSize(number) - k));
		}
	}
	
}
