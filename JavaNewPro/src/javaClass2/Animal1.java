package javaClass2;

public class Animal1 {

	public static void main(String[] args) {
		Tiger tiger1=new Tiger();
		Eagle eagle1=new Eagle();
		tiger1.age=2;
		tiger1.name="ȣ����";
		eagle1.name="�̱۽�";
		eagle1.home="�ҳ�������";
		System.out.println(tiger1.name+"�� "+tiger1.age+"�� �Դϴ�.");
		tiger1.voice();
		tiger1.move();
		System.out.println(eagle1.name+"�� "+eagle1.home+"�� ��ϴ�.");
		eagle1.voice();
		eagle1.move();
	}

}
