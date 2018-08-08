package com.gmail.arsenycholexandra.HomeTask2;

import java.util.Arrays;

public class Desk {
	private Shape[] deskPart = new Shape[4];
	
	public Desk(Shape[] deskPart) {
		super();
		this.deskPart = deskPart;
	}

	public Desk() {
		super();
	}

	/**
	 * @return the deskPart
	 */
	public Shape[] getDeskPart() {
		return deskPart;
	}

	/**
	 * @param deskPart the deskPart to set
	 */
	public void setDeskPart(Shape[] deskPart) {
		this.deskPart = deskPart;
	}

	public void addShape(int part, Shape shape)  {
		if ( part > 0 && part < 5 ) {
			 if (deskPart[part] == null) {
				 deskPart[part] = shape;
				 System.out.println("The shape is added");
			 } else {
				 System.out.println("This position is not available");
			   } 
		} else {
			System.out.println("You enetered wrong part");
		  }
	}
	
	public void removeShape(int part) {
			if (deskPart[part] == null) {
				System.out.println("There is no shape on this part");
			}
			if (deskPart[part] != null) {
				deskPart[part] = null;
				System.out.println("The shape deleted");
			} else {
				System.out.println("You entered wrong number");
			}
		} 
	
	public double allShapesArea() {
		double s = 0;
		for(Shape shape : deskPart) {
			if (shape!= null) {
				s += shape.getArea();
			} 
		} return s;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Desk [deskPart=" + Arrays.toString(deskPart) + "]";
	}
	
	
}
