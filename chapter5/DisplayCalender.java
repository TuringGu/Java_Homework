package chapter5;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:37:03
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 5.29
 */
public class DisplayCalender {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a particular year: ");
		int particularYear = input.nextInt();
		System.out.print("Enter the day of the week of this year's fisrt day (1~7: Monday~Sunday): ");
		int theDayOfTheWeek = input.nextInt();
		
		String[] arrayMonth = {" ", "January", "February", "March", "April","May", "June", "July",
				"August", "September", "October", "November", "December"};
		
		int[] dayMonthLimit = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		// About leap year
		if(DisplayCalender.isLeapYear(particularYear)) {
			dayMonthLimit[2] = 29;
		} else{
			// Added by TuringGu 20200411
			dayMonthLimit[2] = 28;
		}
		
		// Output
		for(int i = 1; i <= 12; i++) {
			System.out.println("          " + arrayMonth[i] + " " + particularYear + "           ");
			System.out.println("*********************************");
			System.out.println("Sun  Mon  Tue  Wed  Thu  Fri  Sat");
			
			for(int b = 1; b <= theDayOfTheWeek; b++) {
				System.out.print("     ");
			}
			System.out.printf("%3d  ", 1);     // Print the first day of the month
			
			// Print the day 2 to the end in the month
			for(int day = 2; day <= dayMonthLimit[i]; day++) {
				
				theDayOfTheWeek = (theDayOfTheWeek + 1)%7;
				if(theDayOfTheWeek == 0) {     // When in Saturday�� get a new line
					System.out.print("\n");
				}
				
				System.out.printf("%3d  ", day);	
			}
			
			theDayOfTheWeek = (theDayOfTheWeek + 1)%7;
			System.out.println("\n");
		}
		
	}
	
	//** Determine if it is a leap year */
	public static Boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
	

}
