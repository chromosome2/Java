package javaClass2;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+"금호 Tire의 수명 : "+(maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println(location+"금호타이어가 수명이 다해서 펑크 났습니다.");
			return false;
		}
	}
}
