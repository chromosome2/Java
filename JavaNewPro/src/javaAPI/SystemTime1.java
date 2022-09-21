package javaAPI;

public class SystemTime1 {
	public static void main(String[] args) {
		long time1=System.currentTimeMillis();
		System.out.println(time1);
		int sum=0;
		for(int i=1;i<10000000; i++) {
			sum+=i;
		}
		long time2=System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(time2-time1);
	}
}
