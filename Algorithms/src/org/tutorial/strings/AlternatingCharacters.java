package org.tutorial.strings;

public class AlternatingCharacters {

	public static void main(String[] args) {
		//3
		//String s ="AAAA";
		//4
		//String s ="BBBBB";
		//0
		//String s ="ABABABAB";
		//0
		//String s ="BABABA";
		//4
		String s ="AAABBB";
		int result = alternatingCharacters(s);

	}

	static int alternatingCharacters(String s) {
		int result = 0;
		
		    int i=0;
			while(i+1 < s.length()){
				if(s.charAt(i) == s.charAt(i+1)){
					result = result +1;					
				}
				i++;
			}
		
		System.out.println(result);
		return result;
	}

}
