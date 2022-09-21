package javaThread;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<=100;i++) {
			sum+=i;
		}
		System.out.println(this.getName()+"가 한 작업: "+sum);
	}
}
