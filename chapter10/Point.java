package chapter10;
import java.awt.geom.Point2D;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:51:38
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.4
 */

//Define the RegularPolygon class with 2 constructors 
public class Point {
	/** Data area */
	private double x;
	private double y;
	
	/** Construct the Mypoint takes no parameters */
	public Point() {
		x = 0;	y = 0;
	}
	
	/** Construct the Mypoint with specific x & y */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/** Return the x */
	public double getX() {
		return x;
	}
	
	/** Return the y */
	public double getY() {
		return y;
	}
	
	/** Construct method of get the distance from MyPoint to another
	 * point(x, y) */
	public double distance(double x, double y) {
		return Point2D.distance(this.x, this.y, x, y);
	
	}
	
	/** Construct method of get the distance from MyPoint to another Point(MyPoint) */
	public double distance(Point point) {
		return Point2D.distance(this.x, this.y, point.x, point.y);
	}
}
