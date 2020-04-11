package chapter10;

/**
 * @Project: JavaMyHomework
 * @author Turing-G
 * @Date: 2016��5��9��	
 * @Time: ����2:54:37
 * @Copyright: 2016 All rights reserved.
 * @Copyright_notice: Resources for learning reference only , 
 * You can redistribute it but please do not modify the core or 
 * change the declaration of the Copyright! Thank you!
 * 
 * Exam 10.12
 */
public class Triangle2D {
	/** Data area */
	private Point p1;
	private Point p2;
	private Point p3;

	/** Construct triangle takes no parameters */
	public Triangle2D() {
		this.p1 = new Point(0, 0);
		this.p2 = new Point(1, 1);
		this.p3 = new Point(2, 5);
	}

	/** Construct triangle with specific values */
	public Triangle2D(Point p1, Point p2, Point p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	/** Get p1, p2, p3 */
	public Point getP1() {
		return this.p1;
	}

	public Point getP2() {
		return this.p2;
	}

	public Point getP3() {
		return this.p3;
	}
	
	/** Set p1, p2, p3 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	/** Construct method of get perimeter */
	public double getPerimeter() {
		return this.p1.distance(p2) + this.p2.distance(p3) + this.p3.distance(p1);
	}
	
	
	/** Construct method of get area */
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
	
	/** Construct method of judge weather a point is in the 2D triangle */
	public boolean contains(Point p) {
		if(isCrossPointInSegmentWithoutEndpoints(this.p1, this.p2, this.p3, p) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p3, this.p2, p) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, p, this.p2, this.p3)
				) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/** Construct method of judge weather a triangle is in the 2D triangle */
	public boolean contains(Triangle2D t) {
		if(contains(t.p1) && contains(t.p2) && contains(t.p3)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/** Construct method of judge weather a triangle is overlaps the 2D triangle */
	public boolean overlaps(Triangle2D t) {
		if(isCrossPointInSegmentWithoutEndpoints(this.p1, this.p2, t.p1, t.p2) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p3, t.p1, t.p2) ||
				isCrossPointInSegmentWithoutEndpoints(this.p2, this.p3, t.p1, t.p2) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p2, t.p1, t.p3) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p3, t.p1, t.p3) ||
				isCrossPointInSegmentWithoutEndpoints(this.p2, this.p3, t.p1, t.p3) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p2, t.p2, t.p3) ||
				isCrossPointInSegmentWithoutEndpoints(this.p1, this.p3, t.p3, t.p3) ||
				isCrossPointInSegmentWithoutEndpoints(this.p2, this.p3, t.p2, t.p3)
				) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/** Judge weather the two lines have a cross point */
	public static boolean haveCrossPoint(Point p1, Point p2, Point p3, Point p4) {
		// Data assigning
		double a = p1.getY() - p2.getY();
		double b = -(p1.getX() - p2.getX());
		
		double c = p3.getY() - p4.getY();
		double d = -(p3.getX() - p4.getX());
		
		// Judge
		if(a * d == b * c) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/** Return the cross point of the two line */
	public static Point crossPoint(Point p1, Point p2, Point p3, Point p4) {
		// Data assigning
		double a = p1.getY() - p2.getY();
		double b = -(p1.getX() - p2.getX());
		double e = a * p1.getX() + b * p1.getY();
		
		double c = p3.getY() - p4.getY();
		double d = -(p3.getX() - p4.getX());
		double f = c * p3.getX() + d * p3.getY();
		
		if(a * d == b * c) {
			System.out.println("Parallel!");
			System.exit(0);		// terminate the program
		}
		
		// Calculate
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		return new Point(x, y);
	}
	
	/** Judge weather a cross point is in the segment without endpoints */
	public static boolean isCrossPointInSegmentWithoutEndpoints(Point p1, Point p2, Point p3, Point p4) {
		if(!haveCrossPoint(p1, p2, p3, p4)) {
			return false;
		}
		else {
			Point crossPoint = crossPoint(p1, p2, p3, p4);
			
			// Is in the segment without endpoints
			if(Math.abs((p1.getX() - crossPoint.getX())) < Math.abs((p1.getX() - p2.getX())) &&
					Math.abs((p2.getX() - crossPoint.getX())) < Math.abs((p1.getX() - p2.getX()))) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	
}
