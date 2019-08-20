package com.amdocs;

import java.util.Scanner;

public class Main {
	
	static int choice;
	
	public static void displayMenu() {
		
		System.out.println("Enter Choice: ");
		System.out.println("1.BubbleSort");
		System.out.println("2.QuickSort");
		System.out.println("3.Exit");
		
	}
	
	public static int getChoice() {
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		//sc.close();
		return choice;
	}
	
	public static void doWork(int choice) {
		IAlgorithm algorithm = AlgorithmFactory.getAlgorithm(choice);
		algorithm.sort();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		while(choice!=3) {
			displayMenu();
			choice = getChoice();
			if (choice!=3)
				doWork(choice);
				
			
		
		}
		System.out.println("App Exited Successfully");
	}

}
