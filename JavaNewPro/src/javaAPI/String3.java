package javaAPI;

public class String3 {

	public static void main(String[] args) {
		String str="내일부터 어린이날 휴무입니다.";
		int index=str.indexOf("어린이");
		System.out.println(index);
		String subject="이것이 자바다";
		int location=subject.indexOf("자바");
		System.out.println(location);
		if(location!=-1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}

	}

}
