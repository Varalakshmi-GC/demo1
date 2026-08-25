package day6;

public class Demo{
	public static void main(String[]agrs) {

	        StringBuilder sb = new StringBuilder("Hello");

	        // 1. append()
	        sb.append(" Java");
	        System.out.println("After append: " + sb);

	        // 2. insert()
	        sb.insert(6, "World ");
	        System.out.println("After insert: " + sb);

	        // 3. reverse()
	        sb.reverse();
	        System.out.println("After reverse: " + sb);
	    }
	}

