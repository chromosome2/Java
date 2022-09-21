package javaThread;

public class CalcThread extends Thread{
	public CalcThread(String name) {
		setName(name);
	}
	
	@Override
	public void run() {
		int sum=0;
		for(int i=1;i<100000000;i++) {
			sum+=i*2;
		}
		System.out.println(getName()+" : "+sum);
	}
}
