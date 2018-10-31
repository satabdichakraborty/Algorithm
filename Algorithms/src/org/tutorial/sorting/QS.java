package org.tutorial.sorting;

import java.util.Arrays;

public class QS {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 2, 1, 9, 5, 7, 8, 15 };
		quicksort(arr);
		
		Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
	}

	private static void quicksort(int[] unsortedList) {
		quicksort(unsortedList, 0, unsortedList.length);
	}

	private static void quicksort(int[] arr, int left, int right) {

		int pivot = (arr.length) / 2;
		int index = partition(arr, left, right, pivot);
		quicksort(arr, left, index-1);
		quicksort(arr, index, right);

	}

	private static int partition(int[] arr, int left, int right, int pivot) {
		while(left <= right){
			while(arr[left] < pivot){
				left++;
			}
			while(arr[right] > pivot){
				right--;
			}
			
			if(left <=right){
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr [right];
		arr[right] = temp;
		
	}
	
	

}
