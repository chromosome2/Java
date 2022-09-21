package javaThread;

public class ThreadWorkB extends Thread{
	private WorkObject object;
	
	public ThreadWorkB (WorkObject object) {
		this.object=object;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			object.methodB();
		}
	}
}
