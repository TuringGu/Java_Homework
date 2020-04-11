package chapter6;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:38:29
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.30
 */
public class Craps {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		System.out.println("Game Start!");
		int n = 0;                // The sum every time you roll the dice
		int result = 0;           // -1: lose     1: win
		int point = 0;            // a special point in game
		n = onceThrowDice();
		
		switch(n) {
		// Lose
		case 2 : result = -1; break;
		case 3 : result = -1; break;
		case 12: result = -1; break;
		
		// Win
		case 7 : result = 1 ; break;
		case 11: result = 1 ; break;
		default: point = n;       // The point
		}
		
		// First result judging
		if(result == 1) {
			System.out.println("You win");
			return;
		}
		else if(result == -1){
			System.out.println("You lose");
			return;
		}
		else {
			System.out.println("point is: " + point);
		}
		
		// Game continue
		do {
			n = onceThrowDice();
			if(n == point) {
				System.out.println("You win");
				return;
			}
			if(n == 7) {
				System.out.println("You lose");
				return;
			}
		} while(true);
	}
	
	// Throw the two dice once, print the number and return its sum 
	public static int onceThrowDice() {
		int n1 = 1 + (int)(Math.random() * 6);  // The dice: 1 ~ 6
		int n2 = 1 + (int)(Math.random() * 6);
		System.out.println("You rolled " + n1 + " + " + n2 + " = " + (n1 + n2));
		return n1 + n2;
	}

}
