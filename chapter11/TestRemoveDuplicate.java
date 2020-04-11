/**
 * @Project_name: JavaMyHomework
 * @File_name: TestRemoveDuplicate.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午6:24:24
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter11;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Turing-G
 * Exam 11.13
 */
public class TestRemoveDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initial 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrayList1 = new ArrayList<>();

		// Data preparation & Assigning
		System.out.print("Enter ten integers: ");
		for(int i = 0; i < 10; i++) {
			arrayList1.add(new Integer(input.nextInt()));
		}
		
		// Remove the duplicate elements
		removeDuplicate(arrayList1);
		
		// Display
		System.out.println("Before the remove function: ");
		for(int i = 0; i < arrayList1.size(); i++) {
			System.out.print(arrayList1.get(i) + " ");
		}
	}


	/** Remove the duplicate elements */
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			for(int k = i + 1; k < list.size(); k++) {
				if(list.get(i).equals(list.get(k))) {
					list.remove(k);
					k--;
				}
			}
		}
	}

}
