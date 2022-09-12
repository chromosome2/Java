package javaAPI;

public class String4 {

	public static void main(String[] args) {
		String str="조수진은 최고다";
		str.replace('조', '박');
		System.out.println(str.replace('조', '박'));
		str=str.replace("조수진", "조정숙");
		System.out.println(str);
		String memo="computer";
		System.out.println(memo.substring(3));
		System.out.println(memo.substring(3,6));

	}

}
