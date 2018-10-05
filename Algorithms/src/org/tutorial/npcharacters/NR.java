package org.tutorial.npcharacters;

public class NR {
	public static void main(String[] args) {
		// NOTE: The following input values will be used for testing your
		// solution.
		// System.out.println(nonRepeating("abcab")); // should return 'c'
		//System.out.println(nonRepeating("abab")); // should return null
		//System.out.println(nonRepeating("aabbbc")); // should return 'c'
		System.out.println(nonRepeating("aabbdbc")); // should return 'd'

	}

	// Implement your solution below.
	public static Character nonRepeating(String s) {

		int index = -1;
		Character nonRepeat = null;

		if (s != null & !s.trim().isEmpty()) {
			for (int i = 0; i < s.length(); i++) {
				index = -1;
				for (int j = 0; j < s.length(); j++) {
					if (i != j) {
						char a = s.charAt(i);
						char b = s.charAt(j);
						if (a == b) {
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
