package com.gmail.arsenycholexandra.HomeTask5.Task34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Savepoint;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

import com.gmail.arsenycholexandra.HomeTask4.NegativeValueException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Human h = new Human("Vasya", 25, true);
		h.showInfo();

		Student st = new Student("Andrez", 16, "EV-72", true);
		Student st2 = new Student("Andrey", 20, "EV-69", false);
		Student st3 = new Student("Nick", 19, "EV-71", true);
		Student st4 = new Student("Roland", 23, "EK-71", false);
		Student st5 = new Student("Zack", 21, "EV-71", true);
		System.out.println();
		st.showInfo();

		Group gr = new Group();
		Group gr1 = new Group();
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

		// try {
		// gr.addStudentInteractive();
		// } catch (NegativeValueException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

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

		System.out.println();
		System.out.println();
		System.out.println();

		GroupDAO c = new GroupController();

		String S = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5\\GroupFile.txt";

//		c.saveGroup(gr, S);
//		c.readGroup(gr1, S);

		for (Student student : gr1.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}

		Group.readGroup(gr, S);
		Group.writeGroup(gr1, S);
		

	}
}
