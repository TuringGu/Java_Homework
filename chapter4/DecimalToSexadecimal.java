package chapter4;
import java.util.*;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:34:36
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * Exam 4.11
 */
public class DecimalToSexadecimal {

	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimalNumber = input.nextInt();
		String sexadecimalNumber = "";
		switch (decimalNumber) {
		case 1: sexadecimalNumber = "1"; break;
		case 2: sexadecimalNumber = "2"; break;
		case 3: sexadecimalNumber = "3"; break;
		case 4: sexadecimalNumber = "4"; break;
		case 5: sexadecimalNumber = "5"; break;
		case 6: sexadecimalNumber = "6"; break;
		case 7: sexadecimalNumber = "7"; break;
		case 8: sexadecimalNumber = "8"; break;
		case 9: sexadecimalNumber = "9"; break;
		case 10:sexadecimalNumber = "A"; break;
		case 11:sexadecimalNumber = "B"; break;
		case 12:sexadecimalNumber = "C"; break;
		case 13:sexadecimalNumber = "D"; break;
		case 14:sexadecimalNumber = "E"; break;
		case 15:sexadecimalNumber = "F"; break;
		default:sexadecimalNumber = "invalid";
		}
		
		// Output
		if(sexadecimalNumber == "invalid") {
			System.out.println(decimalNumber + " is an invalid input");
			return;
		}
		System.out.println("The hex value is " + sexadecimalNumber);
	}

}
