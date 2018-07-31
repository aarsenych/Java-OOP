package com.gmail.arsenycholexandra.Task1;

public class Cat {
	private String name;
	private int age;
	private double weight;
	private String colour;
	private boolean sex;
	
	public Cat(String name, int age, double weight, String colour, boolean sex) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.colour = colour;
		this.sex = sex;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
	public void getVoice() {
		System.out.println("Meow - meow!");
	}
	
	public void askFood(int hours) {
		if (hours > 3) {
			System.out.println("MEOW! I need food!");
		} 
		else {
			System.out.println("I`m not hungry, human");
		}
		
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + ", colour=" + colour + ", sex=" + sex
				+ "]";
	}
	

}
