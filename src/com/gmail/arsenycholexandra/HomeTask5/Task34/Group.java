package com.gmail.arsenycholexandra.HomeTask5.Task34;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Group implements VoenkomIsLookingForYou {

	// CSV format for excel
	// split by
	// pattern DAO 4 task of HW for 3-4 task

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

	/**
	 * @param stud
	 */
	public void removeStudent(Student stud) {
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] == null)
				continue;
			if (groupList[i].getName().equals(stud.getName()) && groupList[i].getAge() == stud.getAge()
					&& groupList[i].getSex() == stud.getSex()) {
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
				try {
					throw new NegativeValueException("Negative value");
				} catch (NegativeValueException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

	public Student[] getToTheArmyNow() {
		int j = 0;
		for (int i = 0; i < groupList.length; i++) {
			if (groupList[i] != null) {
				if (groupList[i].getAge() >= 18 && groupList[i].getSex() == true) {
					j++;
				}
			}
		}
		Student[] sorted = new Student[j];
		int i = 0;
		for (Student stud : groupList) {
			if (stud != null && stud.getAge() >= 18 && stud.getSex() == true) {
				sorted[i++] = stud;
			}
		}
		return sorted;
	}

}
