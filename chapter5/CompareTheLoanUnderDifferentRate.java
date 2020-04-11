package chapter5;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:36:45
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 5.21
 */
public class CompareTheLoanUnderDifferentRate {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// Input
		Scanner input = new Scanner(System.in);
		System.out.print("Load Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years(limit): ");
		double numberOfYears = input.nextDouble();
		
		// Initial 
		double monthlyInterestRate = 0, annualInterestRate = 0.05;
		double monthlyPayment = 0, totalPayment = 0;
		
		System.out.println("Interest Rate     " + "Monthly Payment     " + "Total Payment     ");
		
		annualInterestRate -= 0.00125;     						   // Add the first output in the loop
		for(double i = 0; i <= 24; i++) {
			annualInterestRate += 0.00125; 						   // The increasing yearly interest rate
			monthlyInterestRate = annualInterestRate/12;           // The increasing monthly interest rate
			
			// Calculate Payment
			monthlyPayment = loanAmount * monthlyInterestRate / 
					(1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
			totalPayment = monthlyPayment * numberOfYears * 12;
			
			// Output
			System.out.printf("%4.3f", 100 * annualInterestRate);  // Add the "%" in the output
			System.out.print("%            "); 
			System.out.printf("%5.2f", monthlyPayment, totalPayment );
			System.out.print("              ");
			System.out.printf("%7.2f", totalPayment);
			System.out.print("\n");
		
		}
		
	}

}
