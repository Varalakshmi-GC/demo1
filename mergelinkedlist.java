package day8;

public class mergelinkedlist {

	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node merge(Node head1, Node head2) {
	        Node temp = head1;

	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        temp.next = head2;

	        return head1;
	    }

	    void display(Node head) {
	        Node temp = head;

	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args) {

	        mergelinkedlist obj = new mergelinkedlist();

	        // First linked list
	        Node head1 = obj.new Node(10);
	        head1.next = obj.new Node(20);
	        head1.next.next = obj.new Node(30);

	        // Second linked list
	        Node head2 = obj.new Node(40);
	        head2.next = obj.new Node(50);
	        head2.next.next = obj.new Node(60);

	        // Merge
	        head1 = obj.merge(head1, head2);

	        System.out.println("Merged Linked List:");
	        obj.display(head1);
	    }}
	