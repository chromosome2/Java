package javaThread;

public class AutoSaveThreadEx {

	public static void main(String[] args) {
		AutoSaveThread ast=new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			
		}
		System.out.println("end");

	}

}
