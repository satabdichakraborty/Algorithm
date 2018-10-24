package org.tutorial.array;

public class ReverseArray {

	public static void main(String[] args) {
		int n = 4;
		int[] arr = new int[n];
        int[] reverseArr = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            arr[i] = i;
        }
        
        for (int i : arr) {
			System.out.print(i+ " ");
		}
        
        System.out.println(" ");
        
        int k = n-1;
       
        for (int i : arr) {
        	reverseArr[k] = i;
        	k--;
		}
        
        for (int i : reverseArr) {
			System.out.print(i+ " ");
		}

	}

}
