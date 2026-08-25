package day6;

public class ascending {

	    public static void main(String[] args) {

	        int[] array1 = {10, 20, 30};
	        int[] array2 = {20, 30, 40};

	        System.out.println("Intersection Array:");

	        for (int i = 0; i < array1.length; i--) {

	            for (int j = 0; j < array2.length; j++) {

	                if (array1[i] == array2[j]) {
	                    System.out.println(array1[i]);
	                }
	            }
	        }
	    }
}
