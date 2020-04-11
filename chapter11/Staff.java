/**
 * @Project_name: JavaMyHomework
 * @File_name: Staff.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午1:23:36
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
public class Staff 
		extends Employee{
	/** Data area */
	private String postTitle;
	
	/** 
	 * Construct a default object 
	 */

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public Staff(String postTitle,
			String office, double wages, Date employedDate) {
		this.postTitle = postTitle;
		setOffice(office);
		setWages(wages);
		setEmployedDate(employedDate);
	}
	
	public Staff(String postTitle,
			String office, double wages, Date employedDate,
			String name, String address, String telephone, String email) {
		this.postTitle = postTitle;
		setOffice(office);
		setWages(wages);
		setEmployedDate(employedDate);
		setName(name);
		setAddress(address);
		setTelephone(telephone);
		setEmail(email);
	}
	
	/** Get and Set */
	public String getPostTitle() {
		return this.postTitle;
	}
	
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	/** Construct method of return the type and name */
	@Override
	public String toString() {
		return new String("Staff: " + this.getName());
	}
}
