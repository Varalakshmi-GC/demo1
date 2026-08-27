package day7;

public class forloop {
public static void main(String[]args) {

		    	int balance = 10000;
		    	for (int i = 1; balance > 0; i++) {
		    		balance = balance - 2000;

		    	            System.out.println("Withdrawal " + i + ": ₹2000");
		    	            System.out.println("Remaining balance: ₹" + balance);
		    	        }
		    	    
		    	
}
}
