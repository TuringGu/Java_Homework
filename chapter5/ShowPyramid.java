package chapter5;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:37:41
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 5.17
 */
public class ShowPyramid {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines (0 ~ 15): ");
		
		int line = input.nextInt();

		// The wrong situation
		if(!(line >= 1 && line <= 15)) {
			System.out.println("Invalid input");
			return;
		}

		// Initial the array with 0;
		int [][] array = new int[line + 1][2 * line];
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= 2 * line - 1; j++) {
				array[i][j] = 0;
			}
		}
		
		// The pyramid
		int m = 1;      // m Control the i
		int x = 1;      // x Control the assigning of array
		for(int j1 = line, j2 = line; j1 >= 1; j1--, j2++) {
			for(int i = line; i >= m; i--) {
				array[i][j1] = array[i][j2] = x;
			}
			m++;	x++;
		}
		
		// Output
		System.out.println("The Pyramid: ");
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= 2 * line - 1; j++) {
				if(array[i][j] == 0) {             // The digit "0" to " "
					System.out.print("  ");
				}
				else {
					System.out.print(array[i][j] + " ");					
				}
			}
			System.out.print("\n");
		}

	}
}
