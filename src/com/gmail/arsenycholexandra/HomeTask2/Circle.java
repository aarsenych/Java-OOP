package com.gmail.arsenycholexandra.HomeTask2;

public class Circle extends Shape {
	private Point p1;
	private Point p2;
	
	public Circle(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
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

	@Override
	public double getPerimeter() {
		return 2* Math.PI * Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0));	
	}
	
	@Override
	public double getArea() {
		return  Math.PI * Math.pow(Math.sqrt(Math.pow((p1.getX()-p2.getX()), 2.0) + Math.pow((p1.getY()-p2.getY()), 2.0)),2.0);	
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circle [p1=" + p1 + ", p2=" + p2 + "]";
	}
}
