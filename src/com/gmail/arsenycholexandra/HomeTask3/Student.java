package com.gmail.arsenycholexandra.HomeTask3;

public class Student extends Human implements Comparable<Student> {

	private String groupName;

	public Student(String name, int age, String groupName) {
		super(name, age);
		this.groupName = groupName;
	}

	public Student() {
		
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
		System.out.println("Student`s group is " + this.groupName);
	}

	public int compareTo(Student student) {
		int cmp = this.getName().compareTo(student.getName());
		return cmp;
	}
	
	@Override
	public boolean equals(Student stud) {
		if (this == stud) {
			return true;
		}
		if (stud == null) {
			return false;
		}
		if (this.getClass() != stud.getClass()) {
			return false;
		}
		
		Student other = (Student) stud;
		
		if (this.getAge() != other.getAge()) {
			return false;
		}
		if (this.getName() == null) {
			if (other.getName() != null) {
				return false;
			}
		}
		else if (!this.getName().equals(other.getName())) {
				return false;
		}
		return true;	
	}
	
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + this.getName().hashCode();
		result = 31 * result + this.getAge();
		result = 31 * result + this.groupName.hashCode();
		return result;
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
