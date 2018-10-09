package org.tutorial.recursivefunc;

public class FibonacciSeq {

	public static void main(String[] args) {
		int n = 16;
		System.out.println("Fib(" + n + ") = " + printFibs(n));
		System.out.println("Fib0(" + n + ") = " + fibo_dojo(n));
	}

	static int sum(int a, int b) {
		int sum = a + b;
		System.out.print(b + " "+a + " ");
		return sum;
	}


	static int fibo_dojo(int n) {
		if(n>2){
			return (fibo_dojo(n-1) + fibo_dojo (n-2));
		}
		else
			return 1;
	}
	
	static int printFibs(int n) {

		int i = 1;
		int k = 1;
		int j = 3;

		if (n == 1 || n == 2)
			return 1;
		else {
			while (++j < n) {
				System.out.print(i +" "+k+" ");
				i = i + k;
				k = i + k;
			}
		}

		System.out.println(" ");
		return k-i;
	}

}
