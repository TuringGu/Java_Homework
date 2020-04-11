package chapter3;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:32:11
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 3.1
 */
public class SolveUnaryQuadraticEquation {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		double a = 0, b = 0, c = 0;
		double delta = 0;                  
		double r1 = 0, r2 = 0;             //roots(if have)
		
		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		delta = b * b - 4 * a * c;         //Discrimination of roots
		
		if (delta > 0){
			r1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			r2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			System.out.println("The equation has two roots " + r1 + " and " + r2);
		}
		else if(delta == 0){
			r1 = r2 = (-b) / (2 * a);
			System.out.println("The equation has ont root " + r1);
		}
		else{
			System.out.println("The equation has no real roots");
		}
	}
	
}
