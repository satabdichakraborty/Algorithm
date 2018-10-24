package org.tutorial.array;

public class PlusMinus {

	public static void main(String[] args) {

		int[] arr = { -4, 3, -9, 0, 4, 1 };

		plusMinus(arr);

	}

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double positive = 0;
		double negetive = 0;
		double zero = 0;
		double positiveF = 0;
		double negetiveF = 0;
		double zeroF = 0;
		
		for (int i : arr) {
			if(i < 0){
				negetive++;
			} else if(i > 0){
				positive++;
			} 
			else if(i == 0){
				zero++;
			} 
		}
		
		positiveF = positive/arr.length;
		negetiveF = negetive/arr.length;
		zeroF = zero/arr.length;
		
		//System.out.println("positive = "+positive+ " : negetive = "+negetive+ " : zero = "+zero+ " : arr.length ="+arr.length);
		System.out.printf("%.6f",positiveF);
		System.out.println("");
		System.out.printf("%.6f",negetiveF);
		System.out.println("");
		System.out.printf("%.6f",zeroF);

	}

}
