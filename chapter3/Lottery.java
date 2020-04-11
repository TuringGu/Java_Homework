package chapter3;
import java.util.Scanner;

//(Something wrong)
/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:31:44
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 3.15
 */
public class Lottery {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Generate a lottery number
		int lottery = (int)(Math.random() * 1000);
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");

		int guess = input.nextInt();

		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = (lottery - lotteryDigit1 * 100) / 10;
		int lotteryDigit3 = (lottery - lotteryDigit1 * 100) % 10;
		
		
		
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = (guess - guessDigit1 * 100) / 10;
		int guessDigit3 = (guess - guessDigit2 * 100) % 10;
		
		System.out.println("The lottery number is " + lotteryDigit1 +
				lotteryDigit2 + lotteryDigit3);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else {
			// Define array to store data
			int[] guessArray = new int[5];
			int[] lotteryArray = new int [5];
			
			// Assigning
			guessArray[1] = guessDigit1;
			guessArray[2] = guessDigit2;
			guessArray[3] = guessDigit3;
			lotteryArray[1] = lotteryDigit1;
			lotteryArray[2] = lotteryDigit2;
			lotteryArray[3] = lotteryDigit3;
			
			int score = 0;    //The match number of the digits;
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					if (guessArray[i] == lotteryArray[j]) {
						score++;                                   // Match
						lotteryArray[j] -= 100;   // Remove
						break;
					}
				}
			}
			
			// Result
			if (score == 3)
				System.out.println("Match all digits: you win $3,000");
			else if (score == 0)
				System.out.println("Sorry, no match");
			else 
				System.out.println("Match ont digits: you win $1,000");
		}
	}

}
