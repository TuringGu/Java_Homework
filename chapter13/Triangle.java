/**
 * @Project_name: JavaMyHomework
 * @File_name: Triangle.java	
 * @author: Turing-G	(������)
 * @Date: 2016��5��12��	
 * @Time: ����9:06:00
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

import java.awt.geom.Point2D;;

/**
 * @author Turing-G
 * Exam 13.1
 */
public class Triangle 
	extends GeometricObject{
	/** Data area */
	private Point2D p1;
	private Point2D p2;
	private Point2D p3;

	/** Construct triangle takes no parameters */
	public Triangle() {
	}
	
	/** Construct triangle with specific values */
	public Triangle(Point2D p1, Point2D p2, Point2D p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	/** construct triangle with specific values */
	public Triangle(Point2D p1, Point2D p2, Point2D p3, String color, boolean filled) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		setColor(color);
		setFilled(filled);
	}
	
	/** Get p1, p2, p3 */
	public Point2D getP1() {
		return this.p1;
	}
	
	public Point2D getP2() {
		return this.p2;
	}
	
	public Point2D getP3() {
		return this.p3;
	}

    /** Return a string representation of this object */
    @Override
    public String toString() {
	 return "created on " + getDateCreated() + "\ncolor: " + getColor() +
		      " and filled: " + isFilled() + "\narea: " + getArea() + 
		      " and perimeter: " + getPerimeter();
    }

	/** Construct method of get perimeter */
    @Override
	public double getPerimeter() {
		return this.p1.distance(p2) + this.p2.distance(p3) + this.p3.distance(p1);
	}
	
	/** Construct method of get area */
    @Override
	public double getArea() {
		// Calculate the length of the edge
		double a = this.p1.distance(p2);
		double b = this.p2.distance(p3);
		double c = this.p3.distance(p1);
		
		// Perimeter of triangle
		double perimeter = a + b + c;
		
		// p is half of perimeter
		double p = perimeter / 2;
		
		// Heron's formula
		double area = Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
	
		// Return result
		return area;
	}

	/* (non-Javadoc)
	 * @see chapter13.Colorable#howtoColor()
	 */
	@Override
	public void howtoColor() {
		// TODO Auto-generated method stub
		
	}

}
