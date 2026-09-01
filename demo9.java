package day10;

public class demo9 {
	public class Demo {
	    public static void main(String[] args) {
	        int[] nums = {2, 1, 1, 0, 4};
	        int maxReach = 0;
	        for (int i = 0; i < nums.length; i++) {
	            // If current position cannot be reached
	            if (i > maxReach) {
	                break;
	            }
	            // Find the farthest position we can reach
	            maxReach = Math.max(maxReach, i + nums[i]);
	        }
	        if (maxReach >= nums.length - 1) {
	            System.out.println("Can reach the last position");
	        } else {
	            System.out.println("Cannot reach the last position");
	        }
	    }
	}
}
