package com.gmail.arsenycholexandra.Task4;

import java.util.ArrayList;

public class Network {
	private String networkName;
	private ArrayList<String> phones = new ArrayList<String>();

	public Network(String networkName) {
		super();
		this.networkName = networkName;
	}

	/**
	 * @return the networkName
	 */
	public String getNetworkName() {
		return networkName;
	}

	/**
	 * @param networkName the networkName to set
	 */
	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}
	
	
	public void addPhone(Phone phone) {
		phones.add(phone.getPhoneNumber());
	}
	
	public boolean findPhoneNumber(Phone phone) {
		return phones.contains(phone.getPhoneNumber());
	}
}
