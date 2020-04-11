/**
 * @Project_name: JavaMyHomework
 * @File_name: Square.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月7日	
 * @Time: 下午3:25:35
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
public class Square 
    extends GeometricObject{

	/** Data area */
	private double length;
	
	/** Construct a default Square object */
	Square() {
		this.length = 0;
	}
	
	/** Construct a Square object with length value */
	Square(double length) {
		this.length = length;
	}

	/** Construct a Square object with specified value */
	Square(String color, boolean filled, double length) {
		super(color, filled);
		this.length = length;
	}
	
	/** Set length */
	public void setLength(double length) {
		this.length = length;
	}
	
	/** Get length */
	public double getLength() {
		return this.length;
	}
	
	/** Return a string representation of this object */
    @Override
    public String toString() {
	 return "created on " + getDateCreated() + "\ncolor: " + getColor() +
		      " and filled: " + isFilled() + "\narea: " + getArea() + 
		      " and perimeter: " + getPerimeter();
    }
	
	/* (non-Javadoc)
	 * @see chapter11.GeometricObject#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getLength() * this.getLength();
	}

	/* (non-Javadoc)
	 * @see chapter11.GeometricObject#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 4 * this.getLength();
	}

	/* (non-Javadoc)
	 * @see chapter13.Colorable#howtoColor()
	 */
	@Override
	public void howtoColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all four sides");
	}
	
	
}
