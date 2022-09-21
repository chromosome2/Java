package javaThread;

public class MyThread extends Thread{
	private Calc calc=new Calc();
	
	public void setCalc(Calc calc) {
		this.setName("MyThread1");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(100);
	}
}
