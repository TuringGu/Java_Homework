package chapter5;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:37:22
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 5.34
 */
public class GameOfScissorsStoneStep {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		
		String[] arrayCase = {"scissor", "rock", "paper"};     // Array[0 ~ 2] -> scissor, rock, paper
		int result = 0;                                        // For player: 1(win), 0(draw), 1(lose)
		int playerScore = 0, computerScore = 0;                // Score initialing
		
		// When one of them got 2 score , end the loop
		while (playerScore != 2 && computerScore != 2) {
			
			System.out.print("scissor (0), rock (1), paper (2): ");
		    int player = input.nextInt();
		
		    // Conform a valid input
			if(player != 0 && player != 1 && player != 2) {    
				System.out.println("Invalid input, please input again"); 
				continue;
			}
		
			int computer = (int)(Math.random() * 10)%3;      // The computer input
			int temp = player - computer;
			
			// Different case
			switch(temp) {
			case -2: result = 1;  break;
			case -1: result = -1; break;
			case 0 : result = 0;  break;
			case 1 : result = 1;  break;
			case 2 : result = -1; break; 
			default: {
				System.out.println("Wrong"); 
				return;
			}
			}
			
			// Output
			System.out.print("The computer is " + arrayCase[computer] + ". You are " + arrayCase[player] + ". ");
			
			if(result == -1) {
				System.out.print("You lose\n");
				computerScore++ ; // Score accumulating
			}
			else if(result == 0) {
				System.out.print("It is a draw\n");
			}
			else {
				System.out.print("You won\n");
				playerScore++ ;   // Score accumulating
			}
		
		}
		
		System.out.println("Game Over");
		
	}

}
