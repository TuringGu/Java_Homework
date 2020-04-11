/**
 * @Project_name: JavaMyHomework
 * @File_name: TestPerson.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月10日	
 * @Time: 下午10:22:54
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter11;
import java.util.Date;

/**
 * @author Turing-G
 * Exam 11.2
 */
public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an object of Person
		Person person1 = new Person("Turing-G", "Dongfang", "15010001000", "810001000");
		Student student1 = new Student(1);
		Employee employee1 = new Employee("The Empire buildings", 300000, new Date());
		Faculty faculty1 = new Faculty(new Date(), "Academician");
		Staff staff1 = new Staff("model worker");
		
		// Test Person
		System.out.println(person1.toString());
		
		// Test Student
		student1.setName("Dannel");
		System.out.println(student1.toString());
		
		// Test Employee
		employee1.setName("John");
		System.out.println(employee1.toString());
		
		// Test Faculty
		faculty1.setName("Abel");
		System.out.println(faculty1.toString());
		
		// Test Staff
		staff1.setName("Julia");
		System.out.println(staff1.toString());
	}

}
