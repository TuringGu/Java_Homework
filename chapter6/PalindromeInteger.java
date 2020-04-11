package chapter6;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:40:37
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.3
 */
public class PalindromeInteger {
	/** Main method */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		
		// Input a number
		System.out.print("Enter a number: ");
		int inputNumber = input.nextInt();
		
		// Output
		if(isPalindrome(inputNumber)) {
			System.out.println("Your input is a palindrome!");
		}
		else {
			System.out.println("Your input is not a palindrome!");
		}
	}
	
	// Return the reversal of an integer, i.e., reverse(456) returns 654
	// The head of the number can't be 0
	public static int reverse(int number) {
		int result = 0;                       // Which will be output
		int length = Length(number);

		int[] arrayDigit = new int[11];       // The length of 'int' <= 10
		
		//** My digit changing method */
		for(int i = 1; i <= length; i++) {
			int temp = number/(int)Math.pow(10, length - i);
			number = number - temp * (int)Math.pow(10, length - i);
			result = result + temp * (int)Math.pow(10, i - 1);
		}
		//*****************************/

		return result;
	}
	
	// To calculate the length of a number(positive)
	private static int Length(int number) {
		int lengthOfNumber = 0;
		while(number / 10 >= 1) {
			number = number / 10;
			lengthOfNumber ++;
		}
		lengthOfNumber ++;
		return lengthOfNumber;
	}

	// Return true if number is a Palindrome
	public static boolean isPalindrome(int number) {
		return reverse(number) == number;		
	}

}
