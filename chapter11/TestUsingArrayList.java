/**
 * @Project_name: JavaMyHomework
 * @File_name: UsingArrayList.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午5:29:47
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter11;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Turing-G
 * Exam 11.6
 */
public class TestUsingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an ArrayList
		ArrayList<Object> arrayList1 = new ArrayList<>();
		
		// Add some object into the list
		arrayList1.add(new Loan());
		arrayList1.add(new Date());
		arrayList1.add(new String("Hello, world!"));
		arrayList1.add(new Circle(3.3));
		
		// Traversal
		System.out.println("Test Beginning:\n");
		for(int i = 0; i < arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i).toString());
			System.out.println();
		}
	}

}
