package org.tutorial.linkedList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.tutorial.linkedList.Node;

public class Nth {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        Node current = new Node(1, null);
        for (int i = 2; i < 8; i++) {
            current = new Node(i, current);
        }
        Node head = current;
        // head = 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)

        Node current2 = new Node(4, null);
        for (int i = 3; i > 0; i--) {
            current2 = new Node(i, current2);
        }
        Node head2 = current2;
        // head2 = 1 -> 2 -> 3 -> 4 -> (null)

        //nthFromLast(head, 1); //should return 1.
        // nthFromLast(head, 5); //should return 5.
        // nthFromLast(head2, 2); //should return 3.
        // nthFromLast(head2, 4); //should return 1.
        // nthFromLast(head2, 5); //should return null.
         nthFromLast(null, 1); //should return null.
    }


    // Implement your function below.
    public static Node nthFromLast(Node head, int n) {
    	Node headCount = head;
    	if(head == null) {
    		System.out.println("Asked for null");
    		return null;
    	}
    	System.out.println(linkedListToString(head));
    	int count = 0;
    	
    	while (headCount != null) {
    		Node node = (Node) headCount.next;
    		headCount = headCount.next;
    		count++;
		}
    	
    	int element = count - n;
    	if(element < 0) {
    		System.out.println("Asked for null");
    		return null;
    	}
    	
    	System.out.println("Length = "+count+ " : n = "+n+" : element = "+element);
    	
    	int i=0;
    	while(i < element && head != null){
    		Node node = (Node) head.next;
    		head = head.next;
    		i++;
    	}
    	
    	System.out.println("Asked for " +head.data);
        return head;
    }


    //  NOTE: Feel free to use the following function for testing.
    //  It converts the given linked list into an easy-to-read string format.
    //  Example: 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> (null)
    public static String linkedListToString(Node head) {
        Node current = head;
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