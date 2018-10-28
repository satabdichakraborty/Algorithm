package org.tutorial.array;

import java.util.HashMap;
import java.util.Map;

public class MinimumBribes {

	public static void main(String[] args) {

		// 3
		//int[] q = { 2, 1, 5, 3, 4 };
		// Too chaotic if bribe > 2
		// int q[] = {2, 5, 1, 3, 4};
		// 7
		int q[] = {1, 2, 5, 3, 7, 8, 6, 4};
		minimumBribes(q);

	}

	static void minimumBribes(int[] q) {
		int bribe = 0;
		Map<Integer, Integer> initialPos = new HashMap<>();
		Map<Integer, Integer> qPos = new HashMap<>();

		for (int i = 0; i < q.length; i++) {
			initialPos.put(i + 1, i);
		}
		
		System.out.println(initialPos);
		
		for (int i = 0; i < q.length; i++) {
			qPos.put(q[i], i);
		}
		
		System.out.println(qPos);
		
		for (int i : initialPos.keySet()) {
			int posA = initialPos.get(i);
			int posB = qPos.get(i);
			int diff = posB-posA;
			System.out.println(i+" moved from ["+posA + "] : ["+posB+"] : diff = "+diff);
			if(diff > 0){
				bribe = bribe + diff;
			}
		}
		System.out.println(bribe > 3 ? "Too chaotic" : bribe);
		
	}

}
