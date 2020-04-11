package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:46:41
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.20
 */
public class FourSubCompany {

	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		// Game Begin
		playTheGame(createChessboard(6, 7));
	}
	
	
	// The Game in the chessboard
	public static void playTheGame(char[][] chessboard) {
		
		char[] chessman = {' '};	// For the Parameter transmission
		int step = 0;	// Store the steps made & Decide who make a move
		char result = judgingWinner(chessboard, 'R', 'Y', chessman); 	// Store the result
		
		while (result == 'N') {
			printlnChessboard(chessboard);	// Println the chessboard
			if(step%2 == 0) {	// Who to make a move
				makeAMove(chessboard, 'R');	step++;
				result = judgingWinner(chessboard, 'R', 'Y', chessman);
			}
			else {
				makeAMove(chessboard, 'Y'); step++;
				result = judgingWinner(chessboard, 'R', 'Y', chessman);
			}
		}
		printlnChessboard(chessboard);	// Println the chessboard
		
		// Game Over
		switch(result) {
		case 'R': {		// X won
			System.out.println("The red player won");
			break;
		}
		case 'Y': {		// O won
			System.out.println("The yellow player won");
			break;
		}
		case 'D': {		// A draw
			System.out.println("End with a draw");
			break;
		}
		default: {		// Error
			System.out.println("Error : playTheGame");
			return;
		}
		}
	}

	
	// X make a move
	public static void makeAMove(char[][] chessboard, char X) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		// Input the column of the drop
		if(X == 'R') {	// Red chessman
			System.out.print("Drop a red disk at column (0-6): ");
		}
		else if(X == 'Y') {	// Yellow chessman
			System.out.print("Drop a yellow disk at column (0-6): ");
		}
		else {	// Wrong chessman
			System.out.println("Error: The chess " + X);
			return;
		}
		
		int yPlayer = input.nextInt();
		if(yPlayer < 0 || yPlayer >= chessboard[0].length) {
			System.out.println("Out of bound, please choose a right location");
			makeAMove(chessboard, X);
			return;
		}
		
		int xPlayer = -1;	// The default is wrong 
		
		// Find the location of the chessman's row
		for(int i = chessboard.length - 1; i >= 0; i--) {
			if(chessboard[i][yPlayer] == '0') {
				xPlayer = i;
				break;
			}
		}
		
		if(xPlayer == -1) {	// Wrong move (Out of bound)
			System.out.println("Out of bound, please choose a right location");
			makeAMove(chessboard, X);
			return;
		}
		
		if((move(chessboard, xPlayer, yPlayer, X) != 1)) {	// Wrong move (not a vacancy)
			makeAMove(chessboard, X);
			return;
		}
		return;
	}
		
		
	// move
	public static int move(char[][] chessboard, int x, int y, char chessman) {
		if(chessboard[x][y] != '0') {	// Wrong move
			System.out.println("There already have chess, please choose a vacancy");
			return -1;
		}
		else {
			chessboard[x][y] = chessman;
			return 1;
		}
	}
	
	
	// Judging weather The chessboard is full
	public static boolean isFull(char[][] chessboard) {
		boolean flag = true;
		for(int i = 0; i < chessboard.length; i++) {
			for(int j = 0; j <chessboard[i].length; j++) {
				if(chessboard[i][j] == '0') {	// Have vacancy
					flag = false;
					return flag;
				}
			}
		}
		return flag;
	}
	
	
	// Judging weather a draw
	public static boolean isDraw(char[][] chessboard) {
			boolean flag = false;
			char[] chessman = {' '};	// For the parameter transmission
			if(isFull(chessboard) && !isConsecutiveN(chessboard, 4, chessman)) {
				flag = true;
			}
			return flag;
		}
	
	
	// Judging the winner and return the chessman, when it's draw, return 'D'
	public static char judgingWinner(char[][] chessboard, char chessmanX, char chessmanO, char[] chessman) {
		
		isConsecutiveN(chessboard, 4, chessman);	// Get the winner chessman
		
		if(isDraw(chessboard)) {				// The draw
			return 'D';
		}
		else if(chessmanX == chessman[0]){		// chessmanX won
			return chessmanX;
		}
		else if(chessmanO == chessman[0]){		// chessmanY won
			return chessmanO;
		}
		else {									// Not divided
			return 'N';
		}
	}
	
	//******************************************************************************************
	// Judge weather a 2D array have n consecutive elements
	public static boolean isConsecutiveN(char[][] values, int n, char[] chessman) {
		boolean flag = false;
		if(isRowConsecutiveN(values, n, chessman) || 
				isColumnConsecutiveN(values, n, chessman) ||
				isDiagonalConsecutiveN(values, n, chessman)) {
			flag = true;
		}
		return flag;
	}
	
		// Judge weather have n consecutive in row
		public static boolean isRowConsecutiveN(char[][] values, int n, char[] chessman) {
			for(int i = 0; i < values.length; i++) {
				for(int j = 0; j < values[i].length - n + 1; j++) {
					for(int k = 1; k <= n - 1; k++) {
						if(values[i][j] != values[i][j + k] || values[i][j] == '0') {	// Ignore '0'
							break;
						}
						else if(k == n - 1) {	// Already has consecutive n
							chessman[0] = values[i][j];	// For the parameter transmission
							return true;
						}
					}
				}
			}
			return false;				// Not find consecutive n
		}
		
		// Judge weather have n consecutive in column
		public static boolean isColumnConsecutiveN(char[][] values, int n, char[] chessman) {
			for(int j = 0; j < values[0].length; j++) {
				for(int i = 0; i < values.length - n + 1; i++) {
					for(int k = 1; k <= n - 1; k++) {
						if(values[i][j] != values[i + k][j] || values[i][j] == '0') {	// Ignore '0'
							break;
						}
						else if(k == n - 1) {	// Already has consecutive n
							chessman[0] = values[i][j];	// For the parameter transmission
							return true;
						}
					}
				}
			}
			return false;				// Not find consecutive n
		}
		
		// Judge weather have n consecutive in diagonal
		public static boolean isDiagonalConsecutiveN(char[][] values, int n, char[] chessman) {
		
		// 1 condition
		for(int row = 0; row < values.length; row++) {
			for(int i = row, j = 0; (i >= n - 1) && (j < values[i].length - n + 1); i--, j++) {
				for(int k = 1; k <= n - 1; k++) {
					if(values[i][j] != values[i - k][j + k] || values[i][j] == '0') {	// Ignore '0'
						break;
					}
					else if(k == n - 1) {
						chessman[0] = values[i][j];	// For the parameter transmission
						return true;
					}
				}
			}
		}

		// 2 condition
		for(int column = 0; column < values[0].length; column++) {
			for(int j = column, i = values.length - 1; (i >= n - 1) && (j < values[i].length - n + 1); i--, j++) {
				for(int k = 1; k <= n - 1; k++) {
					if(values[i][j] != values[i - k][j + k] || values[i][j] == '0') {	// Ignore '0'
						break;
					}
					else if(k == n - 1) {
						chessman[0] = values[i][j];	// For the parameter transmission
						return true;
					}
				}
			}
		}
		
		// 3 condition
		for(int column = 0; column < values[0].length; column++) {
			for(int j = column, i = 0; (i < values.length - n + 1) && (j < values[i].length - n + 1); i++, j++) {
				for(int k = 1; k <= n - 1; k++) {
					if(values[i][j] != values[i + k][j + k] || values[i][j] == '0') {	// Ignore '0'
						break;
					}
					else if(k == n - 1) {
						chessman[0] = values[i][j];	// For the parameter transmission
						return true;
					}
				}
			}
		}
		
		
		// 4 condition
		for(int row = 0; row < values.length; row++) {
			for(int i = row, j = 0; (i < values.length - n + 1) && (j < values[i].length - n + 1); i++, j++) {
				for(int k = 1; k <= n - 1; k++) {
					if(values[i][j] != values[i + k][j + k] || values[i][j] == '0') {	// Ignore '0'
						break;
					}
					else if(k == n - 1) {
						chessman[0] = values[i][j];	// For the parameter transmission
						return true;
					}
				}
			}
		}
		
		return false;
	}
	//******************************************************************************************
	
	
	// Create the n * m chessboard
	public static char[][] createChessboard(int n, int m) {
		
		char[][] chessboard = new char[n][m];	// Initial
		for(int i = 0; i < chessboard.length; i++) {
			for(int j = 0; j < chessboard[i].length; j++) {
				chessboard[i][j] = '0';
			}
		}
		return chessboard;
	}
	
	
	// Println the chessboard
	public static void printlnChessboard(char[][] chessboard) {

		for(int i = 0; i < chessboard.length; i++) {
			System.out.print("|");
			for(int j = 0; j < chessboard[i].length; j++) {
				if(chessboard[i][j] == '0') {
					System.out.print(" |");
				}
				else {
					System.out.print(chessboard[i][j] + "|");
				}
			}
			System.out.println();
		}
		System.out.println("---------------");
	}

	
}
