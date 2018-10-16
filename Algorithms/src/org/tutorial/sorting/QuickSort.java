package org.tutorial.sorting;

public class QuickSort {

	// Average O(nlogn)
	// Worstcase O(log(n2))

	public static void main(String[] args) {
		int[] unsortedList = { 6, 3, 2, 1, 9, 5, 7, 8, 15 };

		quicksort(unsortedList);

		System.out.println("Sorted Array : ");
		for (int i : unsortedList) {
			System.out.print(i + " ");
		}
	}

	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);

	}

	private static void quicksort(int[] array, int left, int right) {
		if (left >= right) {
			return;
		}

		int pivot = array[(left + right) / 2];
		int index = partition(array, left, right, pivot);
		quicksort(array, left, index - 1);
		quicksort(array, index, right);

	}

	private static int partition(int[] array, int left, int right, int pivot) {
		while (left <= right) {
			while (array[left] < pivot) {
				left++;
			}

			while (array[right] > pivot) {
				right--;
			}

			if (left <= right) {
				swap(array, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;

	}

}
