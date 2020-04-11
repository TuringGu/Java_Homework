package chapter3;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:30:08
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 3.9
 */
public class CheckISBN10 {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0;
		int d10 = 0;      //checksum
		String inputNumber = "NULL";
		
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		Scanner input = new Scanner(System.in);
		inputNumber = input.nextLine();
		
		//ASCLL TABLE (char to digit)
		d1 = inputNumber.charAt(0) - 48;
		d2 = inputNumber.charAt(1) - 48;
		d3 = inputNumber.charAt(2) - 48;
		d4 = inputNumber.charAt(3) - 48;
		d5 = inputNumber.charAt(4) - 48;
		d6 = inputNumber.charAt(5) - 48;
		d7 = inputNumber.charAt(6) - 48;
		d8 = inputNumber.charAt(7) - 48;
		d9 = inputNumber.charAt(8) - 48;
		
		d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + 
				d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		//Output
		if(d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 +
					d5 + d6 + d7 + d8 + d9 + "X");
		else
			System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 +
					d5 + d6 + d7 + d8 + d9 + d10);
	}

}
