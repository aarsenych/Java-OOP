package com.gmail.arsenycholexandra.HomeTask4;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Human h = new Human("Vasya", 25, true);
		h.showInfo();

		Student st = new Student("Andrez", 16, "EV-72", true);
		Student st2 = new Student("Andrey", 20, "EV-69", false);
		Student st3 = new Student("Nick", 19, "EV-71", true);
		Student st4 = new Student("Roland", 13, "EK-71", false);
		Student st5 = new Student("Zack", 21, "EV-71", true);
		System.out.println();
		st.showInfo();

		Group gr = new Group();
		try {
			gr.addStudent(st);
			gr.addStudent(st2);
			gr.addStudent(st3);
			gr.addStudent(st4);
			gr.addStudent(st5);
		} catch (TooManyStudentsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();

		gr.findStudent("Andrey");
		gr.findStudent("Alex");
		gr.removeStudent(st2);

		try {
			gr.addStudentInteractive();
		} catch (NegativeValueException e) {
			JOptionPane.showMessageDialog(null, "Error number format");
		}
		System.out.println();

		gr.sortByName();

		for (Student student : gr.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}
		System.out.println();
		gr.sortByAge();
		for (Student student : gr.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}
		System.out.println();
		gr.sortByGroup();
		for (Student student : gr.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}
		System.out.println();
		for (Student recruts : gr.getToTheArmyNow()) {
			if (recruts != null) {
				System.out.println(recruts);
			}
		}
	}

}

// OUTPUT

// Human name is Vasya
// Human age is 25
// Human sex is true
//
// Student`s name is Andrez
// Student`s age is 22
// Student`s sex is true
// Student`s group is EV-72
//
// Student Andrey is on 1 position of list
// There is no such student in list
//

              // Sorted by name
// Student [groupName = EV-69 Human [name=Andrey, age=20, sex=false]]
// Student [groupName = EV-72 Human [name=Andrez, age=22, sex=true]]
// Student [groupName = EM-13 Human [name=Kolya, age=14, sex=true]]
// Student [groupName = EV-71 Human [name=Nick, age=21, sex=true]]
// Student [groupName = EK-71 Human [name=Roland, age=21, sex=false]]
// Student [groupName = EV-71 Human [name=Zack, age=21, sex=true]]
//

             // Sorted by age
// Student [groupName = EM-13 Human [name=Kolya, age=14, sex=true]]
// Student [groupName = EV-69 Human [name=Andrey, age=20, sex=false]]
// Student [groupName = EV-71 Human [name=Nick, age=21, sex=true]]
// Student [groupName = EK-71 Human [name=Roland, age=21, sex=false]]
// Student [groupName = EV-71 Human [name=Zack, age=21, sex=true]]
// Student [groupName = EV-72 Human [name=Andrez, age=22, sex=true]]
//

            // Sorted by group
// Student [groupName = EK-71 Human [name=Roland, age=21, sex=false]]
// Student [groupName = EM-13 Human [name=Kolya, age=14, sex=true]]
// Student [groupName = EV-69 Human [name=Andrey, age=20, sex=false]]
// Student [groupName = EV-71 Human [name=Nick, age=21, sex=true]]
// Student [groupName = EV-71 Human [name=Zack, age=21, sex=true]]
// Student [groupName = EV-72 Human [name=Andrez, age=22, sex=true]]
//

            // After interface VoenkomIsLookingForYou
// Student [groupName = EV-71 Human [name=Nick, age=21, sex=true]]
// Student [groupName = EV-71 Human [name=Zack, age=21, sex=true]]
// Student [groupName = EV-72 Human [name=Andrez, age=22, sex=true]]
