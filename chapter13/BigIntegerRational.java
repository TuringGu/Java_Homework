/**
 * @Project_name: JavaMyHomework
 * @File_name: BigIntegerRational.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月8日	
 * @Time: 下午8:37:52
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Turing-G
 *
 */
public class BigIntegerRational extends Number implements Comparable<BigIntegerRational>{
	  private static final long serialVersionUID = 1L;
	    // Data fields for numerator and denominator
	  private BigInteger numerator;
	  private BigInteger denominator;
	
	  /** Construct a rational with default properties */
	  public BigIntegerRational() {
	      this(BigInteger.ZERO, BigInteger.ONE);
	  }
	
	  /** Construct a rational with specified numerator and denominator */
	  public BigIntegerRational(BigInteger numerator, BigInteger denominator) {
	      BigInteger gcd = gcd(numerator, denominator);
	    
	      this.numerator = ((denominator.compareTo(BigInteger.ZERO) > 0) ?
	    		  BigInteger.ONE : new BigInteger("-1")).multiply(numerator).divide(gcd);
	    
	      this.denominator = denominator.abs().divide(gcd);
	  }
	
	  /** Find GCD of two numbers */
	  private static BigInteger gcd(BigInteger n, BigInteger d) {
		  BigInteger n1 = n.abs();
		  BigInteger n2 = d.abs();
	      BigInteger gcd = BigInteger.ONE;
	    
	      for (BigInteger k = BigInteger.ONE; 
	    		  (k.compareTo(n1) <= 0) && (k.compareTo(n2) <= 0); k = k.add(BigInteger.ONE)) {
	          if (n1.divideAndRemainder(k)[1].equals(BigInteger.ZERO) && 
	    		      n2.divideAndRemainder(k)[1].equals(BigInteger.ZERO)) {
	    	      gcd = k;
	          }	    	  
	      }
	
	      return gcd;
	  }
	
	  /** Return numerator */
	  public BigInteger getNumerator() {
	      return numerator;
	  }
	
	  /** Return denominator */
	  public BigInteger getDenominator() {
	      return denominator;
	  }
	
	  /** Add a rational number to this rational */
	  public BigIntegerRational add(BigIntegerRational secondRational) {
		  
	      BigInteger n = numerator.multiply(secondRational.getDenominator()).add
	    		  (denominator.multiply(secondRational.getNumerator()));
	      
	      BigInteger d = denominator.multiply(secondRational.getDenominator());
	    
	      return new BigIntegerRational(n, d);
	  }
	
	  /** Subtract a rational number from this rational */
	  public BigIntegerRational subtract(BigIntegerRational secondRational) {
		  
		  BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract
		    		(denominator.multiply(secondRational.getNumerator()));
		  
		  BigInteger d = denominator.multiply(secondRational.getDenominator());
		  
		  return new BigIntegerRational(n, d);
	  }
	
	  /** Multiply a rational number to this rational */
	  public BigIntegerRational multiply(BigIntegerRational secondRational) {
	      BigInteger n = numerator.multiply(secondRational.getNumerator());
	      BigInteger d = denominator.multiply(secondRational.getDenominator());
	      return new BigIntegerRational(n, d);
	  }
	
	  /** Divide a rational number from this rational */
	  public BigIntegerRational divide(BigIntegerRational secondRational) {
	      BigInteger n = numerator.multiply(secondRational.getDenominator());
	      BigInteger d = denominator.multiply(secondRational.numerator);
	      return new BigIntegerRational(n, d);
	  }
	
	  @Override  
	  public String toString() {
	      if (denominator.equals(BigInteger.ONE))
	    	  return numerator + "";
	      else
	    	  return numerator + "/" + denominator;
	  }
	
	  @Override // Override the equals method in the Object class 
	  public boolean equals(Object other) {
	      if ((this.subtract((BigIntegerRational)(other))).getNumerator().equals(BigInteger.ZERO))
	    	  return true;
	      else
	    	  return false;
	  }
	
	  @Override // Implement the abstract intValue method in Number 
	  public int intValue() {
	      return (int)doubleValue();
	  }
	
	  @Override // Implement the abstract floatValue method in Number 
	  public float floatValue() {
	    return (float)doubleValue();
	  }
	
	  @Override // Implement the doubleValue method in Number 
	  public double doubleValue() {
		  BigDecimal temp1 = new BigDecimal(numerator);
		  BigDecimal temp2 = new BigDecimal(denominator);
	      BigDecimal result = temp1.divide(temp2, 20, BigDecimal.ROUND_UP);
	      return result.doubleValue();
	  }
	
	  @Override // Implement the abstract longValue method in Number
	  public long longValue() {
	    return (long)doubleValue();
	  }
	
	  @Override // Implement the compareTo method in Comparable
	  public int compareTo(BigIntegerRational o) {
	    if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
	      return 1;
	    else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
	      return -1;
	    else
	      return 0;
	  }
	  
}

