package org.tutorial.array2D;

public class HourglassSum {

	public static void main(String[] args) {
		//19
		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, 
				        { 0, 1, 0, 0, 0, 0 }, 
				        { 1, 1, 1, 0, 0, 0 }, 
				        { 0, 0, 2, 4, 4, 0 },
				        { 0, 0, 0, 2, 0, 0 }, 
				        { 0, 0, 1, 2, 4, 0 } 
				      };
		//28
		int[][] arr1 = { 
				{ -9, -9, -9,  1, 1, 1 }, 
		        {  0, -9,  0,  4, 3, 2 }, 
		        { -9, -9, -9,  1, 2, 3 }, 
		        {  0,  0,  8,  6, 6, 0 },
		        {  0,  0,  0, -2, 0, 0}, 
		        {  0,  0,  1,  2, 4, 0 } 
		      };
		//-6
		int[][] arr2 = { 
			{-1, -1, 0, -9, -2, -2},
			{-2, -1, -6, -8, -2, -5},
			{-1, -1, -1, -2, -3, -4},
			{-1, -9, -2, -4, -4, -5},
			{-7, -3, -3, -2, -9, -9},
			{-1, -3, -1, -2, -4, -5}
		};

		int result = hourglassSum(arr2);
		System.out.println(result);
	}

	static int hourglassSum(int[][] arr) {
		int sum = 0;
		int max  = 0;
		int max_sum = Integer.MIN_VALUE; 

		/*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print("[" + i + "][" + j + "]	");
			}
			System.out.println();
		}

		System.out.println("\n\n\n");
		*/
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i-1>=0 && i+1 < arr.length && j-1>=0 && j+1 < arr.length){
					int f1 = arr[i-1][j-1];
					int f2 = arr[i-1][j];
					int f3 = arr[i-1][j+1];
					int f4 = arr[i][j];
					int f5 = arr[i+1][j-1];
					int f6 = arr[i+1][j];
					int f7 = arr[i+1][j+1];
					
					sum  = sum + f1 + f2 + f3 + f4 + f5 + f6 + f7;
					//System.out.print(f1 + " "+ f2 + " "+f3);
					//System.out.println();
					//System.out.print(" "+ f4 + " ");
					//System.out.println();
					//System.out.print(f5 + " "+ f6 + " "+f7);
					//System.out.println(" sum ="+sum);
					//System.out.println("------------");
					max_sum = Math.max(max_sum, sum);
				}
				sum = 0;
				
			}
			System.out.println();			
		}		

		return max_sum;
	}
}
