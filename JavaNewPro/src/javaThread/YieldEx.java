package javaThread;

public class YieldEx {

	public static void main(String[] args) {
		ThreadJOB1_yield job1=new ThreadJOB1_yield();
		ThreadJOB2_yield job2=new ThreadJOB2_yield();
		job1.start();
		job2.start();
		
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
			
		}
		
		job1.work=false;
		System.out.println("2");
		
		try {Thread.sleep(1);}catch(InterruptedException e) {}
		job1.work=true;
		System.out.println("1+2");
		try {Thread.sleep(1);}catch(InterruptedException e) {}
		
		job1.stop=true;
		job2.stop=true;

	}

}
