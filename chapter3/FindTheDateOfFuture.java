package chapter3;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:30:39
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 3.5
 */
public class FindTheDateOfFuture {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		int today = 0, futureDay = 0, x = 0, temp = 0;
		String todayDate = "", futureDayDate = "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		x = input.nextInt();
		
		temp = (today + x) / 7;
		futureDay = today + x - 7 * temp;
		
		switch(today){
		  case 0: todayDate = "Sunday";   break;
		  case 1: todayDate = "Monday";   break;
		  case 2: todayDate = "Tuesday";  break;
		  case 3: todayDate = "Wednesday";break;
		  case 4: todayDate = "Thursday"; break;
		  case 5: todayDate = "Friday";   break;
		  case 6: todayDate = "Saturday"; break;
		  default:todayDate = "Invalid";
		}
		
		switch(futureDay){
		  case 0: futureDayDate = "Sunday";   break;
		  case 1: futureDayDate = "Monday";   break;
		  case 2: futureDayDate = "Tuesday";  break;
		  case 3: futureDayDate = "Wednesday";break;
		  case 4: futureDayDate = "Thursday"; break;
		  case 5: futureDayDate = "Friday";   break;
		  case 6: futureDayDate = "Saturday"; break;
		  default:futureDayDate = "Invalid";
		}
		
		System.out.println("Today is " + todayDate + " and the future day is "
				+ futureDayDate);
	}

}
