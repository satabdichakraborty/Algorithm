package org.tutorial.recursivefunc;

public class fact {

	public static void main(String[] args) {

		System.out.println("Fact 3! = "+ fact(3));
		System.out.println("Fact 0! = "+ fact(0));
		System.out.println("Fact 1! = "+ fact(1));
		System.out.println("Fact 9! = "+ fact(9));
		
	}

	static int fact(int n) {

		if (n == 0)
			return 1;
		else {
			n = n * fact(n - 1);
		}
		return n;

	}

}
