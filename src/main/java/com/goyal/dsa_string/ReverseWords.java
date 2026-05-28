package com.goyal.dsa_string;

import java.util.Scanner;

public class ReverseWords {
	
	public static String reverseString(String s) {
		StringBuilder result = new StringBuilder();
		int i = s.length()-1;
		
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;
			}
			
			int end = i;
			
			while(i>=0 && s.charAt(i)!=' ') {
				i--;
			}
			
			String word = s.substring(i+1, end+1);
			
			if(result.length()>0) {
				result.append(" ");
			}
			
			result.append(word);
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Input");
			String inp = sc.nextLine();
			String ans = reverseString(inp);
			System.out.println(ans);
		}
	}

}
