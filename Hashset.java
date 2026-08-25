package day5;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {

	        HashSet<String> set = new HashSet<>();

	        // Add
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Mango");
	        set.add(null);
	        //duplicate
	        set.add("Apple");
	        
	        System.out.println("After adding:"+set);
	        System.out.println("After adding:"+set.size());
	        System.out.println("HashSet is empty after addind:"+set.isEmpty());

	        // Delete
	        set.remove("Banana");
	        System.out.println("After delete: " + set);
	        System.out.println("After delete: " + set.size());


	        // Update (Banana -> Orange)
	        set.remove("Mango");
	        set.add("Orange");
	        System.out.println("After update: " + set);
	        System.out.println("After update: " + set.size());

	    }

}
