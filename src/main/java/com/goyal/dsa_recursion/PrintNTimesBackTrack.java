package com.goyal.dsa_recursion;

import java.util.Scanner;

public class PrintNTimesBackTrack {
	
	public void print1ToN(int i, int n) {
		if(i<1) {
			return;
		}
		print1ToN(i-1, n);
		System.out.println(i);
	}
	
	public void printNTo1(int i, int n) {
		if(i>n) {
			return;
		}
		printNTo1(i+1, n);
		System.out.println(i);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			PrintNTimesBackTrack obj= new PrintNTimesBackTrack();
			
			System.out.println("Enter N:");
			int n=sc.nextInt();
			obj.print1ToN(n, n);
			obj.printNTo1(1, n);
		}

	}

}
