package com.gmail.arsenycholexandra.Task1;

public class Main {

	public static void main(String[] args) {
		
		Cat catOne = new Cat("Lucy", 3, 5, "black", true);
		Cat catTwo = new Cat("Johnny", 6, 8, "white and red", false);
		Cat catThree = new Cat("Lokie", 2, 4, "grey", false);
		
		catOne.getVoice();
		catTwo.askFood(5);
		catThree.askFood(2);
		

	}

}
