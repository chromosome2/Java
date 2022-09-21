package javaAPI;

import java.text.DecimalFormat;

public class Format1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df;
		double num1=23.526124;
		df=new DecimalFormat("0.00");
		System.out.println(df.format(num1));
		
		int num2=500;
		df=new DecimalFormat("0,000¿ø");
		System.out.println(df.format(num2));
		df=new DecimalFormat("#,###¿ø");
		System.out.println(df.format(num2));
		
		double num3=0.25;
		df=new DecimalFormat("0.00%");
		System.out.println(df.format(num3));
		df=new DecimalFormat("#.##%");
		System.out.println(df.format(num3));

	}

}
