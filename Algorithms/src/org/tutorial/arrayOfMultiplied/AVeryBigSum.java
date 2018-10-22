package org.tutorial.arrayOfMultiplied;

public class AVeryBigSum {
	
	public static void main(String[] args) {
		int arCount = 5;
		long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		
		//5000000015
		long result = aVeryBigSum(ar);
		 

	}
	
	static long aVeryBigSum(long[] ar) {
		long result = 0;
		
		for (long l : ar) {
			result = result + l;
		}
		
		System.out.println(result);
		return result;
    }

}
