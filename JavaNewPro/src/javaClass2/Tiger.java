package javaClass2;

public class Tiger extends Animal {
	int age;

	@Override
	void move() {
		System.out.println("네발로 이동합니다.");
		
	}

	@Override
	void voice() {
		System.out.println("어흥!");
		
	}
}
