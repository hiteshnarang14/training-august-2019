package com.amdocs;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(100);
		numbers.add(50);
		numbers.add(10);
		numbers.add(500);
		numbers.add(150);
		
		System.out.println(numbers.size());
		System.out.println("Before Sorting");
		for (int element:numbers) {
			System.out.println(element);
		}
		
		Collections.sort(numbers);
		System.out.println("After sorting");
		for (int element:numbers) {
			System.out.println(element);
		}

	}

}
