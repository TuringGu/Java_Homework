/**
 * @Project_name: JavaMyHomework
 * @File_name: TestOctagon.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月7日	
 * @Time: 下午5:21:21
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

/**
 * @author Turing-G
 * Exam 13.11
 * It's not complete
 */
public class TestOctagon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an Object of Octagon with length = 5
		Octagon octagon = new Octagon(5);
		
		// Print
		System.out.println("Area: " + octagon.getArea() + "    " + "perimeter: " + octagon.getPerimeter());
		
		// Clone
		Octagon octagonCloned = null;
		try {
			octagonCloned = (Octagon)octagon.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Compare
		int temp = octagon.compareTo(octagonCloned);
		System.out.println("Compare result: " + temp);
		
	}

}
