package javaAPI;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random rand=new Random();
		Random rand1=new Random(5);
		Random rand3=new Random(5);
		for(int i=1; i<6; i++) {
			int lotto=rand1.nextInt(45)+1;
			System.out.println(lotto);
		}
		/*for(int i=1;i<6; i++) {
			int a=(int)(Math.random()*45)+1;
			System.out.println(a);
		}*/
		
		

	}

}
