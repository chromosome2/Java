package javaClass2;

public class Car {
	Tire fLT=new Tire("�տ���",3);
	Tire fRT=new Tire("�տ�����",3);
	Tire bLT=new Tire("�ڿ���",3);
	Tire bRT=new Tire("�ڿ�����",3);
	int a;
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
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
		System.out.println("�ڵ����� ����ϴ�.");
	}
}
