package javaClass2;

public class Car {
	Tire fLT=new Tire("앞왼쪽",3);
	Tire fRT=new Tire("앞오른쪽",3);
	Tire bLT=new Tire("뒤왼쪽",3);
	Tire bRT=new Tire("뒤오른쪽",3);
	int a;
	
	int run() {
		System.out.println("자동차가 달립니다.");
		a=0;
		if(fLT.roll()==false) {
			stop();
			a=1;
		}
		if(fRT.roll()==false) {
			stop();
			a=2;
		}
		if(bLT.roll()==false) {
			stop();
			a=3;
		}
		if(bRT.roll()==false) {
			stop();
			a=4;
		}
		return a;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
