package javaAPI;

import java.util.HashMap;

public class KeyEx1 {

	public static void main(String[] args) {
		int[] nums= {10,20,30};
		System.out.println(nums);
		HashMap<Key, String> hashMap=new HashMap<Key, String>();
		hashMap.put(new Key(90), "ȫ�浿");
		String value=hashMap.get(new Key(90));
		System.out.println(value);

	}

}
