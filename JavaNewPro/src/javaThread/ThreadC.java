package javaThread;

public class ThreadC  extends Thread{
	@Override
	public void run() {
		int num1=50;
		int num2=30;
		
		System.out.println(getName()+"�� �� �۾� : "+(num1-num2));
	}
}
