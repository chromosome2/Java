package javaClass2;

public class Person_Anonymous1 {

	public static void main(String[] args) {
		Person_Anonymous anony=new Person_Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("studying");
			}
			@Override
			void wake() {
				System.out.println("wake up AM 8:00");
				study();
			}
		});

	}

}
