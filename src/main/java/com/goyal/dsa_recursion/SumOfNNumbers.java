package com.goyal.dsa_recursion;

import java.util.Scanner;

public class SumOfNNumbers {
	
	public int sum(int i, int n) {
		if(i>n) {
			return 0;
		}
		return i+sum(i+1, n);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			SumOfNNumbers obj= new SumOfNNumbers();
			
			System.out.println("Enter N:");
			int n=sc.nextInt();
			
			int result = obj.sum(1, n);
			System.out.println(result);
		}

	}

}
