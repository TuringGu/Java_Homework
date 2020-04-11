package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:44:32
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.19
 */
public class IsAscendingSorted {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Input
		System.out.print("Enter list(The list[0] is the elements number of the list): ");
		int size = input.nextInt(); // Get value of size from input 
		int[] list = new int[size + 1]; // Create the array with size as list[0]
		list[0] = size;
		for(int i = 1; i <= list[0]; i++) {
			list[i] = input.nextInt();
		}
		
		// Output
		if(isSorted(list)) {
			System.out.println("The list is already sorted");
		}
		else {
			System.out.println("The list is not sorted");
		}
	}
	
	/** Return true if the array is sorted by ascending order 
	 * The list[0] is the elements number of the list*/
	public static boolean isSorted(int[] list) {
		for(int i = 1; i < list[0]; i++) {
			if(list[i] > list[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
