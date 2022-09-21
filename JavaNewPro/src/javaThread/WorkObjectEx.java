package javaThread;

public class WorkObjectEx {

	public static void main(String[] args) {
		WorkObject ob=new WorkObject();
		ThreadworkA A=new ThreadworkA(ob);
		ThreadWorkB B=new ThreadWorkB(ob);
		A.start();
		B.start();

	}

}
