package chapter9;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:49:11
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 9.11
 */
public class TestLinearEquation {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub
		
		// User's input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f by order:");
		
		// Create object LinearEquation
		LinearEquation linearEquation = new LinearEquation(input.nextDouble(), input.nextDouble(),
				input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		
		// Print the result
		if(linearEquation.isSolvable()) {
			System.out.println("The solve of the eqution:");
			System.out.println("x: " + linearEquation.getX() + "    " + "y: " + linearEquation.getY());
		}
		else {
			System.out.println("The equation has no solution");
		}
	}

}

// Create LinearEquation class with 2 constructors
class LinearEquation {
	/** Data area */
	private double a, b, c, d, e, f;
	
	/** Construct the LinearEqution with a, b, c, d, e, f */
	LinearEquation(double newA, double newB, double newC, double newD, double newE, double newF) {
		a = newA;	b = newB;	c = newC;	d = newD;	e = newE;	f = newF;
	}
	
	/** return value a */
	double getA() {
		return a;
	}
	
	/** return value b */
	double getB() {
		return b;
	}
	
	/** return value c */
	double getC() {
		return c;
	}
	
	/** return value d */
	double getD() {
		return d;
	}
	
	/** return value e */
	double getE() {
		return e;
	}
	
	/** return value f */
	double getF() {
		return f;
	}
	
	/** The method of return the boolean values */
	boolean isSolvable() {
		if((a * d - b * c) != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Return the solve of x */
	double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}
	
	/** Return the solve of y */
	double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
	
}