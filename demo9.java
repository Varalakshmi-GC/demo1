package day11;

public class demo9 {
	
		    static class Node {
		        Node[] children = new Node[26];
		        boolean isEnd;
		    }
		    static Node root = new Node();

		    public static void insert(String word) {

		        Node current = root;

		        for (int i = 0; i < word.length(); i++) {

		            int index = word.charAt(i) - 'a';

		            if (current.children[index] == null) {
		                current.children[index] = new Node();
		            }

		            current = current.children[index];
		        }

		        current.isEnd = true;
		    }

		    public static void main(String[] args) {
		        insert("cat");
		        insert("car");
		        insert("can");
		        insert("cab");
		        System.out.println("Words inserted successfully");
		    }
		}

