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
		Student st4 = new Student("Roland", 21, "EV-71");
		Student st5 = new Student("Zack", 21, "EV-71");
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

		System.out.println();

		gr.sort();
		
		for (Student student : gr.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}
	}
 
}
