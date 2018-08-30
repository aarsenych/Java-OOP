package com.gmail.arsenycholexandra.HomeTask81.Task1;

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
		Stack st = new Stack();
		Student s1 = new Student("Lois", 22, "ECX", true);
		Student s2 = new Student("Sancho", 22, "ECX", true);
		Student s3 = new Student("Fidel", 22, "ECX", true);
		Student s4 = new Student("John", 22, "ECX", true);
		try {
			st.stackPush(s1);
			st.stackPush(s2);
			st.stackPush(s3);
			st.stackPush(s4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Print Stack");
		st.printStack();
		System.out.println("Pop Stack");
		try {
			st.stackPop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Print stack");
		st.printStack();
		System.out.println();
		try {
			st.stackPeek();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
