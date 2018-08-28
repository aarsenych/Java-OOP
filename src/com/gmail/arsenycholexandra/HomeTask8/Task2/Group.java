package com.gmail.arsenycholexandra.HomeTask8.Task2;

import javax.swing.JOptionPane;
import com.google.gson.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Group implements VoenkomIsLookingForYou, Serializable {

	private ArrayList<Student> groupList = new ArrayList<Student>();
	private static final long serialVersionUID = 1L;

	public void addStudent(Student stud) throws TooManyStudentsException {
		if (groupList.size() <= 10) {
			groupList.add(stud);
		} else {
			throw new TooManyStudentsException("Too many students");
		}
	}

	public ArrayList<Student> getGroupList() {
		return groupList;
	}

	/**
	 * @param stud
	 */
	public void removeStudent(Student stud) {
		groupList.remove(stud);
	}

	public Student searchStudent(Student stud) {
		if (groupList.contains(stud)) {
			return stud;
		} else
			return null;
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


	
	public ArrayList<Student> getToTheArmyNow() {
		ArrayList<Student> army = new ArrayList<>();
		for (int i = 0; i < groupList.size(); i++) {
			if (groupList.get(i) != null) {
				if (groupList.get(i).getAge() >= 18 && groupList.get(i).getSex() == true) {
					army.add(groupList.get(i));
				}
			}
		}
		return army;
	}

	public void printgroup() {
		for (Student stud : getGroupList()) {
			if (stud != null) {
				System.out.println(stud);
			}
		}
	}

	public void readGroup(String filepath) {
		try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(filepath))) {
			OOS.writeObject(this.groupList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writeGroup(String filepath) {
		try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(filepath))) {

			try {
				this.groupList = (ArrayList<Student>) OIS.readObject();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Print group:");
		printgroup();
	}

	public static void saveToJSONFile(Group group, File file) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String gsonSt = gson.toJson(group);
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println(gsonSt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Group loadFromJSON(File file) {
		Gson gson = new Gson();
		Group group = null;
		try {
			group = gson.fromJson(new FileReader(file), Group.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return group;
	}

	public void sortByAge() {
		Comparator<Student> ageComparator = new Comparator<>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (int) (s1.getAge() - s2.getAge());
			}
		};
		Collections.sort(groupList, ageComparator);
	}

	public void sortByName() {
		Comparator<Student> nameComparator = new Comparator<>() {
			@Override
			public int compare(Student s1, Student s2) {
				return  (s1.getName().compareTo(s2.getName()));
			}
		};
		Collections.sort(groupList, nameComparator);
	}

}
