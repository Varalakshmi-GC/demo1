package day10;

	import java.util.Arrays;
	import java.util.Comparator;
	public class job {

	    static class Job {
	        String id;
	        int deadline;
	        int profit;

	        Job(String id, int deadline, int profit) {
	            this.id = id;
	            this.deadline = deadline;
	            this.profit = profit;
	        }
	    }

	    public static void main(String[] args) {
	        Job[] jobs = {
	            new Job("J1", 2, 100),
	            new Job("J2", 1, 19),
	            new Job("J3", 2, 27),
	            new Job("J4", 1, 25),
	            new Job("J5", 3, 15)
	        };

	       
	        Arrays.sort(jobs, Comparator.comparingInt((Job job) -> job.profit).reversed());

	        int maxDeadline = 0;
	        for (Job job : jobs) {
	            maxDeadline = Math.max(maxDeadline, job.deadline);
	        }

	        String[] schedule = new String[maxDeadline];
	        int totalProfit = 0;

	        for (Job job : jobs) {
	           
	            for (int slot = job.deadline - 1; slot >= 0; slot--) {
	                if (schedule[slot] == null) {
	                    schedule[slot] = job.id;
	                    totalProfit += job.profit;
	                    break;
	                }
	            }
	        }

	        System.out.println("Selected jobs:");
	        for (int i = 0; i < schedule.length; i++) {
	            if (schedule[i] != null) {
	                System.out.println("Slot " + (i + 1) + ": " + schedule[i]);
	            }
	        }

	        System.out.println("Total profit: " + totalProfit);
	    }
	}

