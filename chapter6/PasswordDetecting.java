package chapter6;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:41:05
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.18
 */
public class PasswordDetecting {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter the password: ");
		String password = input.nextLine();
		
		// To judge weather a valid password
		if(isValidPassword(password)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
	
	// To judge weather the password is a valid one
	public static boolean isValidPassword(String password) {
		
		if(password.length() >= 8) {                       // The length >= 8
			if(isLegallyPasswordCharacter(password)) {       // Only have digits or characters
				if(theDigitNumber(password) >= 2) {        // Not less than 2 digits
					return true;
				}
			}
		}
		return false;
	}

	
	// To judge weather the password of characters type is legally
	public static boolean isLegallyPasswordCharacter(String password) {
		for(int i = 1; i <= password.length(); i++) {
			if(!Character.isDigit(password.charAt(i - 1)) && !Character.isLetter(password.charAt(i - 1))) {
				return false;
			}
		}
		return true;
	}
	

	// To calculate the digit number of the string
	public static int theDigitNumber(String string) {
		int sum = 0;
		for(int i = 1; i <= string.length(); i++) {
			if(Character.isDigit(string.charAt(i - 1))) {
				sum++;
			}
		}
		return sum;
	}
	
	

}
