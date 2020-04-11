package chapter2;
import java.util.Scanner;


/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:28:39
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 2.7
 */
public class MinuteToYearAndDay {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("Enter the number of minutes: ");
		long minute = 0, year = 0, day = 0;
		Scanner input = new Scanner(System.in);
		minute = input.nextLong();
		
		//Assuming a year have 365 days
		year = minute / ( 365 * 24 * 60 ); 
		day = minute / ( 60 * 24 )- 365 * year;
		
		System.out.println(minute + " minute is approximately " + 
				year + " year and " + day + " days ");
	}
}
