package javaClass2;

public class iTiger extends Animal implements IAnimal{

	@Override
	public void eat() {
		System.out.println("������� ��ƸԴ´�.");
		
	}

	@Override
	void move() {
		System.out.println("�׹߷� �̵��Ѵ�.");
		
	}

	@Override
	void voice() {
		System.out.println("����!");
		
	}

}
