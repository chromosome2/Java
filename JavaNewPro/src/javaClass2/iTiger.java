package javaClass2;

public class iTiger extends Animal implements IAnimal{

	@Override
	public void eat() {
		System.out.println("멧돼지를 잡아먹는다.");
		
	}

	@Override
	void move() {
		System.out.println("네발로 이동한다.");
		
	}

	@Override
	void voice() {
		System.out.println("어흥!");
		
	}

}
