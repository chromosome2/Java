package javaAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		int myNum[]=new int[6];
		Random rand1=new Random(5);
		for(int i=0;i<6;i++) {
			myNum[i]=rand1.nextInt(45)+1;
			System.out.print(myNum[i]+" ");
		}
		System.out.println();
		int lottoNum[]=new int[6];
		Random rand2=new Random(3);
		for(int i=0;i<6; i++) {
			lottoNum[i]=rand2.nextInt(45)+1;
			System.out.print(lottoNum[i]+" ");
		}
		Arrays.sort(myNum);
		Arrays.sort(lottoNum);
		boolean result=Arrays.equals(myNum, lottoNum);
		if(result) {
			System.out.println("1µî");
		}else {
			System.out.println("¾Æ´Ô");
		}

	}

}
