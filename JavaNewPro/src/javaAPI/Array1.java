package javaAPI;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] scores= {75,96,80,90,83};
		Arrays.sort(scores);
		for(int i=scores.length-1; i>=0; i--) {
			System.out.println(scores[i]);
		}
		String[] names= {"��ö��","ȫ�浿","�̿���"};
		Arrays.sort(names);
		for(int i=0;i<names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
