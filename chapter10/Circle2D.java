package chapter10;
import java.awt.geom.Point2D;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:50:40
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.11
 */
public class Circle2D {
	/** Data area */
	private double x;
	private double y;
	private double radius;
	
	/** Construct the Circle2D takes no parameters */
	public Circle2D() {
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	
	/** Construct the Circle2D with specific value */
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/** Return the x */
	public double getX() {
		return this.x;
	}
	
	/** Return the y */
	public double getY() {
		return this.y;
	}
	
	/** Return the radius */
	public double getRadius() {
		return this.radius;
	}
	
	/** Return the area of the 2D circle */
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	/** Return the perimeter of the 2D circle */
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	/** Construct method of judge weather a point(x, y) is in the 2D circle */
	public boolean contains(double x, double y) {
		if(Point2D.distance(this.x, this.y, x, y) < this.radius) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Construct method of judge weather a circle is in the 2D circle */
	public boolean contains(Circle2D circle) {
		double distance = Point2D.distance(this.x, this.y, circle.x, circle.y);
		if(distance < Math.abs(this.radius - circle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Construct method of judge weather a circle is overlaps the 2D circle */
	public boolean overlaps(Circle2D circle) {
		double distance = Point2D.distance(this.x, this.y, circle.x, circle.y);
		if(Math.abs((this.radius - circle.radius)) < distance &&
				distance < (this.radius + circle.radius)) {
			return true;
		}
		else {
			return false;
		}
	}

}
