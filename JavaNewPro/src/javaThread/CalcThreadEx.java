package javaThread;

public class CalcThreadEx {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			Thread thread=new CalcThread("thread"+i);
			if(i==7) {
				thread.setPriority(thread.MAX_PRIORITY);
			}else {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			thread.start();
		}

	}

}
