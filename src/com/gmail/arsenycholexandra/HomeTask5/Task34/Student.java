package com.gmail.arsenycholexandra.HomeTask5.Task34;

import java.io.Serializable;

public class Student extends Human implements Comparable<Student>, Serializable {

	private String groupName;

	public Student(String name, int age, String groupName, boolean sex) {
		super(name, age, sex);
		this.groupName = groupName;
	}

	public Student() {
		super();
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName
	 *            the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public void showInfo() {
		System.out.println("Student`s name is " + super.getName());
		System.out.println("Student`s age is " + super.getAge());
		System.out.println("Student`s sex is " + super.getSex());
		System.out.println("Student`s group is " + this.groupName);
	}

	public int compareTo(Student student) {
		int cmp = this.getName().compareTo(student.getName());
		return cmp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [groupName = " + groupName + " " + super.toString() + "]";
	}

}
