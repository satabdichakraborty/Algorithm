package org.tutorial.array2D;

public class DiagonalDifference {

	public static void main(String[] args) {
		int n = 3;

		int[][] arr = { { 1, 2, 3 }, 
				        { 4, 5, 6 }, 
				        { 9, 8, 9 } };

		int result = diagonalDifference(arr);
		

	}

	private static int diagonalDifference(int[][] arr) {
		int diff = 0;
		int ascDiagonal = 0;
		int descDiagonal = 0;
		int m = arr.length-1;
		int n = 0;
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					ascDiagonal = ascDiagonal + arr[i][j];
				}
				if( (i == n & j == m)){
					descDiagonal = descDiagonal + arr[i][j];
					m--; n++;
				}
			}

		}		
		
		diff = Math.abs(ascDiagonal - descDiagonal);
		System.out.println("ascDiagonal = " + ascDiagonal + " : descDiagonal = "+descDiagonal+ " : diff = "+diff);
		
		return diff;
	}

}
