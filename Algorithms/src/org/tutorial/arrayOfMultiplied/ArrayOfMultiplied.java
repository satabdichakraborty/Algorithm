package org.tutorial.arrayOfMultiplied;

import java.util.Arrays;

public class ArrayOfMultiplied {

	public static void main(String[] args) {
		int[] givenArray = { 1, 2, 3, 4, 5 };

		System.out.println("Result : " + Arrays.toString(resultElements(givenArray)));

	}

	public static Integer[] resultElements(int[] givenArray) {
		Integer[] resultList = new Integer[givenArray.length];
		
		int mul = 1;
		for (int i = 0; i < givenArray.length; i++) {
			mul = mul * givenArray[i];
		}
		System.out.println(mul);
		
		for (int i = 0; i < resultList.length; i++) {
			resultList[i] = mul/givenArray[i];
		}
		return resultList;
	}
}
