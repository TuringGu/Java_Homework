package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:51:03
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.9
 */
public class Course {
	public static final int DEFAULT_CAPACITY = 16;	// Default capacity is 16
	
	/** Data area */
	private String courseName;
	private String[] students = new String[DEFAULT_CAPACITY];
	private int numberOfStudents = 0;
	
	/** Construct the Course with course name */
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	/** Return the Students */
	public String[] getStudents() {
		return students;
	}
	
	/** Return the course name */
	public String getCourseName() {
		return courseName;
	}
	
	/** Return the number of the students */
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	/** Construct method of add a student into the course*/
	public void addStudent(String student) {
		if(this.numberOfStudents >= this.students.length) {		// Automatic growth
			String[] temp = new String[this.students.length + 1];
			System.arraycopy(students, 0, temp, 0, this.students.length);
			students = temp;
		}
		students[numberOfStudents++] = student;		// Assigning & numberOfStudents++
	}
	
	/** Construct method of drop a student from the course */
	public void dropStudent(String student) {
		for(int i = 0; i < this.numberOfStudents; i++) {
			
			// Found and drop
			if(this.students[i].equals(student)) {
				this.students[i] = "";
				this.numberOfStudents--;
				for(int k = i; k < this.numberOfStudents; k++) {
					this.students[k] = this.students[k + 1];
				}
				return;		// Drop succeed 
			}
		}
		System.out.println("dropStudentError: Not match!");		// Drop failed
	}
	
	/** Construct method of Drop all the students of the course */
	public void clear() {
		String[] temp = new String[DEFAULT_CAPACITY];
		this.students = temp;
		numberOfStudents = 0;
	}
	
}
