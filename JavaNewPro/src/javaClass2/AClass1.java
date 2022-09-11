package javaClass2;

public class AClass1 {

	public static void main(String[] args) {
		AClass aa=new AClass();
		AClass.BClass bb=aa.new BClass();
		bb.bField=10;
		bb.bMethod();
		aa.aMethod();

	}

}
