package javaClass2;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("메서드1 실행");
	}
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("메서드2 실행");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("메서드3 실행");
	}
}
