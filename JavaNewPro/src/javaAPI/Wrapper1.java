package javaAPI;

public class Wrapper1 {

	public static void main(String[] args) {
		String str1="10";
		String str2="20";
		System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
		Integer obj1=750;
		Integer obj2=750;
		if(obj1==obj2) {
			System.out.println("eq");
		}else {
			System.out.println("no");
		}
		if(obj1.equals(obj2)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
