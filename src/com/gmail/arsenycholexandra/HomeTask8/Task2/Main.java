package com.gmail.arsenycholexandra.HomeTask8.Task2;

import java.io.File;
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

		Student st = new Student("Andrez", 25, "EV-72", true);
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

		
		gr.removeStudent(st2);

		 try {
		 gr.addStudentInteractive();
		 } catch (NegativeValueException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }

		System.out.println();
		System.out.println("Sorted by age");
		gr.sortByAge();
	    gr.printgroup();
	    gr.sortByName();
	    System.out.println("Sorted by name");
	    gr.printgroup();
		

		
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

		// c.saveGroup(gr, S);
		// c.readGroup(gr1, S);

		for (Student student : gr1.getGroupList()) {
			if (student != null) {
				System.out.println(student);
			}
		}

		gr.readGroup(S);
		gr1.writeGroup(S);
		gr1.printgroup();

		String GSONIn = "C:\\Users\\Lesya\\Desktop\\JAVA projects\\com.gmail.arsenycholexandra.homework\\src\\com\\gmail\\arsenycholexandra\\HomeTask5\\GroupGson.txt";

		File file = new File(GSONIn);
		Group.saveToJSONFile(gr, file);
		Group groupTwo = Group.loadFromJSON(file);
		System.out.println();
		System.out.println();
		groupTwo.printgroup();
		//System.out.println(gr.getClass().getSimpleName().equals("Group"));

	}
}
