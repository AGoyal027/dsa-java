package com.goyal.dsa_string;

import java.util.Scanner;

public class RemoveOutermostParentheses {
	
	public static String removeOuterParentheses(String s) {
		StringBuilder result = new StringBuilder();
		int level = 0;
		
		for(char ch : s.toCharArray()) {
			if(ch=='(') {
				if(level>0) result.append(ch);
				level++;
			}
			else if(ch==')') {
				level--;
				if(level>0) result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Input");
			String inp = sc.nextLine();
			String ans = removeOuterParentheses(inp);
			System.out.println(ans);
		}
	}

}
