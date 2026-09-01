package day10;

	import java.util.Arrays;
	import java.util.Comparator;
		public class doc {
	    public static void main(String[] args) {

	        int[][] appointments = {
	            {9, 10},
	            {9, 12},
	            {10, 11},
	            {11, 12},
	            {12, 1}
	        };

	        Arrays.sort(appointments, Comparator.comparingInt(a -> a[1]));

	        int lastEndTime = 0;

	        System.out.println("Selected doctor appointments:");

	        for (int[] appointment : appointments) {
	            int start = appointment[0];
	            int end = appointment[1];

	            // Choose appointment if it does not overlap
	            if (start >= lastEndTime) {
	                System.out.println("Appointment: " + start + " to " + end);
	                lastEndTime = end;
	            }
	        }
	    }
	}

