package com.gmail.arsenycholexandra.HomeTask81.Task1;

public interface CheckNULL {
	public int NOT_NULL = 7;
	
	public static int checkNULL(Object a, Object b) {
		if(a == null && b != null) {
			return -1;
		}
		if(a != null && b == null) {
			return 1;
		}
		if(a == null && b == null) {
			return 0;
		}
		return NOT_NULL;
	}
}
