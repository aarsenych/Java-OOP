package com.gmail.arsenycholexandra.HomeTask5.Task34;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GroupController implements GroupDAO {

	@Override
	public void saveGroup(Group group, String filepath) {

		File file = new File(filepath);
		if (!file.isFile()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try (PrintWriter csvWriter = new PrintWriter(file)) {
			for (Student student : group.getGroupList()) {
				if (student != null) {
					String info = student.getName() + " " + student.getAge() + " " + student.getGroupName() + " "
							+ student.getSex();
					csvWriter.println(info);

				}
			}
			csvWriter.flush();
			csvWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Group readGroup(Group group, String filepath) {
		try (BufferedReader in = new BufferedReader(new FileReader(filepath))) {
			String st = "";
			for (; (st = in.readLine()) != null;) {
				String[] studentList = st.split(" ");
				String name = studentList[0];
				int age = Integer.parseInt(studentList[1]);
				String groupName = studentList[2];
				boolean sex = studentList[2].equals(true);
				Student s = new Student(name, age, groupName, sex);
				try {
					group.addStudent(s);
				} catch (TooManyStudentsException e) {
					System.out.println("Too many students");
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return group;
	}

}
