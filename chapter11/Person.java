/**
 * @Project_name: JavaMyHomework
 * @File_name: Person.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年5月10日	
 * @Time: 下午10:12:06
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
public class Person {
	/** Data area */
	private String name;
	private String address;
	private String telephone;
	private String email;

	/** 
	 * Construct a default object 
	 */

	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String address, String telephone, String email) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.email = email;
	}
	
	/** Get an set method */
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	/** Construct method of return the type and name */
	public String toString() {
		return new String("Person: " + this.name);
	}
	
}
