/**
 * @Project_name: JavaMyHomework
 * @File_name: Octagon.java	
 * @author: Turing-G	(谷林涛)
 * @Date: 2016年6月7日	
 * @Time: 下午4:49:05
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 */
package chapter13;

/**
 * @author Turing-G
 * Exam 13.11
 */
public class Octagon 
    extends GeometricObject
    implements Cloneable, Comparable<Octagon>{

	/** Data area */
	private double length;
	
	/** Construct a default Square object */
	Octagon() {
		this.length = 0;
	}
	
	/** Construct a Square object with length value */
	Octagon(double length) {
		this.length = length;
	}

	/** Construct a Square object with specified value */
	Octagon(String color, boolean filled, double length) {
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
		return (2 + 4 / Math.pow(2, 0.5)) * this.getLength() * this.getLength();
	}

	/* (non-Javadoc)
	 * @see chapter11.GeometricObject#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * this.getLength();
	}

	/* (non-Javadoc)
	 * @see chapter13.Colorable#howtoColor()
	 */
	@Override
	public void howtoColor() {
		// TODO Auto-generated method stub
		System.out.println("Color all eight sides");
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(Octagon o) {
		// TODO Auto-generated method stub
		if(this.getArea() > o.getArea()) {
			return 1;
		}
		else if(this.getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
