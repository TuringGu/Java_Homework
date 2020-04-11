package chapter8;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:45:33
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.4
 */
public class CalculateEmployeesWorkingHours {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		int [][] m = exampleOfTheTable();
		printlnByDescendingOrder(m);
	}
	
	
	// The example of the employees' working hours
	public static int[][] exampleOfTheTable() {
		int[][] m = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}
		};
		return m;
	}
	
	
	// Println the employees and their working hours by descending order
	public static void printlnByDescendingOrder(int[][] m) {
		int[] sumArray = new int[m.length];	// Store the sum into the sumArray[]
		int[] printlnFlag = new int[m.length];	// Print order
		
		// Initial
		for(int employee = 0; employee < m.length; employee++) {
			for(int day = 0; day < m[employee].length; day++) {
				sumArray[employee] += m[employee][day];
			}
		}
		for(int i = 0; i < printlnFlag.length; i++) {
			printlnFlag[i] = i;
		}
		
		// Sorting the printlnOrder[] by descending order
		int max = 0;	int temp = 0;
		for(int employeei = 0; employeei < sumArray.length - 1; employeei++) {
			max = sumArray[employeei]; 
			for(int employeej = employeei + 1; employeej < sumArray.length; employeej++) {
				if(sumArray[employeej] > max) {			
					
					// Swap
					temp = sumArray[employeej];
					sumArray[employeei] = sumArray[employeej];
					temp = sumArray[employeei];
					
					temp = printlnFlag[employeei];
					printlnFlag[employeei] = printlnFlag[employeej];
					printlnFlag[employeej] = temp;
				}
			}
		}

		// Output the table by descending order
		System.out.println("              Su M  T  W  Th F  Sa ");
		for(int i = 0; i < m.length; i++) {
			System.out.print("Emplyee " + printlnFlag[i] + "    ");
			for (int day = 0; day < m[printlnFlag[i]].length; day++) {
				System.out.printf("%2d ",m[printlnFlag[i]][day]);
				
			}
			System.out.println();
		}
	}
	
	// Swap two values(Type: integer) (Wrong)
//	public static void swap(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//	}

	
}
