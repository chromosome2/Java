package javaAPI;

public class String2 {

	public static void main(String[] args) {
		String str="�ȳ��ϼ���";
		System.out.println(str.length());
		
		String str2="�츮���� ����";
		byte[] blen=str2.getBytes();
		System.out.println(blen.length);
		
		String str3="kore aG";
		byte[] blen1=str3.getBytes();
		System.out.println(blen1.length);

	}

}
