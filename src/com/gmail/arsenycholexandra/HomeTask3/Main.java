package com.gmail.arsenycholexandra.HomeTask3;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Human h = new Human("Vasya", 25);
		h.showInfo();

		Student st = new Student("Andrez", 22, "EV-71");
		Student st2 = new Student("Andrey", 20, "EV-71");
		Student st3 = new Student("Nick", 21, "EV-71");
		System.out.println();
		st.showInfo();

		Group gr = new Group();
		try {
			gr.addStudent(st);
			gr.addStudent(st2);
			gr.addStudent(st3);
		} catch (TooManyStudentsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println();
		findStudent("Andrey", gr);
		findStudent("Andre", gr);
		findStudent("Andr", gr);

		System.out.println();

		Arrays.sort(gr.getGroupList(), new Comparator<Student>() {
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
		for (Student student : gr.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}
	}

	private static void findStudent(String name, Group gr) {
		int position = gr.searchStudent(name);

		if (position >= 0) {
			System.out.println(
					"Student " + gr.getByIndex(position).getName() + " is on " + position + " position of list");
		} else {
			System.out.println("There is no such student in list");
		}
	}
}
