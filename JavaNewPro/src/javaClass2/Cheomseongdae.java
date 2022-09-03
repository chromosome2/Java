package javaClass2;

public class Cheomseongdae {
	private static Cheomseongdae cheomseongdae=new Cheomseongdae();
	
	private Cheomseongdae() {
		
	}
	
	static  Cheomseongdae getInstance() {
		return cheomseongdae;
	}
	
	void history() {
		System.out.println("동양에서 가장 오래된 관측대");
	}
}
