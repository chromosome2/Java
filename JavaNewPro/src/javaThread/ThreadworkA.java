package javaThread;

public class ThreadworkA extends Thread{
	private WorkObject object;
	
	public ThreadworkA (WorkObject object){
		this.object=object;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			object.methodA();
		}
	}
}
