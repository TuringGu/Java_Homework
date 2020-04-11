package chapter7;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:45:10
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 7.1
 */
public class SpecifyLevel {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		
		int numberOfStudent = in.nextInt(); // The students number 
		int[] scoreArray = new int[numberOfStudent]; // Create a array to memorize the score
		char[] levelArray = new char[numberOfStudent]; // Create a array to memorize the level
		int maxScore = 0;// The max score
		
		// Data Input
		System.out.print("Enter " + numberOfStudent + " scores: ");
		for(int i = 0; i <= numberOfStudent - 1; i++) {
			scoreArray[i] = in.nextInt();
			if(scoreArray[i] > maxScore) {            // Find the max score
				maxScore = scoreArray[i];
			}
		}
		
		// Level specify
		for(int i = 0; i <= numberOfStudent - 1; i++) {
			if(scoreArray[i] >= maxScore - 10) {
				levelArray[i] = 'A';
			}
			else if(scoreArray[i] >= maxScore - 20) {
				levelArray[i] = 'B';
			}
			else if(scoreArray[i] >= maxScore - 30) {
				levelArray[i] = 'C';
			}
			else if(scoreArray[i] >= maxScore - 40) {
				levelArray[i] = 'D';
			}
			else {
				levelArray[i] = 'F';
			}
		}
		
		// Output
		for(int i = 0; i <= numberOfStudent - 1; i++) {
			System.out.println("Student " + i + " score is " + scoreArray[i] + " and grade is " + levelArray[i]);
		}
	}

}
