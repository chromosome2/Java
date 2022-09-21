package javaAPI;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int[] scores= {7,96,80,90,83};
		Arrays.sort(scores);
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		int index=Arrays.binarySearch(scores, 96);
		System.out.println(index);
		String[] names={"¹Ú","È«","ÀÌ"};
		Arrays.sort(names);
		index=Arrays.binarySearch(names, "È«");
		System.out.println(index);
		

	}

}
