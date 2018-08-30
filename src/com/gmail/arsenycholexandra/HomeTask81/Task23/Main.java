package com.gmail.arsenycholexandra.HomeTask81.Task23;

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
		Student s1 = new Student();
		Student s2 = new Student();

		try {
			st.stackPush(s1);
			st.stackPush(s2);

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
		System.out.println();
		st.printStack();
		Worker w = new Worker();
		Professor p = new Professor();
		Child c = new Child();
		try {
			BlackList.addClassToBlackList(w);
			BlackList.addClassToBlackList(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			st.stackPush(w);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
