package javaThread;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("working...");
				Thread.sleep(5);
			}
		}catch(InterruptedException e) {
			
		}
		System.out.println("clear");
		System.out.println("end");
	}
}
