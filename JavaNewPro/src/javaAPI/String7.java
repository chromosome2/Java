package javaAPI;

public class String7 {

	public static void main(String[] args) {
		String text="ȫ�浿, ��ö��, ����ȣ, �̿���, ������";
		String[] names=text.split(",");
		for(int i=0;i<names.length; i++) {
			System.out.println(names[i]);
		}
		String text2="ȫ�浿, ��ö��$����ȣ,�̿���^������";
		String[] names2=text2.split(",|$|^");
		for(String na:names2) {
			System.out.println(na);
		}

	}

}
