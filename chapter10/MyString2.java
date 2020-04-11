package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����4:21:28
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.23
 */
public class MyString2 {
	/** Data area */
	private String s;
	
	/** Construct MyString2 takes no parameters */
	public MyString2(String s) {
		this.s = s;
	}
	
	/** Return the String s */
	public String getS() {
		return s;
	}
	
	/** Construct method of compare the String with another String s */
	public int compare(String s) {
		// Compare the length
		if(this.s.length() < s.length()) {
			return -1;
		}
		else if(this.s.length() > s.length()) {
			return 1;
		}
		else {	// Compare every character
			for(int i = 0; i < s.length(); i++) {
				if(this.s.charAt(i) != s.charAt(i)) {
					return this.s.charAt(i) - s.charAt(i);
				}
			}
			return 0;
		}
	}
	
	/** Construct method of get the substring of s */
	public MyString2 substring(int begin) {
		// Out of bound
		if(begin < 0 || begin >= this.getS().length()) {
			System.out.println("Error: substring(" + begin + ")");
			System.exit(1);
		}
		
		// Initial the StringBuilder
		StringBuilder sBuilder = new StringBuilder();
		
		// Assigning
		for(int i = begin; i < this.getS().length(); i++) {
			sBuilder.append(this.getS().charAt(i));
		}
		
		// Return 
		return new MyString2(sBuilder.toString());
	}
	
	/** Construct method of return the upper case */
	public MyString2 toUpperCase() {
		
		// Initial the StringBuilder
		StringBuilder sBuilder = new StringBuilder();
		
		// Assigning
		for(int i = 0; i < this.getS().length(); i++) {
			if(this.getS().charAt(i) >= 'a' && this.getS().charAt(i) <= 'z') {
				char temp = (char)(this.getS().charAt(i) + 'A' - 'a');

				sBuilder.append(temp);
			}
			else {
				sBuilder.append(this.getS().charAt(i));				
			}
		}
		
		// Return
		return new MyString2(sBuilder.toString());
	}
	
	/** Construct method of change it to char[] */
	public char[] toChars() {
		// Initial the char[] temp
		char[] temp = new char[this.getS().length()];
		
		// Assigning
		for(int i = 0; i < this.getS().length(); i++) {
			temp[i] = this.getS().charAt(i);
		}
		
		// Return
		return temp;
	}
	
	/** Construct method of return the MyString2 expression */
	public static MyString2 valueOf(boolean b) {
		if(b == true) {
			return new MyString2("true");
		}
		else {
			return new MyString2("false");
		}
	}

}
