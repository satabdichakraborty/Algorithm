package org.tutorial.arrayOfMultiplied;

import java.util.Arrays;

public class ArrayOfMultiplied {

	public static void main(String[] args) {
		int[] givenArray = { 1, 2, 3, 4, 5 };

		System.out.println("Result : " + Arrays.toString(resultElements1(givenArray)));

	}

	public static Integer[] resultElements1(int[] givenArray) {
		Integer[] resultList = new Integer[givenArray.length];
		
		int mul = 1;
		for (int i = 0; i < givenArray.length; i++) {
			mul = mul * givenArray[i];
		}
		//System.out.println(mul);
		
		for (int i = 0; i < resultList.length; i++) {
			resultList[i] = mul/givenArray[i];
		}
		return resultList;
	}
	
	public static Integer[] resultElements2(int[] givenArray) {
		Integer[] resultList = new Integer[givenArray.length];
		
		int mul = 1;
		for (int i = 0; i < givenArray.length; i++) {
			if(i==0) {
				mul = givenArray[i+1] * givenArray[i+2];
			}else if (i==1) 
			{	
				mul = givenArray[i-1] * givenArray[i+1];
	 	    }
		
		}
		return resultList;
	}
}
