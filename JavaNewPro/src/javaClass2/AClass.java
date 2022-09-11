package javaClass2;

public class AClass {
	public AClass() {
		System.out.println("AClass啊 积己凳.");
	}
	class BClass{
		int bField;
		public BClass() {
			System.out.println("BClass啊 积己凳.");
		}
		void bMethod() {
			
		}
	}
	
	static class CClass{
		int cField;
		static int cField2;
		public CClass() {
			System.out.println("CClass啊 积己凳.");
		}
		static void cMethod() {
			
		}
		void cMethod2() {
			
		}
	}
	
	void aMethod() {
		class DClass{
			int dField;
			public DClass() {
				System.out.println("DClass啊 积己凳.");
			}
			void dMethod() {
				
			}
		}
		DClass dClass=new DClass();
		dClass.dField=10;
		dClass.dMethod();
	}
}
