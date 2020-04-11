package chapter7;

import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:43:38
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.22
 */
public class EightQueens {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		@SuppressWarnings("resource")
		
		// input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		// Create chessboard
		char[][] chessboard = createChessboard(n);
		
		// Output
		System.out.println("Output all the solutions: ");
		setQueens(chessboard, 1);
	}
	
	
	// Create n * n chessboard
	public static char[][] createChessboard(int n) {
		char[][] chessboard = new char[n + 1][n + 1];    // n:1 ~ n avilable
		
		// Initial chessboard
		for(int i = 1; i < chessboard.length; i++) { // Length is n + 1
			for(int j = 1; j < chessboard.length; j++) { 
				chessboard[i][j] = ' ';
			}
		}
		return chessboard;
	}
	
	
	// Print n * n result of queens in chessboard
	public static void printChessboard(char[][] chessboard) {
		for(int i = 1; i < chessboard.length; i++) { // Length is n + 1
			for(int j = 1; j < chessboard.length; j++) { 
				System.out.print("|" + chessboard[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("------------------------------------------------------");
	}
	
	
	// Set a queen into the chessboard, the location is (i, j)
	public static char[][] setAQueen(char[][] chessboard, int i, int j) {
		if(i >= chessboard.length || j >= chessboard.length || i <= 0 || j <= 0) {  // Out of board
			System.out.println("The location" + "(" + i + ", " + j + ")"+ " is invalid!");
		}
		else {
			chessboard[i][j] = 'Q';
		}
		return chessboard;
	}
	
	
	/** Judge weather (i, j) is in the other queen's range of attack 
	 * if so, return true*/
	public static boolean isInRangeOfAttack(char[][] chessboard, int i, int j) {
		int iChessboard = 0, jChessboard = 0;  // The location of chessboard
		
		// Scanning the chessboard
		for(iChessboard = 1; iChessboard < chessboard.length; iChessboard++) {
			for(jChessboard = 1; jChessboard < chessboard.length; jChessboard++) {
				
				 /** Find the location of other queens*/
				if(chessboard[iChessboard][jChessboard] == 'Q') {  
					
					/** In the same row or column or diagonal*/
					if((Math.abs(i - iChessboard) == Math.abs(j - jChessboard)) || 
							(i == iChessboard) || (j == jChessboard)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	
	// Reset the row i
	public static void resetRow(char[][] chessboard, int i) {
			
		// Throw out
		if(i <= 0 || i >= chessboard.length) {
			System.out.println("The reset row is invalid!");
			return;
		}
		
		// Reset
		for(int jChessboard = 1; jChessboard < chessboard.length; jChessboard++) {
			chessboard[i][jChessboard] = ' ';
		}
	}
		
	
	// Set queens into the chessboard from present level to last level by rule
	public static void setQueens(char[][] chessboard, int level) {
		
		// setting complete(length == n + 1)
		if(level == chessboard.length) {
			printChessboard(chessboard);
			resetRow(chessboard, level - 1);                    // Reset present row
			return;
		}
		
		for(int j = 1; j < chessboard.length; j++) {
			
			// When out of range of attack
			if(!isInRangeOfAttack(chessboard, level, j)) {  
				setAQueen(chessboard, level, j);
				setQueens(chessboard, level + 1);           // Do the next level to the last level
			}
			
			// Reset level - 1 before trace back
			if(j == chessboard.length - 1 && level >= 2){
				resetRow(chessboard, level - 1);           
			}

		}
		return;
	}

	
}
