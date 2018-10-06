package org.tutorial.onestringaway;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OA {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your
		// solution.
		boolean res = 
		//isOneAway("abcde", "abcd"); // should return true
		// isOneAway("abde", "abcde"); // should return true
		// isOneAway("a", "a"); // should return true
		// isOneAway("abcdef", "abqdef"); // should return true  /** edge case **/
		 isOneAway("abcdef", "abccef"); // should return true  /** edge case **/
		// isOneAway("abcdef", "abcde"); // should return true
		// isOneAway("aaa", "abc"); // should return false
		// isOneAway("abcde", "abc"); // should return false
		// isOneAway("abc", "abcde"); // should return false
		// isOneAway("abc", "bcc"); // should return false /** edge case **/
		System.out.println("Result : " + res);
	}

	// Implement your solution below.
	public static Boolean isOneAway(String s1, String s2) {
		int count = 0;
		boolean result = false;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		Set<Character> keys1 = new HashSet<>();
		Set<Character> keys2 = new HashSet<>();
		Set<Character> finalSet = new HashSet<>();
		int length1 = s1.length();
		int length2 = s2.length();
		int diff = -1;
		Character c = null;

		if ((length1 == length2) || (length1 == length2 + 1) || (length1 == length2 - 1)) {
			map1 = getCountMap(s1);
			map2 = getCountMap(s2);
			keys1 = map1.keySet();
			//keys1 = s1.
			keys2 = map2.keySet();

			finalSet.addAll(keys1);
			for (Iterator iterator = keys2.iterator(); iterator.hasNext();) {
				c = (Character) iterator.next();
				if (!finalSet.add(c)) {
					count++;
				}
			}
			System.out.println("length1 = " + length1+ " length2 = " + length2+ " : count = " + count);
			if (length1 > length2) {
				diff = length1 - count;
			} else if (length1 < length2) {
				diff = length2 - count;

			} else if (length1 == length1 && count > 2){
				diff = length2 - count;
			} 
			System.out.println("diff = " + diff);
			if (diff == 1 || diff == 0) {
				result = true;
			}
		}
		return result;
	}

	private static Map<Character, Integer> getCountMap(String s1) {
		Map<Character, Integer> map = new HashMap<>();
		int count;
		for (int i = 0; i < s1.length(); i++) {
			count = 0;
			if (!map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), ++count);
			} else {
				int n = map.get(s1.charAt(i));
				map.put(s1.charAt(i), n + 1);
			}
		}
		return map;
	}
}
