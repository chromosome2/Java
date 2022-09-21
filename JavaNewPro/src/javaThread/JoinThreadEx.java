package javaThread;

public class JoinThreadEx {

	public static void main(String[] args) {
		JoinThread joinThread=new JoinThread();
		joinThread.start();
		try {
			joinThread.join();
		}catch(InterruptedException e) {}
		System.out.println(joinThread.getSum());

	}

}
