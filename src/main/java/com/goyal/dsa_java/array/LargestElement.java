package com.goyal.dsa_java.array;

public class LargestElement {

	static int arr[] = { 3, 2, 4, 9, 7, 5 };

	public static void main(String[] args) {

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println(largest);

	}

}
