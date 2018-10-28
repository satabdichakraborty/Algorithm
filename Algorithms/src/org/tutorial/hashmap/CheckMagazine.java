package org.tutorial.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CheckMagazine {

	public static void main(String[] args) {
		// Yes
		 String[] magazine = {"give", "me", "one", "grand", "today", "night"
		 };
		 String[] note = { "give", "one", "grand", "today" };

		// No
		// String[] magazine = {"two", "times", "three", "is", "not", "four"};
		// String[] note = { "two", "times", "two", "is", "four"};

		// No
		//String[] magazine = { "ive", "got", "a", "lovely", "bunch", "of", "coconuts" };
		//String[] note = { "ive", "got", "some", "coconuts" };

		checkMagazine(magazine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {
		boolean check = false;
		Map<String, Integer> magazineMap = new HashMap<>();
		Map<String, Integer> noteMap = new HashMap<>();

		if (magazine.length >= note.length) {

			magazineMap = populateMap(magazine, magazineMap);
			noteMap = populateMap(note, noteMap);

			for (String key : noteMap.keySet()) {
				check = false;
				if (magazineMap.containsKey(key) && magazineMap.get(key) >= noteMap.get(key)) {
					check = true;
				} else {
					break;
				}
			}
		}
		System.out.println(check == true ? "Yes" : "No");

	}

	private static Map<String, Integer> populateMap(String[] magazine, Map<String, Integer> magazineMap) {
		for (String m : magazine) {
			if (!magazineMap.containsKey(m)) {
				magazineMap.put(m, 1);
			} else {
				int index = magazineMap.get(m);
				magazineMap.put(m, ++index);
			}
		}
		return magazineMap;
	}
}
