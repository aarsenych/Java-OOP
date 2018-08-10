package com.gmail.arsenycholexandra.HomeTask4;

public class Student extends Human implements Comparable<Student> {

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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((groupName == null) ? 0 : groupName.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (groupName == null) {
			if (other.groupName != null)
				return false;
		} else if (!groupName.equals(other.groupName))
			return false;
		return true;
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
