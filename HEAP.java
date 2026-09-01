package day10;

import java.util.PriorityQueue;

public class HEAP {

	
	    public static void main(String[] args) {

	        int[] numbers = {10, 5, 20, 8, 15, 30, 25};

	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        
	        for (int i = 0; i < numbers.length; i++) {
	            minHeap.add(numbers[i]);
	        }

	        System.out.println("Removing elements in Min Heap order:");

	        
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(minHeap.poll() + " ");
	        }
	    }
	}