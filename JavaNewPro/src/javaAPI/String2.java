package javaAPI;

public class String2 {

	public static void main(String[] args) {
		String str="안녕하세요";
		System.out.println(str.length());
		
		String str2="우리나라 만세";
		byte[] blen=str2.getBytes();
		System.out.println(blen.length);
		
		String str3="kore aG";
		byte[] blen1=str3.getBytes();
		System.out.println(blen1.length);

	}

}
