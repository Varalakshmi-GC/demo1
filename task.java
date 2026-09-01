package day10;
	import java.util.Collections;
	import java.util.PriorityQueue;

		public class task {
	    public static void main(String[] args) {

	        int[] values = {10, 5, 20, 8, 15, 3, 25};

	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        PriorityQueue<Integer> maxHeap =
	                new PriorityQueue<>(Collections.reverseOrder());

	        for (int value : values) {
	            minHeap.add(value);
	            maxHeap.add(value);
	        }

	        System.out.println("Lowest value: " + minHeap.peek());
	        System.out.println("Highest value: " + maxHeap.peek());

	        int center = 0;

	        for (int i = 0; i <= values.length / 2; i++) {
	            center = minHeap.poll();
	        }

	        System.out.println("Center value: " + center);
	    }
	}
