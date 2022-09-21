package javaThread;

public class MyThread2 extends Thread{
	private Calc calc=new Calc();
	
	public void setCalc(Calc calc) {
		this.setName("MyThread2");
		this.calc=calc;
	}
	
	@Override
	public void run() {
		calc.setMemory(50);
	}
}
