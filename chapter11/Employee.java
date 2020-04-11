/**
 * @Project_name: JavaMyHomework
 * @File_name: Employee.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午12:51:24
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
public class Employee
		extends Person {
	/** Data area */
	private String office;
	private double wages;
	private Date employedDate;
	
	/** 
	 * Construct a default object 
	 */

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String office, double wages, Date employedDate) {
		this.office = office;
		this.wages = wages;
		this.employedDate = employedDate;
	}
	
	public Employee(String office, double wages, Date employedDate,
			String name, String address, String telephone, String email) {
		this.office = office;
		this.wages = wages;
		this.employedDate = employedDate;
		setName(name);
		setAddress(address);
		setTelephone(telephone);
		setEmail(email);
	}
	
	/** Get and Set */
	public String getOffice() {
		return this.office;
	}
	
	public Double getWages() {
		return this.wages;
	}
	
	public Date getEmployedDate() {
		return this.employedDate;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public void setWages(double wages) {
		this.wages = wages;
	}
	
	public void setEmployedDate(Date employedDate) {
		this.employedDate = employedDate;
	}
	
	/** Construct method of return the type and name */
	@Override
	public String toString() {
		return new String("Employee: " + this.getName());
	}
	
}
