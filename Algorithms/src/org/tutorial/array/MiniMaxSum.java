package org.tutorial.array;

import java.util.Arrays;

public class MiniMaxSum {

	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5 }; [10 14]
		// int[] arr = {7, 69, 2, 221, 8974};
		int[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625 };

		miniMaxSum(arr);

	}

	private static void miniMaxSum(int[] arr) {

		long sum = 0;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		System.out.println((sum - arr[arr.length - 1]) + " " + (sum - arr[0]));

	}
}
