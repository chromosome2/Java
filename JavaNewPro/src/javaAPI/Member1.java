package javaAPI;

public class Member1 {

	public static void main(String[] args) {
		Member ori=new Member("hong","ȫ�浿","12345",50,true);
		Member cloned=ori.getMember();
		cloned.password="77777";
		System.out.println(ori.password);
		System.out.println(cloned.password);

	}

}
