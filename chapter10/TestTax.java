package chapter10;


/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:54:03
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.8
 */
public class TestTax {
	/** Static const */
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	
	
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub
		
		// Initial the data of the tax 2001
		int[][] brackets2001 = {
				{27050, 65550, 136750, 297350},
				{45200, 109250, 166500, 297350},
				{22600, 54625, 83250, 148675},
				{36250, 93650, 151650, 297350}
		};
		double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

		// Initial the data of the tax 2009
		int[][] brackets2009 = {
				{8350, 33950, 52250, 171550, 372950},
				{16700, 67900, 137050, 208850, 372950},
				{8350, 33950, 68525, 104425, 186475},
				{11950, 45500, 117450, 190200, 372950}
		};
		double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		// Initial 2001 and 2009 Tax object
		Tax tax2001 = new Tax();
		Tax tax2009 = new Tax();
		tax2001.setGetBrackets(brackets2001);
		tax2009.setGetBrackets(brackets2009);
		tax2001.setRate(rates2001);
		tax2009.setRate(rates2009);
		
		
		// Print 2001 & 2009 tax table
		// The 2001
		System.out.println();
		System.out.println("           *********2001 USA TAX TABLE******");
		printTaxTable(tax2001);
		System.out.println();
		
		// The 2009
		System.out.println();
		System.out.println("           *********2009 USA TAX TABLE******");
		printTaxTable(tax2009);
		
	}
	
	/** Print the tax table */
	public static void printTaxTable(Tax tax) {
		// Print 2001 tax table with the taxable income in [50000, 60000] (interval: 1000)
		System.out.println("------------------------------------------------------------");
		System.out.println("|taxableIncome |         0|         1|         2|         3|");
		System.out.println("------------------------------------------------------------");
		for(int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
			System.out.printf("|      %8d|", taxableIncome);
			for(int filingStatus = 0; filingStatus <= 3; filingStatus++) {
				
				// Use the public static constant to express it 
				switch(filingStatus) {
				case 0: {
					filingStatus = SINGLE_FILER;	break;
				}
				case 1: {
					filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;	break;
				}
				case 2: {
					filingStatus = MARRIED_SEPARATELY;	break;
				}
				case 3: {
					filingStatus = HEAD_OF_HOUSEHOLD;	break;
				}
				}
				
				// Dynamic assignment
				tax.setFilingStatus(filingStatus);
				tax.setTaxableIncome(taxableIncome);
				
				System.out.printf(" %9.2f|", tax.getTax());
			}
			System.out.println();
			System.out.println("------------------------------------------------------------");
		}
	}
}
