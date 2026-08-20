package day4;

public class pass {
	    public static void main(String[] args) {

	        int[] marks = {35, 67, 89, 22, 45, 30, 76};

	        int count = 0;

	        for (int i = 0; i < marks.length; i++) {
	            if (marks[i] >= 40) {
	                count++;
	            }
	        }

	        System.out.println("Passed Students = " + count);
	    }
	}


