package com.goyal.dsa_recursion;

import java.util.Scanner;

public class PrintNTimes {
	
	public void print1ToN(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		print1ToN(i+1,n);
	}
	
	public void printNTo1(int i, int n) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		printNTo1(i-1, n);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			PrintNTimes obj= new PrintNTimes();
			
			System.out.println("Enter N:");
			int n=sc.nextInt();
			obj.print1ToN(1, n);
			obj.printNTo1(n, n);
		}

	}

}
