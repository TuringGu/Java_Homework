package chapter3;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:33:40
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 *
 * Exam 3.21
 */
public class ZeleConsistency {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		
		// h: a day in one week
		// q: a day in one month
		// m: month   // j: century    // k: a year in the century
		int h = 0, q = 0, m = 0, j = 0, k = 0;
		int year = 0, month = 0, day = 0;
		String temp = "";              //store the result
		
		// date input
		System.out.print("Enter year: (e.g., 2012): ");
		year = input.nextInt();
		System.out.print("Enter month: 1-12: ");
		month = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		day = input.nextInt();
		
		// Special input
		if (month == 1 || month == 2) {
			m = month + 12;
			year -= 1;
		}
		else {
			m = month;
		}
		
		q = day; j = year / 100; k = year % 100;
		
		// calculate
		h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		
		// case of "h"
		switch(h) {
		case 0: temp = "Saturday"; break;
		case 1: temp = "Sunday";   break; 
		case 2: temp = "Monday";   break;
		case 3: temp = "Tuesday";  break;
		case 4: temp = "Wednesday";break;
		case 5: temp = "Thursday"; break;
		case 6: temp = "Friday";   break;
		default: temp = "Invalid"; 
		}
		
		//result
		System.out.println("Day of the week is " + temp);
	}

}
