package chapter6;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:41:24
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.26
 */
public class PrimePalindromes {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("Display 100 prime palindromes forahead");
		
		for(int i = 1, n = 2; i <= 100; n++) {
			
			// Weather a prime && Weather a palindrome
			if(isPrime(n) && PalindromeInteger.isPalindrome(n)) {     
				if(i % 10 == 0) {
					System.out.println(n);
					i++;
				}
				else {
					System.out.print(n + " ");
					i++;
				}
			}
		}
	}
	
	// Judge weather a number is a prime
	public static boolean isPrime(int n) {
		if(n == 1) {             // 1 is not a prime
			return false;
		}
		
		// Function
		for(int i = 2; i <= n/2; i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
