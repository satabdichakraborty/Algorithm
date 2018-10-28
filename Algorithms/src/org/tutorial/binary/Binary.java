package org.tutorial.binary;

import java.util.HashMap;
import java.util.Map;

public class Binary {

	public static void main(String[] args) {
		//5
		int n2 = 1311;
		//1
		//int n2 = 5;
		//3
		//int n2 = 55;
		//0
		//int n2 = 0;
		//15
		//int n2 = 524275;
		int count = 1;		
		int cursor = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<>();

		String s = Integer.toBinaryString(n2);

		System.out.println(s);

		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '1') {
				if (!map.containsKey(s.charAt(j))) {
					map.put('1', j);
				} else {
					cursor = map.get('1');
					if(s.charAt(cursor) == s.charAt(j-1)){
						count++;
					}
					else{
						if(count > 3){
							max = count;
						}
						count = 1;
					}
					map.put('1', j);
				}
			}
		}
		if(map.size() == 0){
			count = 0;
		}
		System.out.println(max > count ? max : count);

	}

}
