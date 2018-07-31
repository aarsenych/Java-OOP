package com.gmail.arsenycholexandra.HomeTask2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(2.0, -5.5);
		Point p2 = new Point(8.0, 3.5);
		Point p3 = new Point(15, 2);
		Point p4 = new Point(13, -3);
		
		Circle sc= new Circle(p1, p2);
		Triangle tr = new Triangle(p1, p2, p3);
		Rectangle rc = new Rectangle(p1, p2, p3, p4);

		System.out.println(sc.getPerimeter());
		System.out.println(sc.getArea());
		System.out.println(tr.getPerimeter());
		System.out.println(tr.getArea());
		System.out.println(rc.getPerimeter());
		System.out.println(rc.getArea());
	}

}
