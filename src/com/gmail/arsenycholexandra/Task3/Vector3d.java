package com.gmail.arsenycholexandra.Task3;

public class Vector3d {
	private int x;
	private int y;
	private int z;
	
	public Vector3d(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3d() {
		super();
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}

	public void addVector(Vector3d vector) {
		int a1 = x + vector.x;
		int b1 = y + vector.y;
		int c1 = z + vector.z;
		System.out.println("The sum of vectors: (" + a1 + ";" + b1 + ";" + c1 + ").");
	}
	
	public void scalarMultiplication(Vector3d vector) {
		double s = x * vector.x + y * vector.y + z * vector.z;
		System.out.println("The result of scalar multiplicaton is " + s);
	}
	
	public void vectorMultiplication(Vector3d vector) {
		double s1 =  y * vector.z - z * vector.y;
		double s2 =  x * vector.z - y * vector.x;
		double s3 =  x * vector.y - y * vector.x;
		System.out.println("The result of vector multiplicaton is i*(" + s1+ ") + j*(" + s2 + ") + k*(" + s3 + ")");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vector3d [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}
