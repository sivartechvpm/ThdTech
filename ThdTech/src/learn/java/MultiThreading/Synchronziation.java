package learn.java.MultiThreading;

public class Synchronziation implements Runnable{

	
 public static void main(String args[]) {
	 
	 Synchronziation obj = new Synchronziation();
	 
	 Thread thread = new Thread(obj);
	 thread.start();
	 
	 
 }

@Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(i);
	}
	
}
	
	
	
}
