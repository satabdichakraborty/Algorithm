package org.tutorial.binarysearchtree;

public class TreeNode {

	int value;
	TreeNode left, right;

	public TreeNode(int headValue) {
		this.value = headValue;
	}

	public TreeNode(int headValue, TreeNode left, TreeNode right) {
		this.value = headValue;
		this.left = left;
		this.right = right;
	}

	public static void main(String[] args) {
		/*TreeNode bst = new TreeNode(10);
		bst.insert(5);
		bst.insert(20);
		bst.insert(3);
		bst.insert(9);
		bst.insert(1);
		bst.insert(4);
		bst.insert(15);
		bst.insert(25);
		bst.insert(13);
		bst.insert(17);
		bst.insert(30);*/

		//bst.printInorder();
	}

	public void insert(int value) {
		if (value <= value) {
			if (left == null) {
				left = new TreeNode(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new TreeNode(value);
			} else {
				right.insert(value);
			}
		}
	}

	public void printInorder() {
		if (left != null) {
			left.printInorder();
		}

		System.out.print(value + " >> ");

		if (right != null) {
			right.printInorder();
		}	
		
	}

	public boolean contains(int value) {
		boolean result = false;
		
		if (value == value) {
			result = true;
		} else if (value < value) {
			if (left == null) {
				result = false;
			} else {
				left.contains(value);
			}
		} else {
			if (value > value) {
				if (right == null) {
					result = false;
				} else {
					right.contains(value);
				}
			}
		}		
		return result;
	}

}
