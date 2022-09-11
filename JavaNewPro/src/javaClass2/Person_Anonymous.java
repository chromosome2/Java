package javaClass2;

public class Person_Anonymous {
	Person field=new Person() {
		void work() {
			System.out.println("work start.");
		}
		@Override
		void wake() {
			System.out.println("wake up AM 6:30");
			work();
		}
	};
	void method1() {
		Person mField=new Person() {
			void walk() {
				System.out.println("walk through a park.");
			}
			@Override
			void wake() {
				System.out.println("wake up AM 7:00");
				walk();
			}
		};
		mField.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
