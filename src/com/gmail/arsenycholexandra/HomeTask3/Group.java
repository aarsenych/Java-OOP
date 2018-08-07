package com.gmail.arsenycholexandra.HomeTask3;

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
}
