package com.amdocs;
import java.util.Scanner;

public class Addition {
	
	public int add(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int firstInput = sc.nextInt();
		int secondIput = sc.nextInt();
		
		sc.close();
		
		Addition addition = new Addition();
		int result = addition.add(firstInput,secondIput);
		
		System.out.println(result);
	}

}
