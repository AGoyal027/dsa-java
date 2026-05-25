package com.goyal.dsa_recursion;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean palindrome(int i, String s) {
		if(i>=s.length()/2) {
			return true;
		}
		if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
			return false;
		}
		return palindrome(i+1, s);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String:");
			String s = sc.nextLine();
			boolean result = palindrome(0, s);
			System.out.println(result);
		}

	}

}
