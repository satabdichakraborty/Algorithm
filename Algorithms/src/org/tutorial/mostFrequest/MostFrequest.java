package org.tutorial.mostFrequest;

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
		
        /*Test Data*/
		
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 1, 3, 2, 1));
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 3, 1, 3, 2, 1));
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(0));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, -1, 10, 10, -1, 10, -1, -1, -1, 1));

		//System.out.println("Most Frequest no in "+list+" is :" + solutionA(list));
		System.out.println("Most Frequest no in "+list+" is :" + solutionB(list));

	}
	
	public static Integer solutionB(List<Integer> list) {
		

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		Integer max_count = -1;
		Integer max_item = null;

        if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (!count.containsKey(list.get(i))) {
					count.put(list.get(i), 1);
				} else {
					int cnt = count.get(list.get(i));
					count.put(list.get(i), ++cnt);
					
					if(cnt > max_count) {
						max_count = cnt;
						max_item = list.get(i);
					}
				}	
				
			}
		}
        return max_item;
	}

	public static Integer solutionA(List<Integer> list) {

		Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
		Integer max_count = null;

		List<Entry<Integer, Integer>> sortedList;
        if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (!counter.containsKey(list.get(i))) {
					counter.put(list.get(i), 1);
				} else {
					int cnt = counter.get(list.get(i));
					counter.put(list.get(i), ++cnt);
				}
			}
			
			Set<Entry<Integer, Integer>> set = counter.entrySet();
			sortedList = new ArrayList<Entry<Integer, Integer>>(set);
			Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>() {

				
				public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
					
					return (o2.getValue()).compareTo(o1.getValue());
				}
			});
			
			max_count = sortedList.get(0).getKey();
		}
        
		return max_count;
	}
}
