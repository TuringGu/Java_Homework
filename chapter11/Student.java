/**
 * @Project_name: JavaMyHomework
 * @File_name: Student.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午12:38:51
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter11;

/**
 * @author Turing-G
 * Exam 11.2
 */
public class Student 
		extends Person{
	/** Data area */
	private int gradeStatus;
	
	/** 
	 * Construct a default object 
	 */

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int gradeStatus) {
		this.gradeStatus = gradeStatus;
	}
	
	public Student(int gradeStatus, String name, String address, String telephone, String email) {
		this.gradeStatus = gradeStatus;
		setName(name);
		setAddress(address);
		setTelephone(telephone);
		setEmail(email);
	}
	
	/** Get and Set */
	public int getGradeStatus() {
		return this.gradeStatus;
	}
	
	public void setGradeStatus(int gradeStatus) {
		this.gradeStatus = gradeStatus;
	}
	
	/** Construct method of get type and name */
	@Override
	public String toString() {
		return new String("Student: " + this.getName());
	}
	
}
