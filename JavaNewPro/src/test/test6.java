package test;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=5.0;
		double y=3.0;
		
		double z=x%y;
		
		if(Double.isNaN(z)) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}else {
			System.out.println(z+10);
		}
	}

}
