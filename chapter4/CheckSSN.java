package chapter4;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:34:02
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 4.21
 */
public class CheckSSN {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a SSN (XXX-XX-XXXX): ");
		String str = input.nextLine();
		int length = str.length();
		
		if(length != 11) {                                // If the length isn't 11
			System.out.println(str + " is an invalid social number");
			return;
		}
		
		for(int i = 0; i <= length - 1; i++) {
			if(!Character.isDigit(str.charAt(i))) {       // If isn't a digit
				if(str.charAt(i) == '-') {                // If isn't '-'
					if((i != 3) && ((i != 6))) {          // If the '-' location is not 3 or 6
						System.out.println(str + " is an invalid social number");
						return;
					}
				}
			}
		}
		
		// The right format
		System.out.println(str + " is an valid social security number");

	}
}
