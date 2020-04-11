package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����4:21:42
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.23
 */
public class TestMyString2 {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub

		// Create objects of MyString2
		MyString2 s1 = new MyString2("My Name is Lintao Gu");
		MyString2 s2 = new MyString2("My Name is Lintao Go");
		
		// Test compare
		System.out.println("s1: " + s1.getS());
		System.out.println("s2: " + s2.getS());
		System.out.println("s1 - s2 = " + s1.compare(s2.getS()));
		System.out.println();
		
		// Test substring
		System.out.println("Before the substring  : " + s1.getS());
		System.out.println("After the substring(3): " + s1.substring(3).getS());
		System.out.println();
		
		// Test toUpperCase
		System.out.println("Before the toUpperCase: " + s1.getS());
		System.out.println("After the toUpperCase:  " + s1.toUpperCase().getS());
		System.out.println();
		
		// Test toChar
		System.out.println("Return it by char[]: ");
		char[] temp = s1.toChars();
		for(int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		System.out.println();
		
		// Test valueOf
		boolean b = false;
		System.out.println("Return the MyString2 expression of " + b);
		System.out.println(MyString2.valueOf(b).getS());
	}

}
