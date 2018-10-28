package org.tutorial.strings;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

	public static void main(String[] args) {
		//Yes
		//String s1 = "hello";
        //String s2 = "world";
        
        //No
        String s1 = "hi";
        String s2 = "world";

        String result = twoStrings(s1, s2);
        
	}
	
	static String twoStrings(String s1, String s2) {
      String ret = "No";
     
      Map<Character, Integer> map1  =  new HashMap<>();
      Map<Character, Integer> map2  =  new HashMap<>();
      
      map1 = populateMap(s1, map1);
      map2 = populateMap(s2, map2);
      
      if(s1.length()> 0 && s1.length()> 0){
    	 
    	  for (Character c : map1.keySet()) {
			if(map2.containsKey(c)){
				 ret = "Yes";
			}
		}
      }
      
      System.out.println(ret);
      
      return ret;
    }

	private static Map<Character, Integer> populateMap(String s1, Map<Character, Integer> map1) {
		for (int i = 0; i < s1.length(); i++) {
			if(!map1.containsKey(s1.charAt(i))){
				map1.put(s1.charAt(i), 1);
			} else {
				int index = map1.get(s1.charAt(i));
				map1.put(s1.charAt(i), ++index);
			}
		}
		return map1;
	}


}
