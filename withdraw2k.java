package day7;

public class withdraw2k {
	public class Main {

	    static void withdraw(int balance) {
	     
	        if (balance == 0) {
	            System.out.println("Balance is 0");
	            return;
	        }

	        
	        if (balance >= 2000) {
	            balance -= 2000;
	            System.out.println("Withdrawn: ₹2000");
	            System.out.println("Remaining balance: ₹" + balance);

	         
	            withdraw(balance);
	        } else {
	            System.out.println("Cannot withdraw ₹2000.");
	            System.out.println("Remaining balance: ₹" + balance);
	        }
	    }

	    public static void main(String[] args) {
	        withdraw(10000);
	    }
	

	}

}
