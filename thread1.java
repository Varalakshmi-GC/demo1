package day3;
import java.util.Iterator;

public class thread1  extends Thread{

	class MyTask implements Runnable {

	    public void run() {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Child Thread: " + i);
	        }
	    }
	}

	public class Demo {

	    public static void main(String[] args) {

	        MyTask task = new MyTask();

	        Thread t = new Thread(task);

	        t.start();

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main Thread: " + i);
	        }
	    }
	}
