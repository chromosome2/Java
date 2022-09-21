package javaThread;

public class StateThreadEx {

	public static void main(String[] args) {
		StartThread startThread=new StartThread(new JobThread());
		startThread.start();

	}

}
