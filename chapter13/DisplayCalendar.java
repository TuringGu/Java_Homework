/**
 * @Project_name: JavaMyHomework
 * @File_name: DisplayCalendar.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月13日	
 * @Time: 下午4:39:51
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Turing-G
 * Exam 13.4
 */
public class DisplayCalendar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Input the month and the year
		System.out.print("Enter the month: ");
		int month = input.nextInt();
		System.out.print("Enter the year:  ");
		int year = input.nextInt();
		
		// Initial the Object of calendar
		Calendar calendar = new GregorianCalendar(year, month - 1, 1);
		
		// Print the calendar
		String[] MonthNameOfYear = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December"};
		
		
		System.out.println("        " + MonthNameOfYear[calendar.get(Calendar.MONTH)]+ ", " + calendar.get(Calendar.YEAR));
		System.out.println("----------------------------");
		System.out.println("Sun Mon Tue Wed Thu Fri Sat ");
		
		for(int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("    ");
		}
		
		int maxDayOfTheMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);	// The limit of the month
		
		for(int dayOfMonth = 1; dayOfMonth <= maxDayOfTheMonth; dayOfMonth++) {		// Print the day
			if(calendar.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println();
			}
			System.out.printf("%3d ", calendar.get(Calendar.DAY_OF_MONTH));
			calendar.add(Calendar.DAY_OF_MONTH, 1);									// Update the calendar
		}

	}

}
