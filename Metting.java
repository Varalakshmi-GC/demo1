package day10;

public class Metting {

	    public static void main(String[] args) {

	        String[][] meetings = {
	            {"9:00", "10:00"},    
	            {"9:30", "11:30"},    
	            {"10:00", "11:00"},  
	            {"10:00", "12:00"},  
	            {"11:00", "12:00"}   
	        };

	        for (int i = 0; i < meetings.length; i++) {
	            System.out.println(
	                "M" + (i + 1) +
	                ": Start = " + meetings[i][0] +
	                ", End = " + meetings[i][1]
	            );
	        }
	    }
	}

