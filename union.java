package day6;

public class union {
    public static void main(String[] args) {


    	        String[] array1 = {"Rahul", "Arun", "Kiran"};
    	        String[] array2 = {"Kiran", "Raj", "Amit"};

    	        System.out.println("Union Array:");

    	        for (int i = 0; i < array1.length; i++) {
    	            System.out.println(array1[i]);
    	        }

    	        for (int i = 0; i < array2.length; i++) {

    	            if (!array2[i].equals("Kiran")) {
    	                System.out.println(array2[i]);
    	            }
    	        }
    	    }
    	}

