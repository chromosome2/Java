package javaClass2;

public class Tire {
	public int maxRotation;
	public int accmulatedRotation;
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+"Tire의 수명 : "+(maxRotation-accmulatedRotation+"회"));
			return true;
		}else {
			System.out.println(location+"타이어가 수명이 다해서 펑크 났습니다.");
			return false;
		}
	}
}
