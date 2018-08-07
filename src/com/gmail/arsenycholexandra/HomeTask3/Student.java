package com.gmail.arsenycholexandra.HomeTask3;

public class Student extends Human implements Comparable<Student> {
	
	private String groupName;

	public Student(String name, int age, String groupName) {
		super(name, age);
		this.groupName = groupName;
	}

	public Student(String name, int age) {
		super(name, age);
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public void showInfo() {
		System.out.println( "Student`s name is " + super.getName());
		System.out.println( "Student`s age is " + super.getAge());
		System.out.println( "Student`s group is " + this.groupName);
	}
	
	public int compareTo(Student student) {
		int cmp = this.getName().compareTo(student.getName());
		return cmp;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [groupName = " + groupName + " " +  super.toString() + "]";
	}
	
}
