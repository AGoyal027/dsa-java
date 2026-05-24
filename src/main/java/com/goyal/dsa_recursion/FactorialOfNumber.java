package com.goyal.dsa_recursion;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public int factorial(int n) {
		if(n<=1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			FactorialOfNumber obj= new FactorialOfNumber();
			
			System.out.println("Enter N:");
			int n=sc.nextInt();

			int result = obj.factorial(n);
			System.out.println(result);
		}

	}

}
