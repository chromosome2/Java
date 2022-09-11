package javaClass2;

public class Calcualtor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal=new Calculator();
		int tot=cal.total(70, 80, 90);
		System.out.println(tot);
		System.out.println(cal.average(70, 80, 90));
		System.out.println(cal.average(10,20,30,40,50,60));
	}

}
