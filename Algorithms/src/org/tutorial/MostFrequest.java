package org.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequest {

	public static void main(String[] args) {

		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 1, 3, 2, 1));
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 3, 1, 3, 2, 1));
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(0));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, -1, 10, 10, -1, 10, -1, -1, -1, 1));

		System.out.println("Most Frequest no in "+list+" is :" + solutionA(list));

	}

	public static Integer solutionA(List<Integer> list) {

		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		Integer mostFrq = null;

		List<Entry<Integer, Integer>> sortedList;
        if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (!counter.containsKey(list.get(i))) {
					counter.put(list.get(i), 1);
				} else {
					int cnt = counter.get(list.get(i));
					cnt++;
					counter.put(list.get(i), cnt);
				}
			}
			
			Set<Entry<Integer, Integer>> set = counter.entrySet();
			sortedList = new ArrayList<Entry<Integer, Integer>>(set);
			Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>() {

				
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					
					return (o2.getValue()).compareTo(o1.getValue());
				}
			});
			
			mostFrq = sortedList.get(0).getKey();
		}
        
		return mostFrq;
	}
}
