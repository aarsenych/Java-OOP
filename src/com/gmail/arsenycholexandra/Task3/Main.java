package com.gmail.arsenycholexandra.Task3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector3d v1 = new Vector3d(5, 8, -2);
		Vector3d v2 = new Vector3d(-2, 3, 5);
		
		v1.addVector(v2);
		v2.scalarMultiplication(v1);
		v1.vectorMultiplication(v2);
		
		

	}

}
