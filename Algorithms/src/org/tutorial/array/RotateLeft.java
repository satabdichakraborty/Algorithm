package org.tutorial.array;

public class RotateLeft {

	public static void main(String[] args) {

		int d = 4;
		int[] a = { 1, 2, 3, 4, 5 };
		int[] result = rotLeft(a, d);

	}

	static int[] rotLeft(int[] a, int d) {
		int[] result = new int[a.length];
		
		int rotate = d;
		for (int i = 0; i < a.length; i++) {
			int pos = (i+rotate) % a.length;
			result[i] = a[pos];
			
		}
				
		return result;

	}

}
