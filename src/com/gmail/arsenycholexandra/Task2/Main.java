package com.gmail.arsenycholexandra.Task2;

public class Main {

	public static void main(String[] args) {
		Triangle tr1 = new Triangle(3, 4, 5);
		Triangle tr2 = new Triangle(5, 8, 7);
		
		System.out.println("Area = " + tr1.countArea());
		System.out.println("Area = " + tr2.countArea());
		System.out.println(tr1.toString());
		System.out.println(tr2.toString());
		
	}

}
