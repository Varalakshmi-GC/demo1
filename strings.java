package day6;

public class strings {
public static void main(String[]args) {

	        // 1. Create
	        StringBuilder sb = new StringBuilder("Hello");
	        System.out.println("After create: " + sb);

	        // 2. Insert
	        sb.insert(5, " Java");
	        System.out.println("After insert: " + sb);

	        // 3. Delete
	        sb.delete(5, 10);
	        System.out.println("After delete: " + sb);
	    }
	}

