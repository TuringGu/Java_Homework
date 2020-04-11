package chapter2;
import java.util.Scanner;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:29:25
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 2.14
 */
public class WeightAndHeightToBMI {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		double weight = 0, height = 0, BMI = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		height = input.nextDouble();
		
		BMI = ( weight * 0.45359237 ) / (( height * 0.0254 ) * ( height * 0.0254 ));
		
		System.out.println("BMI is " + BMI);
	}

}
