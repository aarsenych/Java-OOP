package com.gmail.arsenycholexandra.HomeTask2;

public class Triangle extends Shape {
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
		return p1.getDistance(p2) + p2.getDistance(p3) + p3.getDistance(p1);
	}

	@Override
	public double getArea() {
		double p = p1.getDistance(p2) + p2.getDistance(p3) + p3.getDistance(p1) / 2;
		double a = p1.getDistance(p2);
		double b = p2.getDistance(p3);
		double c = p3.getDistance(p1);
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}

}
