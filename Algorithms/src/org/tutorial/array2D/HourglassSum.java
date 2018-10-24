package org.tutorial.array2D;

public class HourglassSum {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		int result = hourglassSum(arr);
	}

	static int hourglassSum(int[][] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("[" + i + "][" + j + "]*	");
			}
			System.out.println();
		}

		System.out.println("\n\n\n");
		
		
		int hourglass = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i >= 0 && i < (i + 3) && j >= 0 && j < (i + 3) && i % 2 == 0 && hourglass < 7) {
					System.out.print("[" + i + "][" + j + "]*	");
					hourglass++;
				} else if (i == j) {
					System.out.print("[" + i + "][" + j + "]#	");
					hourglass++;
				} else {
					System.out.print("	");
				}

			}
			System.out.println();
			if(hourglass >= 7){
				break;
			}
		}

		return sum;
	}
}
