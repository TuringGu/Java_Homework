/**
 * @Project_name: JavaMyHomework
 * @File_name: Complex.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月8日	
 * @Time: 下午6:46:25
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

/**
 * @author Turing-G
 * Exam 13.17
 */
public class Complex extends Number implements Cloneable{

	private static final long serialVersionUID = 1L;
	// Data fields
	private double realPart = 0;
	private double imaginaryPart = 0;
	
	/** 
	 * Construct a default object 
	 */
	public Complex() {
		realPart = 0;
		imaginaryPart = 0;
	}

	public Complex(double a) {
		// TODO Auto-generated constructor stub
		this.realPart = a;
		this.imaginaryPart = 0;
	}
	
	public Complex(double a, double b) {
		this.realPart = a;
		this.imaginaryPart = b;
	}
	
	/** Return real part */
	public double getRealPart() {
		return this.realPart;
	}
	
	/** Return imaginary part */
	public double getImaginaryPart() {
		return this.imaginaryPart;
	}
	
	/** Return the abs */
	public double abs() {
		return Math.pow((Math.pow(getRealPart(), 2) + Math.pow(getImaginaryPart(), 2)), 0.5);
	}
	
	/** Add */
	public Complex add(Complex secondComplex) {
		double a = this.getRealPart();
		double b = this.getImaginaryPart();
		double c = secondComplex.getRealPart();
		double d = secondComplex.getImaginaryPart();
		return new Complex(a + c, b + d);
	}
	
	/** Subtract */
	public Complex subtract(Complex secondComplex) {
		double a = this.getRealPart();
		double b = this.getImaginaryPart();
		double c = secondComplex.getRealPart();
		double d = secondComplex.getImaginaryPart();
		return new Complex(a - c, b - d);
	}
	
	/** Multiply */
	public Complex multiply(Complex secondComplex) {
		double a = this.getRealPart();
		double b = this.getImaginaryPart();
		double c = secondComplex.getRealPart();
		double d = secondComplex.getImaginaryPart();
		return new Complex(a * c - b * d, b * c + a * d);
	}
	
	/** Divide */
	public Complex divide(Complex secondComplex) {
		double a = this.getRealPart();
		double b = this.getImaginaryPart();
		double c = secondComplex.getRealPart();
		double d = secondComplex.getImaginaryPart();
		return new Complex((a * c + b * d) / (c * c + d * d), (b * c - a * d)/(c * c + d * d));
	}
	
	/** ToString */
	@Override  
	public String toString() {
	    if (this.getImaginaryPart() == 0)
	      return this.getRealPart() + "";
	    else
	      return this.getRealPart() + " + " + this.getImaginaryPart() + "i";
	}

	/* (non-Javadoc)
	 * @see java.lang.Number#doubleValue()
	 */
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return this.abs();
	}

	/* (non-Javadoc)
	 * @see java.lang.Number#floatValue()
	 */
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Number#intValue()
	 */
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)doubleValue();
	}

	/* (non-Javadoc)
	 * @see java.lang.Number#longValue()
	 */
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}
	
	/** Interface: Cloneable */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
