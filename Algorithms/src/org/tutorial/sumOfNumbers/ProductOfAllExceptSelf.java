package org.tutorial.sumOfNumbers;

class ProductOfAllExceptSelf {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		int[] productArr = getProductArr(arr);

		for (int num : productArr) {
			System.out.println(num);
		}
	}

	public static int[] getProductArr(int[] arr) {
		int[] productArr = new int[arr.length];
		int num = 1;

		for (int i=0; i<arr.length; i++) {
			productArr[i] = num;
			num *= arr[i];
			//System.out.println("num1 = "+num);
		}

		num = 1;
		
		for (int i=arr.length-1; i>=0; i--) {
			productArr[i] *= num;
			System.out.println("num2 = "+num);
			num *= arr[i];
			System.out.println("num3 = "+num);
		}

		return productArr;
	}
}
