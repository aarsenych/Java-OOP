package com.gmail.arsenycholexandra.HomeTask4;

import javax.swing.JOptionPane;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements VoenkomIsLookingForYou {

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
			if (groupList[i] == null)
				continue;
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

	public void addStudentInteractive() throws com.gmail.arsenycholexandra.HomeTask4.NegativeValueException {
		try {
			Student stud = new Student();

			stud.setAge(Integer.valueOf(JOptionPane.showInputDialog("Input student`s age")));
			if (stud.getAge() < 0) {
				throw new NegativeValueException("Negative value");
			}
			stud.setName(JOptionPane.showInputDialog("Input student's name"));
			stud.setGroupName(JOptionPane.showInputDialog("Input student's group"));
			int result = JOptionPane.showConfirmDialog(null, "The  student is male?", "Please select",
					JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				stud.setSex(true);
			} else {
				stud.setSex(false);
			}
			try {
				addStudent(stud);
			} catch (TooManyStudentsException e) {
				System.out.println(e.getMessage());
			}
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Cancel");
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "OK");
		}
	}

	public void sortByAge() {
		Arrays.sort(getGroupList(),
				(s1, s2) -> CheckNULL.checkNULL(s1, s2) != CheckNULL.NOT_NULL ? CheckNULL.checkNULL(s1, s2)
						: s1.getAge() - s2.getAge());
	}

	public void sortByName() {
		Arrays.sort(getGroupList(),
				(s1, s2) -> CheckNULL.checkNULL(s1, s2) != CheckNULL.NOT_NULL ? CheckNULL.checkNULL(s1, s2)
						: s1.getName().compareTo(s2.getName()));
	}

	public void sortByGroup() {
		Arrays.sort(getGroupList(),
				(s1, s2) -> CheckNULL.checkNULL(s1, s2) != CheckNULL.NOT_NULL ? CheckNULL.checkNULL(s1, s2)
						: s1.getGroupName().compareTo(s2.getGroupName()));
	}

	public Student[] GetToTheArmyNow() {
		Student[] sorted = new Student[groupList.length];
		int j = 0;
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] != null) {
				if (groupList[i].getAge() >= 18 && groupList[i].getSex() == true) {
					sorted[j] = groupList[i];
					j++;
				}
			}
		}

		return sorted;
	}
}
