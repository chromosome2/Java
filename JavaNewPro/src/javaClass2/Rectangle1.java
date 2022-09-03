package javaClass2;

public class Rectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Rectangle nemo=new Rectangle(5,4);
			System.out.println(nemo.getArea());
			nemo.setHeight(-5);
			System.out.println(nemo.getArea());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
