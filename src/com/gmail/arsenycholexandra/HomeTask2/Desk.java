package com.gmail.arsenycholexandra.HomeTask2;

import java.util.Arrays;

public class Desk {
	private int[] deskPart = new int[] {1, 2, 3, 4};
	
	public Desk(int[] deskPart) {
		super();
		this.deskPart = deskPart;
	}

	/**
	 * @return the deskPart
	 */
	public int[] getDeskPart() {
		return deskPart;
	}

	/**
	 * @param deskPart the deskPart to set
	 */
	public void setDeskPart(int[] deskPart) {
		this.deskPart = deskPart;
	}
	
	public void putShape(int deskPart, Shape shape ) {
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Desk [deskPart=" + Arrays.toString(deskPart) + "]";
	}
	
	
}
