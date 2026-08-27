package day7;

public class whileloop {
		    public static void main(String[] args) {

		    	        int balance = 10000;

		    	        while (balance > 0) {
		    	            balance = balance - 2000;

		    	            System.out.println("Withdraw: ₹2000");
		    	            System.out.println("Remaining balance: ₹" + balance);
		    	        }
		    	    }
		    	}