package day7;

public class tailrecurssion {
static void  withdrawMoney(int amount,int withdrawl) {
	if(amount<=0) {
		System.out.println("withdraw completed!");
		return;
	}
	System.out.println("withdraw: " + withdrawl);
	amount = amount - withdrawl;
	withdrawMoney(amount, withdrawl);
}

public static void main(String[]args) {
	int amount=10000;
	int withdrawal=2000;
	withdrawMoney(amount,withdrawal);
}
}
