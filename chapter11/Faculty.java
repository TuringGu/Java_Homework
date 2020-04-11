/**
 * @Project_name: JavaMyHomework
 * @File_name: Faculty.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月11日	
 * @Time: 下午1:11:32
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
public class Faculty 
		extends Employee{
	/** Data area */
	private Date officeHours;
	private String rank;
	
	/** 
	 * Construct a default object 
	 */

	public Faculty() {
		// TODO Auto-generated constructor stub
	}
	
	public Faculty(Date officeHours, String rank) {
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public Faculty(Date officeHours, String rank,
			String office, double wages, Date employedDate) {
		this.officeHours = officeHours;
		this.rank = rank;
		setOffice(office);
		setWages(wages);
		setEmployedDate(employedDate);
	}
	
	public Faculty(Date officeHours, String rank,
			String office, double wages, Date employedDate,
			String name, String address, String telephone, String email) {
		this.officeHours = officeHours;
		this.rank = rank;
		setOffice(office);
		setWages(wages);
		setEmployedDate(employedDate);
		setName(name);
		setAddress(address);
		setTelephone(telephone);
		setEmail(email);
	}
	
	/** Get and Set */
	public Date getOfficeHours() {
		return this.officeHours;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public void setOfficeHours(Date officeHours) {
		this.officeHours = officeHours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	/** Construct method of return the type and name */
	@Override
	public String toString() {
		return new String("Faculty: " + this.getName());
	}

}
