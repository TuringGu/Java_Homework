package chapter6;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:38:48
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.12
 */
public class DisplayCharacter {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("The character '1' to 'Z'");
		
		// Output
		printChars('1','Z', 10);	
	}
	
	
	// print chars
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for(int i = ch1; i <= ch2; i++) {
			if((i - ch1 + 1) % numberPerLine == 0) {
				System.out.println((char)i);
			}
			else {
				System.out.print((char)i);
			}
		}
	}

}
