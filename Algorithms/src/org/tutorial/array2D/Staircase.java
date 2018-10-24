package org.tutorial.array2D;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;

		staircase(n);
	}

	static void staircase(int n) {

		for (int i = 0; i <= n-1; i++) {
			for (int j = n-1; j >= 0; j--) {
				if (i == j) {
					System.out.print("#");
				} else if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
	}

}
