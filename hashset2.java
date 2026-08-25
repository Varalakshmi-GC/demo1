package day5;
import java.util.HashSet;
import java.util.Iterator;


public class hashset2 {


	public class Demo5 {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();

	        // 10 Insertions
	        set.add("A");
	        set.add("B");
	        set.add("C");
	        set.add("D");
	        set.add("E");
	        set.add("F");
	        set.add("G");
	        set.add("H");
	        set.add("I");
	        set.add("J");

	        // Null value
	        set.add(null);
	        
	        // Duplicate values - will be ignored
	        set.add("A"); // duplicate
	        set.add("B"); // duplicate
	        set.add(null); // duplicate null

	        System.out.println("Size: " + set.size()); // 11 only, not 14
	        System.out.println("Set: " + set);

	        // Iterator
	        Iterator<String> it = set.iterator();
	        System.out.println("\nUsing Iterator:");
	        while(it.hasNext()){
	            System.out.println(it.next());
	        }
	    }
	
	}
}
