package com.gmail.arsenycholexandra.HomeTask3;

import java.util.Arrays;
import java.util.Comparator;

public class Group {

	private Student[] groupList = new Student[10];

	public void addStudent(Student stud) throws TooManyStudentsException {
		boolean studentAdded = false;
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] == null) {
				groupList[i] = stud;
				studentAdded = true;
				break;
			}
		}
		if (studentAdded == false)
			throw new TooManyStudentsException("Too many students");
	}

	public Student[] getGroupList() {
		return groupList;
	}

	public void removeStudent(Student stud) {
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] == null) continue;
			if (groupList[i].equals(stud)) {
				groupList[i] = null;
			}
		}
	}

	public Student getByIndex(int index) {
		return groupList[index];
	}

	public int searchStudent(String name1) {
		int position = -1;
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] == null)
				continue;
			if (groupList[i].getName().equals(name1)) {
				return i;
			}
		}
		return position;
	}

	public void findStudent(String name) {
		int position = this.searchStudent(name);

		if (position >= 0) {
			System.out.println(
					"Student " + this.getByIndex(position).getName() + " is on " + position + " position of list");
		} else {
			System.out.println("There is no such student in list");
		}
	}

	public void sort() {
		Arrays.sort(getGroupList(), new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1 == null && s2 == null) {
					return 0;
				}
				if (s1 == null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}
				return s1.compareTo(s2);
			}
		});
	}

}
