package com.gmail.arsenycholexandra.HomeTask6.Task2;

import java.util.Random;

 public class Main {
	
	public static void main(String[] args) throws Throwable {
			int LENGTH = 500000;
			int[] a = RandomArray.createRandomArray(LENGTH);	
			long startTime1 = System.currentTimeMillis();
			
			System.out.println(Summation.sum(a)); //Sum is 24759018
			long endTime1 = System.currentTimeMillis();	
			System.out.println("Single: " + (-startTime1 + endTime1));
			long startTime2 = System.currentTimeMillis(); //Time is 7 ms
			
			System.out.println(Summation.parallelSum(a, 20));
			long endTime2 = System.currentTimeMillis();	
			System.out.println("Multithread: " + (-startTime1 + endTime1));
		}
	
 }
