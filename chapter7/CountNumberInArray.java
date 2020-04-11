package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:43:01
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.3
 */
public class CountNumberInArray {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int[] numberArray = new int[100 + 1]; // Declare an array to memorize the times
		
		System.out.print("Enter the integers between 1 and 100(end with '0'): ");
		
		int temp = in.nextInt(); // Get value from input 
		
		// Calculate the time
		while(temp != 0) {
			numberArray[temp] ++;
			temp = in.nextInt();
		}
		
		// Output
		for(int i = 1; i <= 100; i++) {
			if(numberArray[i] == 1) {
				System.out.println(i + " occurs " + numberArray[i] + " time");
			}
			else if(numberArray[i] > 1) {
				System.out.println(i + " occurs " + numberArray[i] + " times");
			}
		}
	}

}
