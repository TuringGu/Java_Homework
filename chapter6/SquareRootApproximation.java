package chapter6;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:41:38
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.22
 */
public class SquareRootApproximation {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		long n = input.nextLong();
		System.out.println("The approximated square root is: " + sqrt(n));
	}
	
	//
	public static double sqrt(long n) {
		double lastGuess = 0;
		double nextGuess = 1;
		while(Math.abs(lastGuess - nextGuess) >= 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n/lastGuess)/2;
		}
		return nextGuess;
	}

}
