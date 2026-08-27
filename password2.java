package day7;

public class password2 {
	    static String correctApple = "red";

	    static void tryApple(String apple) {

	        System.out.println("Trying: " + apple);

	        if (apple.equals(correctApple)) {
	            System.out.println("Apple found: " + apple);
	            return;
	        }

	        System.out.println("Wrong apple. Go back and try another");
	    }

	    public static void main(String[] args) {

	        tryApple("green");
	        tryApple("yellow");
	        tryApple("red");

	        
	    }
	
}
