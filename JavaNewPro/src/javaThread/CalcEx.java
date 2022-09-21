package javaThread;

public class CalcEx {

	public static void main(String[] args) {
		Calc calc=new Calc();
		MyThread myt1=new MyThread();
		myt1.start();
		
		MyThread2 mythread2=new MyThread2();
		mythread2.start();

	}

}
