package chapter9;
import java.util.Date;


/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:48:54
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.7
 */
public class TestAccount {
	/** Main method */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub
		
		// Create an account 
		Account account = new Account(1122, 20000);
		account.annualInterestRateModifier(4.5 / 100);
		
		// Withdraw money
		account.withDraw(2500);
		
		// Deposit
		account.deposit(3000);
		
		// Print the Information of the account
		System.out.println("Account ");
		System.out.println("ID: " + account.idAccessor());
		System.out.println("Balance: " + account.balanceAccessor());
		System.out.println("Monthly interest rate: " + account.getMonthlyInterest());
		System.out.println("Created date: " + account.dateCreatedAccessor().toString());
	}

}

// Define the Account class with 2 constructors
class Account {
	/** Data area */
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	/** Construct the Account takes no parameters */
	Account() {
	}
	
	/** Construct the specificAccount with id and beginning balance */
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}
	
	/** Return id */
	int idAccessor() {
		return id;
	}
	
	/** Return balance */
	double balanceAccessor() {
		return balance;
	}
	
	/** Return annualInterestRate */
	double annualInterestRateAccessor() {
		return annualInterestRate;
	}
	
	/** Return dateCreated */
	Date dateCreatedAccessor() {
		return dateCreated;
	}

	/** Set a new id for the account */
	void idModifier(int newId) {
		id = newId;
	}
	
	/** Set a new balance for the account */
	void balanceModifier(double newBalance) {
		balance = newBalance;
	}
	
	/** Set a new annualInterestRate for the account */
	void annualInterestRateModifier(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	/** Method of return the monthly interest */
	double getMonthlyInterest() {
		return balance * (annualInterestRate / 12);
	}
	
	/** To draw a specific amount from the account */
	void withDraw(double amount) {
		balance = balance - amount;
	}
	
	/** To deposit a specific amount from the account */
	void deposit(double amount) {
		balance = balance + amount;
	}

}