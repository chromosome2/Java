package javaAPI;

public class Member2Ex {
	public static void main(String[] args) {
		Member2 ori=new Member2("홍길동",50,new int[] {80,90,70}, new Car("소나타"));
		Member2 cloned=ori.getMember();
		
	}
}
