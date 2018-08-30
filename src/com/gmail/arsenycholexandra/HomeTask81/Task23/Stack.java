package com.gmail.arsenycholexandra.HomeTask81.Task23;

import java.lang.reflect.Array;

import com.gmail.arsenycholexandra.HomeTask3.TooManyStudentsException;
import com.gmail.arsenycholexandra.HomeTask8.Task2.Student;

public class Stack {

	private static Object[] list = new Object[10];

	/**
	 * @return the list
	 */
	public Object[] getList() {
		return list;
	}

	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(Object[] list) {
		this.list = list;
	}

	public void stackPush(Object obj) throws Exception {
		boolean objAdded = false;
		if (dependsToBlackList(obj) == false) {
		for (int i = list.length - 1; i > 0; i--) {
			if (list[i] == null) {
				list[i] = obj;
				objAdded = true;
				break;
			}
		}
		if (objAdded == false)
			throw new Exception("Too many objects");
		}
		if (dependsToBlackList(obj) == true) {
			System.out.println("Class of your object is in the black list. You can`t add it");
		}
	}

	public void stackDelete() throws Exception {
		boolean objPopped = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				list[i] = null;
				objPopped = true;
				break;
			}
		}
		if (objPopped == false)
			throw new Exception("List is empty");

	}

	public Object stackReturnFirst() {
		int i = 0;
		for (i = 0; i < list.length; i++) {
			if (list[i] != null) {
				return list[i];
			}
		}
		return list[i];
	}

	public void stackPop() {
		stackReturnFirst();
		try {
			stackDelete();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stackPeek() throws Exception {
		boolean objPeeked = false;
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println(list[i]);
				objPeeked = true;
				break;
			}
		}
		if (objPeeked == false)
			throw new Exception("List is empty");
	}

	public void printStack() {
		for (Object obj : getList()) {
			if (obj != null) {
				System.out.println(obj);
			}
		}
	}
	
	public boolean dependsToBlackList(Object object) {
		BlackList.getBlack();
		for(int i = 0; i < BlackList.getBlack().length; i++) {
			if(BlackList.getBlack()[i]!= null && BlackList.getBlack()[i].contains(object.getClass().getSimpleName())) {
				return true;
			} 
		}
		return false;
	}

}
