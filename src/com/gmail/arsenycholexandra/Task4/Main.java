package com.gmail.arsenycholexandra.Task4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph1 = new Phone("335-23-23");
		Phone ph2 = new Phone("335-23-29");
		Phone ph3 = new Phone("335-23-232");
		Phone ph4 = new Phone("335-23-633");
		
		Network net = new Network("Kyivstar");
		
		ph1.phoneRegistration(net);
		ph2.phoneRegistration(net);
		ph3.phoneRegistration(net);
		
		ph1.call(ph2);
		ph1.call(ph4);
		
		
	}

}
