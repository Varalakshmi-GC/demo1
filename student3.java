package day6;

public class student3 {
	    public static void main(String[] args) {

	        int[] marks = {80, 95, 70};

	        int[] prefixsum = new int[marks.length];

	        prefixsum[0] = marks[0];

	        for (int i = 1; i < marks.length; i++) {
	            prefixsum[i] = prefixsum[i - 1] + marks[i];
	        }

	        int sum = prefixsum[2];

	        System.out.println("Total marks = " + sum);
	    }
	}

