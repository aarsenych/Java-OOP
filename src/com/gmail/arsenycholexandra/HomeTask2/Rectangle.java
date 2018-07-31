package com.gmail.arsenycholexandra.HomeTask2;

public class Rectangle extends Shape {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public Rectangle() {
		super();
	}
	
	
	/**
	 * @return the p1
	 */
	public Point getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(Point p1) {
		this.p1 = p1;
	}

	/**
	 * @return the p2
	 */
	public Point getP2() {
		return p2;
	}

	/**
	 * @param p2 the p2 to set
	 */
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	/**
	 * @return the p3
	 */
	public Point getP3() {
		return p3;
	}

	/**
	 * @param p3 the p3 to set
	 */
	public void setP3(Point p3) {
		this.p3 = p3;
	}

	/**
	 * @return the p4
	 */
	public Point getP4() {
		return p4;
	}

	/**
	 * @param p4 the p4 to set
	 */
	public void setP4(Point p4) {
		this.p4 = p4;
	}

	@Override
	public double getPerimeter() {
		return Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0)) + Math.sqrt(Math.pow((p2.getX()-p3.getX()), 2.0) + Math.pow((p2.getY()-p3.getY()), 2.0)) +Math.sqrt(Math.pow((p3.getX()-p4.getX()), 2.0) + Math.pow((p3.getY()-p4.getY()), 2.0) + Math.sqrt(Math.pow((p1.getX()-p4.getX()), 2.0) + Math.pow((p1.getY()-p4.getY()) , 2.0)));	
	}
	
	public double getArea() {
		double p = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0)) + Math.sqrt(Math.pow((p2.getX()-p3.getX()), 2.0) + Math.pow((p2.getY()-p3.getY()), 2.0)) +Math.sqrt(Math.pow((p3.getX()-p4.getX()), 2.0) + Math.pow((p3.getY()-p4.getY()), 2.0) + Math.sqrt(Math.pow((p1.getX()-p4.getX()), 2.0) + Math.pow((p1.getY()-p4.getY()) , 2.0))) / 2;
		double a = Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0));
		double b = Math.sqrt(Math.pow((p2.getX()-p3.getX()), 2.0) + Math.pow((p2.getY()-p3.getY()), 2.0));
		double c = Math.sqrt(Math.pow((p3.getX()-p4.getX()), 2.0) + Math.pow((p3.getY()-p4.getY()), 2.0));
		double d = Math.sqrt(Math.pow((p1.getX()-p4.getX()), 2.0) + Math.pow((p1.getY()-p4.getY()), 2.0));
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c) * (p - d));
		return s;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}
}
