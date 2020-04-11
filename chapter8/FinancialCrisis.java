package chapter8;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:46:24
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.17
 */
public class FinancialCrisis {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		// Data preparation
		double limit = 201;
		
		double[][] borrowers = initialBorrowers();	// Create the loan array, , borrowers[i][j] is i loan to j
		double[] bankRestAssets = initialBankAssets();	// Create the bank rest assets array
		int[] unsafeBank = create1DArray(borrowers.length);		// Create the unsafe bank array
		
		System.out.print("Amount of the bank         : " + borrowers.length + "\n");	
		System.out.print("Limit of the safe standard : " + limit + "\n");	
		System.out.println();
		
		System.out.print("The borrowers array: \n");// Output the borrowers
		printlnBorrowers(borrowers);
		System.out.println();

		// Find unsafe bank
		for(int i = 0; i < borrowers.length; i++) { 	
			if(bankAssets(borrowers, bankRestAssets, i) < limit) {
				unsafeBank[i] = 1;
				findUnsafeBank(borrowers, bankRestAssets, limit, unsafeBank, i);
			}
		}
		
		// Output
		System.out.print("Unsafe banks: ");
		printlnUnsafeBanks(unsafeBank);
	}
	
	
	// When bank x is unsafe, find unsafe bank from it
	public static void findUnsafeBank(double[][] borrowers, double[] bankRestAssets, double limit, int[] unsafeBank, int x) {
		for(int i = 0; i < borrowers.length; i++) {
			if(borrowers[i][x] != 0) {	// Have loan to bank x
				borrowers[i][x] = 0;	// All the loan of x should be 0
				if(bankAssets(borrowers, bankRestAssets, i) < limit) {	// When bank i is unsafe bank
					unsafeBank[i] = 1;
					findUnsafeBank(borrowers, bankRestAssets, limit, unsafeBank, i);	// Find unsafe bank from bank i
				}
			}
		}
	}
	
	
	// Calculate x bank's real assets
	public static double bankAssets(double[][] borrowers, double[] bankRestAssets, int x) {
		double bankRealAssets = bankRestAssets[x];
		for(int j = 0; j < borrowers[x].length; j++) {
			bankRealAssets += borrowers[x][j];
		}
		return bankRealAssets;
	}
	
	
	// Initial the loan array
	public static double[][] initialBorrowers() {
		double[][] borrowers = {
				{0, 100.5, 0, 0, 320.5},
				{0, 0, 40, 85, 0},
				{125, 0, 0, 75, 0},
				{125, 0, 0, 0, 0},
				{0, 0, 125, 0, 0}
				
				// Another example
//				{0, 10, 40, 0, 0, 10, 0},
//				{0, 0, 0, 150, 30, 0, 0},
//				{0, 40, 0, 0, 0, 60, 0},
//				{20, 0, 0, 0, 0, 100, 0},
//				{0, 30, 150, 0, 0, 20, 0},
//				{0, 100, 0, 0, 30, 0, 0},
//				{0, 0, 0, 20, 0, 0, 0}
		};
		return borrowers;
	}
	
	
	// Initial the bank assets 
	public static double[] initialBankAssets() {
		double[] bankAssets = 
			{25, 125, 175, 75, 181};
		
			// Another example
//			{150, 25, 300, 75, 100, 175, 200};
		
		return bankAssets;
	}
	
	
	// Create a n array, initial it with element 0
	public static int[] create1DArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		return array;
	}
	
	
	// Output unsafe banks
	public static void printlnUnsafeBanks(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	// Output borrowers
	public static void printlnBorrowers(double[][] borrowers) {
		for(int i = 0; i < borrowers.length; i++) {
			for(int j = 0; j < borrowers[i].length; j++) {
				System.out.printf("%5.1f   ", borrowers[i][j]);
			}
			System.out.println();
		}
	}
}

