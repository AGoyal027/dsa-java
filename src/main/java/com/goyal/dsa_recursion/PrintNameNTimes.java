package com.goyal.dsa_recursion;

import java.util.Scanner;

public class PrintNameNTimes {
	
	public void printName(String name, int count, int n) {
		if(count>=n) {
			return;
		}
		System.out.println(name);
		printName(name, count+1, n);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			PrintNameNTimes obj= new PrintNameNTimes();
			
			System.out.println("Enter Count:");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name:");
			String name = sc.nextLine();
			obj.printName(name,0, n);
		}

	}

}
