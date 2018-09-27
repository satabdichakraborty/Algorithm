package org.tutorial.sumOfNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int[] givenArray = { 10, 15, 3, 7 };
		int resultSum = 17;
		
		System.out.println("Result : "+Arrays.toString(resultElements(givenArray, resultSum)));

	}

	public static Integer[] resultElements(int[] givenArray, int resultSum) {
		List<Integer> resultList = new ArrayList<>();
		
		for (int i = 0; i < givenArray.length; i++) {
			for (int j = i+1; j < givenArray.length; j++) {
				int sum = givenArray[i]+givenArray[j];
			   if(sum == resultSum) {
				   resultList.add(givenArray[i]);
				   resultList.add(givenArray[j]);
			   }
			}
		}
		return resultList.toArray(new Integer[resultList.size()]);
	}
}
