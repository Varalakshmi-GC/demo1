package day3;

public class thread extends Thread {
		
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("method"+i);
				
			}
		}
		public static void main(String[] args) {
			thread bb= new thread();
			bb.start();
			for(int i=0;i<5;i++) {
				System.out.println("main method"+i);
				
			}
		}

}

