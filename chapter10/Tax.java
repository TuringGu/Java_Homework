package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:52:34
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.8
 */
public class Tax {
	/** Data area */
	private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;
	
	
	/** Construct the Tax takes no parameters */
	public Tax() {
	}
	
	/** Construct the Tax with parameters */
	public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
	
	/** Return the filingStatus */
	public int getFilingStatus() {
		return this.filingStatus;
	}
	
	/** Return the brackets */
	public int[][] getBrackets() {
		return this.brackets;
	}
	
	/** Return the rate */
	public double[] getRate() {
		return this.rates;
	}
	
	/** Return the taxableIncome */
	public double getTaxableIncome() {
		return this.taxableIncome;
	}
	
	/** Set the filingStatus */
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	/** Set the brackets */
	public void setGetBrackets(int[][] brackets) {
		this.brackets = brackets;
	}
	
	/** Set the rates */
	public void setRate(double[] rates) {
		this.rates = rates;
	}
	
	/** Set the taxableIncome */
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	/** Construct method of get the tax */
	public double getTax() {
		// Initial helper variables
		double remain = this.taxableIncome;
		double tax = 0;
		
		// Calculate the tax
		for(int level = this.brackets[this.filingStatus].length - 1; level > 0; level--) {
			if(remain > this.brackets[this.filingStatus][level]) {
				tax += (remain - this.brackets[this.filingStatus][level]) * this.rates[level + 1];
				remain = this.brackets[this.filingStatus][level];
			}
		}
		tax += remain * rates[0];
		
		return tax;	
	}

}
