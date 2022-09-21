package javaThread;

public class JobThread extends Thread{
	@Override
	public void run() {
		for(long i=1; i<=2000000000;i++) {
			
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		for(long i=1; i<=2000000000;i++) {
			
		}
	}
}
