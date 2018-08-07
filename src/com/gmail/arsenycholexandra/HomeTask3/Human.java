package com.gmail.arsenycholexandra.HomeTask3;

public class Human {

	private String name;
	private int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Human() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("Human name is " + this.name);
		System.out.println("Human age is " + this.age);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Human [ name= " + name + ", age = " + age + "]";
	}
}
