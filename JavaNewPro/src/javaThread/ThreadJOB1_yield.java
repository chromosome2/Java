package javaThread;

public class ThreadJOB1_yield extends Thread{
	public boolean stop=false;
	public boolean work=true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("threadjob1�� ���ϴ� ��...");
			}else {
				Thread.yield();
			}
		}
		System.out.println("ThreadJob1 ����");
	}
}
