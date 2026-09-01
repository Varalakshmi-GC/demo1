package day10;
import java.util.Arrays;
public class medium {

	    public static void main(String[] args) {

	        int[] numbers = {30, 10, 20, 5, 40};

	        Arrays.sort(numbers);

	        int middle = numbers[numbers.length / 2];

	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	        System.out.println("Middle element: " + middle);
	    }
	}

