package javaAPI;

public class String3 {

	public static void main(String[] args) {
		String str="���Ϻ��� ��̳� �޹��Դϴ�.";
		int index=str.indexOf("���");
		System.out.println(index);
		String subject="�̰��� �ڹٴ�";
		int location=subject.indexOf("�ڹ�");
		System.out.println(location);
		if(location!=-1) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		}else {
			System.out.println("�ڹٿ� ������ ���� å�̱���.");
		}

	}

}
