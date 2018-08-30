package com.gmail.arsenycholexandra.HomeTask81.Task23;

public class BlackList {
	private static  int capacity = 5;
	private static String[] black = new String[capacity];
	
	public BlackList(int capacity) {
		super();
		this.capacity = capacity;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}


	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * @return the black
	 */
	public static String[] getBlack() {
		return black;
	}

	/**
	 * @param black the black to set
	 */
	public void setBlack(String[] black) {
		this.black = black;
	}

	public static void addClassToBlackList(Object obj) throws Exception {
		boolean objAdded = false;
		for (int i = black.length - 1; i > 0; i--) {
			if (black[i] == null) {
				black[i] = obj.getClass().getSimpleName();
				objAdded = true;
				break;
			}
		}
		if (objAdded == false)
			throw new Exception("Black List if full");
	}
	
	public static void printBlackList() {
		for (String str : getBlack()) {
			if (str != null) {
				System.out.println(str);
			}
		}
	}
}
