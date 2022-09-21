package javaThread;

public class ThreadB extends Thread{
	@Override
	public void run() {
		int num1=50;
		int num2=30;
		
		System.out.println(getName()+"가 한 작업 : "+(num1+num2));
	}
}
