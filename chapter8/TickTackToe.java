package chapter8;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:48:17
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 8.9
 */
public class TickTackToe {
	
	/** The Main */
	public static void main(String[] args) {
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		playTheGame(createChessboard(3));	// The chessboard is 3 * 3
	}
	
	
	// The Game in the chessboard
	public static void playTheGame(char[][] chessboard) {
		int step = 0;	// Store the steps made & Decide who make a move
		char result = judgingWinner(chessboard, 'X', 'O'); 	// Store the result
		
		while (result == 'N') {
			printlnChessboard(chessboard);	// Println the chessboard
			if(step%2 == 0) {	// Who to make a move
				makeAMove(chessboard, 'X');	step++;
				result = judgingWinner(chessboard, 'X', 'O');
			}
			else {
				makeAMove(chessboard, 'O'); step++;
				result = judgingWinner(chessboard, 'X', 'O');
			}
		}
		printlnChessboard(chessboard);	// Println the chessboard
		
		// Game Over
		switch(result) {
		case 'X': {		// X won
			System.out.println('X' + " player won");
			break;
		}
		case 'O': {		// O won
			System.out.println('O' + " player won");
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
	
	
	
	// Create the n*n chessboard
	public static char[][] createChessboard(int n) {
		
		char[][] chessboard = new char[n][n];	// Initial
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
			System.out.println("-------");
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
		System.out.println("-------");
	}
	
	
	// X make a move
	public static void makeAMove(char[][] chessboard, char X) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a row (0, 1, or 2) for player " + X + ": ");
		int xPlayer = input.nextInt();
		System.out.print("Enter a column (0, 1, or 2) for player " + X + ": ");
		int yPlayer = input.nextInt();
		if(xPlayer < 0 || xPlayer > 2 || yPlayer < 0 || yPlayer > 2) {	// Wrong move (Out of bound)
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
	
	
	// Judging the winner and return the chessman, when it's draw, return 'D'
	public static char judgingWinner(char[][] chessboard, char chessmanX, char chessmanO) {
		if(isDraw(chessboard, chessmanX, chessmanO)) {	// The draw
			return 'D';
		}
		else if(isWinner(chessboard, chessmanX)){		// chessmanX won
			return chessmanX;
		}
		else if(isWinner(chessboard, chessmanO)){		// chessmanY won
			return chessmanO;
		}
		else {											// Not divided
			return 'N';
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
	public static boolean isDraw(char[][] chessboard, char chessmanX, char chessmanO) {
		boolean flag = false;
		if(isFull(chessboard) && (!isWinner(chessboard, chessmanX) && (!isWinner(chessboard, chessmanO)))) {
			flag = true;
		}
		return flag;
	}
	
	
	// Judging weather chessman is winner
	public static boolean isWinner(char[][] chessboard, char chessman) {
		boolean flag = false;
		if(		// The condition of the chessman won
				(chessboard[0][0] == chessman && chessboard[0][1] == chessman && chessboard[0][2] == chessman) ||
				(chessboard[1][0] == chessman && chessboard[1][1] == chessman && chessboard[1][2] == chessman) ||
				(chessboard[2][0] == chessman && chessboard[2][1] == chessman && chessboard[2][2] == chessman) ||
				(chessboard[0][0] == chessman && chessboard[1][0] == chessman && chessboard[2][0] == chessman) ||
				(chessboard[0][1] == chessman && chessboard[1][1] == chessman && chessboard[2][1] == chessman) ||
				(chessboard[2][0] == chessman && chessboard[2][1] == chessman && chessboard[2][2] == chessman) ||
				(chessboard[0][0] == chessman && chessboard[1][1] == chessman && chessboard[2][2] == chessman) ||
				(chessboard[0][2] == chessman && chessboard[1][1] == chessman && chessboard[2][0] == chessman)
				) {
			flag = true;
		}
		return flag;
	}
	
	
	/*// Judging weather the location (i, j) is in the condition of winning the game
	public static boolean isInInThreeSubCompany(char[][] chessboard, int i, int j) {
		
	}*/

}
