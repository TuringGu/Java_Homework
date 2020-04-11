package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:53:11
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.9
 */
public class TestCourse {
	/** The Main */
	public static void main(String[] args) {
		
		// About the copyright
		System.out.println("******************************");
		System.out.println("* Copyright: Turing-G.    *");
		System.out.println("******************************");
		
		// TODO Auto-generated method stub

		// Create a Course object
		Course courseMathmatric = new Course("mathmatric");
		
		// Add three students
		courseMathmatric.addStudent("John");
		courseMathmatric.addStudent("Susan");
		courseMathmatric.addStudent("Henry");
		
		// Drop a students
		courseMathmatric.dropStudent("Susan");
		
        // Print the students of the course
		printCourseStudents(courseMathmatric);
		
	}
	
	/** Display the students of the course */
	public static void printCourseStudents(Course course) {
		System.out.println("The students of " + course.getCourseName());
		System.out.println("**********************************");
		for(int i = 0; i < course.getNumberOfStudents(); i++) {
			System.out.println("NO." + i + ": " + course.getStudents()[i]);
		}
	}
}
