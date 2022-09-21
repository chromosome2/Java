package javaAPI;

public class Math1 {

	public static void main(String[] args) {
		int num1=Math.abs(-5);
		System.out.println(num1);
		double num2=Math.ceil(3.2);
		double num3=Math.round(-5.50);
		double num4=Math.floor(3.2);
		double num5=Math.rint(-5.5);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(Math.random());
		System.out.println(Math.max(2.5,2.52));
		System.out.println(Math.min(2.2, 2.21));

	}

}
