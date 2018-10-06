package org.tutorial.npcharacters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NR {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your
		// solution.
		//System.out.println(nonRepeating_B("abcab")); // should return 'c'
	    // System.out.println(nonRepeating_B("abab")); // should return null
		// System.out.println(nonRepeating_B("aabbbc")); // should return 'c'
		// System.out.println(nonRepeating_B("aabbdbc")); // should return 'd'

	}

	public static Character nonRepeating_B(String s) {
		int count = 0;
		int index = -1;
		Character nonRepeat = null;
		Map<Character, Integer> countChar = new HashMap<>();

		if (s != null & !s.trim().isEmpty()) {
			for (int i = 0; i < s.length(); i++) {
				count = 0;
				if (!countChar.containsKey(s.charAt(i))) {
					count++;
					countChar.put(s.charAt(i), count);
				} else {
					count = countChar.get(s.charAt(i));
					countChar.put(s.charAt(i), ++count);
				}
			}

			Set<Character> keys = countChar.keySet();
			for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
				Character character = (Character) iterator.next();
				index = countChar.get(character);
				if (index == 1) {
					nonRepeat = character;
				}
			}
		}

		System.out.println("countChar = " + countChar);
		return nonRepeat;
	}

	// Implement your solution below.
	public static Character nonRepeating_A(String s) {

		int index = -1;
		Character nonRepeat = null;

		if (s != null & !s.trim().isEmpty()) {
			for (int i = 0; i < s.length(); i++) {
				index = -1;
				for (int j = 0; j < s.length(); j++) {
					if (i != j) {
						if (s.charAt(i) == s.charAt(j)) {
							index++;
							break;
						}
					}
				}
				if (index == -1) {
					nonRepeat = s.charAt(i);
					break;
				}
			}

		}
		return nonRepeat;
	}
}
