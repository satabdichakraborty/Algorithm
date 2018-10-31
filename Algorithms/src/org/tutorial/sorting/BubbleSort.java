package org.tutorial.sorting;

import java.util.Arrays;

// No extra memory to run it O(1) space
// Maximum passes O(n)square time
public class BubbleSort {

	public static void main(String[] args) {
		Integer[] arr = { 10, 3, 5, 12, 9, 20 };
		bubbleSort(arr);
	}

	private static void bubbleSort(Integer[] arr) {
		Integer[] swappedArr = new Integer[arr.length];
		int compLength = arr.length -1;

		System.out.println("Before Sorting");
		Arrays.asList(arr).stream().forEach(i -> System.out.print(i + "	"));

		
		while (compLength > 0) {		
			for (int i = 0; i < compLength; i++) {
				if (arr[i] > arr[i + 1]) {
					swappedArr = swapElements(arr, i, i + 1);
					//System.out.println("After every loop");
					//Arrays.asList(swappedArr).stream().forEach(k -> System.out.print(k + "	"));
				}
			} 
			compLength--;
		}
		System.out.println("After Sorting");
		Arrays.asList(swappedArr).stream().forEach(k -> System.out.print(k + "	"));
	}

	private static Integer[] swapElements(Integer[] arr, int i, int j) {
		System.out.println("");
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
