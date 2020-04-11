/**
 * @Project_name: JavaMyHomework
 * @File_name: TestColorable.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月7日	
 * @Time: 下午4:10:42
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

/**
 * @author Turing-G
 * Exam 13.7
 */
public class TestColorable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initial
		GeometricObject[] objects = new GeometricObject[5];

		objects[0] = new Square("red", true, 50);
		objects[1] = new Square("yellow", true, 100);
		objects[2] = new Square("", false, 100);
		objects[3] = new Square("", false, 100);
		objects[4] = new Square("green", true, 200);
		
		// Output
		for(int i = 0; i < objects.length; i++) {
			if(objects[i].isFilled()) {
				System.out.println("object " + i + ": " + objects[i].toString());
				objects[i].howtoColor();
				System.out.println();
			}
		}
		
	}

}
