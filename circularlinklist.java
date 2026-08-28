package day8;

public class circularlinklist {

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public static void main(String[] args) {

	        Node first = new Node(10);
	        Node second = new Node(20);
	        Node third = new Node(30);

	        // Connecting nodes
	        first.next = second;
	        second.next = third;
	        third.next = first;

	        // Display circular linked list
	        Node temp = first;

	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != first);
	    }
}
	
