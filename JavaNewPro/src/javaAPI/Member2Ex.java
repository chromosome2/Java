package javaAPI;

public class Member2Ex {
	public static void main(String[] args) {
		Member2 ori=new Member2("ȫ�浿",50,new int[] {80,90,70}, new Car("�ҳ�Ÿ"));
		Member2 cloned=ori.getMember();
		
	}
}
