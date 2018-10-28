package org.tutorial.recursion;

public class factorial {

	public static void main(String[] args) {
		int n = 5;
		int result = factorial(n);
		
		System.out.println(result);
	}

	static int factorial(int n) {
		if(n==1 || n==0){
			return 1;
		} else {
			n  = n * factorial(n-1);
		}
      return n;
	}

}
