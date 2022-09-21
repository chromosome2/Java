package javaThread;

public class ThreadJOB2_yield extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("threadjob2가 일하는 중...");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadJob2 종료");
	}
}
