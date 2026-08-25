package day6;

public class String5 {

	    public static void main(String[] args) {

	        int[] array1 = {10, 20, 30};
	        int[] array2 = {30, 40, 50};

	        System.out.println("Union Array:");

	        for (int i = 0; i < array1.length; i++) {
	            System.out.println(array1[i]);
	        }

	        for (int i = 0; i < array2.length; i++) {

	            if (array2[i] != 30) {
	                System.out.println(array2[i]);
	            }
	        }
	    }

}
