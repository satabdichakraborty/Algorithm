package org.tutorial.linkedList;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class InsertElement {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList llist = new SinglyLinkedList();

		
		//int[] arr = { 16, 13, 7 };
		int[] arr = {11, 9, 19, 10, 4};

		for (int i = 0; i < arr.length; i++) {
			int llistItem = arr[i];

			llist.insertNode(llistItem);
		}

		int data = 20;

		int position = 3;

		SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

	}

	private static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
		SinglyLinkedListNode pointer1 = head;
		SinglyLinkedListNode nodeToInsert = new SinglyLinkedListNode(data);
		Map<Integer, SinglyLinkedListNode> map = new HashMap<>();
		int count = 1;
		while (pointer1 != null) {
			map.put(count++, pointer1);
			pointer1 = pointer1.next;
		}

		 System.out.println("Before Insert : ");
		 for (int i : map.keySet()) {
			System.out.print(i+":"+map.get(i).data+" ");
		}

		// System.out.println("llll"+ (position + 1) +" "+ map.size());
		if (position + 1 <= map.size()) {
			SinglyLinkedListNode temp = map.get(position);
			System.out.println(position+" = "+temp.data);
			temp.next = nodeToInsert;
			nodeToInsert.next = map.get(position + 1);
		}
		 System.out.println("After Insert : ");
		return head;
	}
	
	 public static String linkedListToString(SinglyLinkedListNode head) {
		 SinglyLinkedListNode current = head;
	        StringBuilder sb = new StringBuilder();
	        while (current != null) {
	            sb.append(String.valueOf(current.data));
	            sb.append(" -> ");
	            current = current.next;
	        }
	        sb.append("(null)");
	        return sb.toString();
	    }

}
