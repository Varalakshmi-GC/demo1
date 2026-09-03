package day12;
import java.util.HashSet;
public class ARRAY {


	    public static boolean hasDuplicate(int[] numbers) {

	        HashSet<Integer> set = new HashSet<>();

	        for (int i = 0; i < numbers.length; i++) {

	            if (set.contains(numbers[i])) {
	                return true;
	            }

	            set.add(numbers[i]);
	        }

	        return false;
	    }

	    public static void main(String[] args) {

	        int[] numbers = {1, 2, 3, 1};

	        System.out.println(hasDuplicate(numbers));
	    }
	}