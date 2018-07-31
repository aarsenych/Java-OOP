package com.gmail.arsenycholexandra.Task4;
import java.util.ArrayList;;

public class Phone {
	private String phoneNumber;
	
	public Phone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void call(Phone phoneNumber) {
		for (int i = 0; i < network.size(); i++) {
			if (getPhoneNumber() == network.get(i)) {
				System.out.println("Ring - ring!");
			} else {
				System.out.println("Your number doesn`t exist =(");
			}
		}
	}

}
