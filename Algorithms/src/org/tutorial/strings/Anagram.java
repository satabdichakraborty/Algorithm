package org.tutorial.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

	public static void main(String[] args) {
		String a =
		//"showman";
		// "cde";
		"fcrxzwscanmligyxyvym";
		//"fcrxzwscanmligyxyvym";

		String b =
		//"woman";
		// "abc";
		"jxwtrhvujlmrpdoqbisbwhmgpmeoke";
		//"jxwtrhvujlmrrpdoq";
		int res = makeAnagram(a, b);
		System.out.println("Total diff = "+ res);
	}
	
	
	static int makeAnagram(String a, String b) {
		int res = 0;
		
		Map<Character, Integer> mapA = countChars(a);
		Map<Character, Integer> mapB = countChars(b);
		
		System.out.println(mapA);
		System.out.println(mapB);
		
		res = getDifference(mapA, mapB);
		return res;
	}


	private static int getDifference(Map<Character, Integer> mapA, Map<Character, Integer> mapB) {
		int res = 0;
		Set<Character> keysA = mapA.keySet();
		Set<Character> keysB = mapB.keySet();
		Set<Character> keys = new TreeSet<>();
		
		for (Character c : keysA) {
			keys.add(c);
		}
		for (Character c : keysB) {
			keys.add(c);
		}
		
		System.out.println("All keys = "+keys);
		
		for (Character ch : keys) {
			if(mapA.containsKey(ch) && mapB.containsKey(ch)){
				int a = mapA.get(ch);
				int b = mapB.get(ch);
				int n = a > b ? a-b : b-a;
				res = res + n;
			} 
			else if(mapB.containsKey(ch)){
				res = res + mapB.get(ch);
			} else if (mapA.containsKey(ch)){
				res = res + mapA.get(ch);
			}
		}
		return res;
	}


	private static Map countChars(String a) {
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < a.length(); i++) {
			if(!map.containsKey(a.charAt(i))){
				map.put(a.charAt(i), 1);
			} else {
				int cnt = map.get(a.charAt(i));
				map.put(a.charAt(i), ++cnt);
			}
		}
		
		return map;
	}

	

}
