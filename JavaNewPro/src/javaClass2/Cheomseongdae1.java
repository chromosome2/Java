package javaClass2;

public class Cheomseongdae1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheomseongdae cheom1=Cheomseongdae.getInstance();
		Cheomseongdae cheom2=Cheomseongdae.getInstance();
		if(cheom1==cheom2) {
			System.out.println("∞∞¿∫ √∑º∫¥Î ∞¥√º¿‘¥œ¥Ÿ.");
		}else {
			System.out.println("¥Ÿ∏• √∑º∫¥Î ∞¥√º¿‘¥œ¥Ÿ.");
		}
		cheom1.history();
		cheom2.history();
	}

}
