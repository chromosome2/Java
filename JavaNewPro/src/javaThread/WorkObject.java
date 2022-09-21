package javaThread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("working methodA of ThreadWorkA");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("working methodB of ThreadWorkB");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {}
	}
}
