package org.tutorial.mostFrequest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFreqItemInArray {
	
	public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        
        int [] arrayToPass = array3;
        
       
        System.out.println("Most Frequest Item in "+Arrays.toString(arrayToPass)+" is " + most_frequest(arrayToPass));
        
    }
	
	private static int most_frequest(int[] items) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Integer maxItem = null;
		Integer maxCount = -1;
		
		//if (null != items) {
			for (int i : items) {
				int val = 0;
				if (count.containsKey(i)) {
					val = count.get(i) + 1;
					count.put(i, val);

				} else {
					count.put(i, 1);
				}

				if (val > maxCount) {
					maxCount = val;
					maxItem = i;
				}

			//} 
		}
		System.out.println(maxItem);
		
		return maxItem==null?0:maxItem;
	}

}
