package javaThread;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("saved.");
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("working...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			save();
		}
	}
}
