package javaAPI;

import java.text.MessageFormat;

public class Format2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] member= {"hong","ȫ�浿","010-777-7777","hong@daum.net"};
		String text="ȸ�� ID : {0}\nname : {1}\ntel : {2}\nemail : {3}";
		String result=MessageFormat.format(text, member);
		System.out.println(result);
		String text2="{0}ȸ���� �޷�";
		result=MessageFormat.format(text2, member);
		System.out.println(result);
	}

}
