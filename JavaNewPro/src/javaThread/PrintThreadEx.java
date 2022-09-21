package javaThread;

public class PrintThreadEx {

	public static void main(String[] args) {
		PrintThread1 pt1=new PrintThread1();
		pt1.start();
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			
		}
		pt1.setStop(true);

	}

}
