package org.tutorial.magicsquare;

public class MagicSquare {

	public static void main(String[] args) {
		int[][] s = new int[3][3];

		int[] items = { 4, 9, 2, 3, 5, 7, 8, 1, 5 };

		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				s[i][j] = items[k++];
			}
		}
		
		int[][] s1 = {
					   {4, 8, 2},
					   {4, 5, 7},
					   {6, 1, 6}
					 };

		int result = formingMagicSquare(s);
		
		int[][] s2 = {
				{4, 9, 2},
				{3, 5, 7},
				{8, 1, 6}
			 };
		
		//printMagicSquare(s2);

	}

	static int formingMagicSquare(int[][] s) {
		printMagicSquare(s);
		int cost = 0;
		int rowSum = 0;
		int colSum = 0;
		int diagonalSum = 0;
		int[] columnSum = new int[3];
		int[] allRowSum = new int[3];
		
		//System.out.println("After Sqaure::");
		for (int i = 0; i < 3; i++) {
			rowSum = 0;
			colSum = 0;
			
			for (int j = 0; j < 3; j++) {
				rowSum = rowSum + s[i][j];
				colSum = colSum + s[j][i];
				columnSum[i] = colSum;
				allRowSum[i] = rowSum;
				if (i == j) {
					diagonalSum = diagonalSum + s[i][j];
				}
			}
			//System.out.print("R = " + rowSum+ ": C = "+colSum+ " : D = "+diagonalSum);
			System.out.println("");
		}
		System.out.println("After changing :");
		for(int k=0; k<3; k++) {
			if(allRowSum[k] != 15) {
				System.out.println("Row "+k+" is not 15 "+columnSum[k]+ " : "+diagonalSum	);
			
				
			}
		}
		printMagicSquare(s);
		//System.out.print("R = " + rowSum+ ": C = "+colSum+ " : D = "+diagonalSum);
		return cost;
	}

	static void printMagicSquare(int[][] s) {

		int rowSum = 0;
		int colSum = 0;
		int[] columnSum = new int[3];
		int[] allRowSum = new int[3];
		int diagonalSum = 0;

		for (int i = 0; i < 3; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j < 3; j++) {
				// System.out.print(" [" + i + "][" + j + "] " + s[i][j] + " ");
				System.out.print(s[i][j] + "	");
				rowSum = rowSum + s[i][j];
				colSum = colSum + s[j][i];

				columnSum[i] = colSum;
				allRowSum[i] = rowSum;
				if (i == j) {
					diagonalSum = diagonalSum + s[i][j];

				}

			}
			System.out.print("=" + rowSum);
			System.out.println("");

		}

		for (int i : columnSum) {
			System.out.print("C:" + i + "	");
		}
		System.out.println("D:" + diagonalSum);
		System.out.println("");
	}

}
