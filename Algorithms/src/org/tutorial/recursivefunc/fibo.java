package org.tutorial.recursivefunc;

import java.util.HashMap;
import java.util.Map;

public class fibo {

	static Map<Integer, Integer> fiboMap = new HashMap<>();

	public static void main(String[] args) {

		fiboMap.put(1, 1);
		fiboMap.put(2, 1);

		int n = 500;

		for (int i = 3; i <= n; i++) {
			int value = getFiboNo(i);

			if (value >= 500) {
				break;
			}

		}

		System.out.println(fiboMap.values());

	}

	private static int getFiboNo(int n) {
		return fiboMap.get(n - 1) + fiboMap.get(n - 2);
	}

}
