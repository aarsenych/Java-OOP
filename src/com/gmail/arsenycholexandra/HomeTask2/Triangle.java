package com.gmail.arsenycholexandra.HomeTask2;

public class Triangle extends Shape{
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(Point p1, Point p2, Point p3) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle() {
		super();
	}
	
	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0)) + Math.sqrt(Math.pow((p1.getX()-p3.getX()), 2.0) + Math.pow((p1.getY()-p3.getY()), 2.0)) +Math.sqrt(Math.pow((p3.getX()-p2.getX()), 2.0) + Math.pow((p3.getY()-p2.getY()), 2.0));	
	}
	
	@Override
	public double getArea() {
		double p = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0)) + Math.sqrt(Math.pow((p1.getX()-p3.getX()), 2.0) + Math.pow((p1.getY()-p3.getY()), 2.0)) + Math.sqrt(Math.pow((p3.getX()-p2.getX()), 2.0) + Math.pow((p3.getY()-p2.getY()), 2.0)) / 2;
		double a = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0));
		double b = Math.sqrt(Math.pow((p1.getX()-p3.getX()), 2.0) + Math.pow((p1.getY()-p3.getY()), 2.0));
		double c = Math.sqrt(Math.pow((p3.getX()-p2.getX()), 2.0) + Math.pow((p3.getY()-p2.getY()), 2.0));
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}
	
	

}
