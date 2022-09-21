package javaThread;

public class ThreadEx {

	public static void main(String[] args) {
		ThreadA tha=new ThreadA();
		ThreadB thb=new ThreadB();
		ThreadC thc=new ThreadC();
		System.out.println(tha.getName());
		System.out.println(thb.getName());
		System.out.println(thc.getName());
		tha.start();
		thb.start();
		thc.start();
	}

}
