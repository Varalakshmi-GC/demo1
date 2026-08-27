package day7;

public class FRUITS {

	    static String correctFruit = "mango";

	    static void tryFruit(String fruit) {

	        System.out.println("Trying: " + fruit);

	        if (fruit.equals(correctFruit)) {
	            System.out.println("Fruit found: " + fruit);
	            return;
	        }

	        System.out.println("Wrong fruit. Go back and try another");
	    }

	    public static void main(String[] args) {

	        tryFruit("apple");
	        tryFruit("banana");
	        tryFruit("orange");
	        tryFruit("mango");

	    }
	}

