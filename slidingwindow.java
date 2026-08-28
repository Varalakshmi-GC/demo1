package day8;
import java.util.Queue;
import java.util.LinkedList;
public class slidingwindow {
	
	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 4, 5, 6};
	        int k = 3;

	        Queue<Integer> queue = new LinkedList<>();

	        for (int i = 0; i < arr.length; i++) {

	            queue.add(arr[i]);

	            if (queue.size() == k) {
	                System.out.println("Window: " + queue);

	                queue.remove();
	            }
	        }
	    }
	}

