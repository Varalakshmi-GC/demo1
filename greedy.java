package day10;

	import java.util.Arrays;
	import java.util.Comparator;
	public class greedy {
	

	    public static void main(String[] args) {
	        int[][] activities = {
	            {1, 3},
	            {2, 5},
	            {4, 7},
	            {6, 9},
	            {8, 10}
	        };

	        // Sort activities by finishing time
	        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

	        System.out.println("Selected activities:");

	        int lastFinishTime = -1;

	        for (int[] activity : activities) {
	            int start = activity[0];
	            int finish = activity[1];

	            // Greedy choice: choose activity that finishes earliest
	            if (start >= lastFinishTime) {
	                System.out.println("Start: " + start + ", Finish: " + finish);
	                lastFinishTime = finish;
	            }
	        }
	    }
	}

