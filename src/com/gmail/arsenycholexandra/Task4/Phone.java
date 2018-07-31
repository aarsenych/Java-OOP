package com.gmail.arsenycholexandra.Task4;
import java.util.ArrayList;;

public class Phone {
	private String phoneNumber;
	private Network network;
	
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
	
	
	public void phoneRegistration(Network network) {
		this.network = network;
		network.addPhone(this);
	}

	
	public void call(Phone phone) {
		if (network.findPhoneNumber(phone)) {
			System.out.println("Ring - ring!");
		} else {
			System.out.println("Number doesn`t exist");
		}
		
	}

}
