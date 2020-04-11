package chapter6;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:38:04
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 6.7
 */
public class CalculateTheFutureInvestmentValue {
	//** The Main */
	public static void main(String[] args) {
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		 
		// Input
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate(%): ");
		double annualInterestRate = input.nextDouble()/100;
		
		// Output
		System.out.println("Years  *  Future Value");
		for(int i = 1; i <= 30; i++) {
			System.out.printf("%2d        ", i);	
			System.out.printf("%.2f", futureInvestmentValue(investmentAmount, annualInterestRate/12, i));
			System.out.print("\n");
		}
	}
	
	// Calculate the future investment value
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}
}
