package javaClass2;

public class PhysicalInfo1 {

	public static void main(String[] args) {
		PhysicalInfo sujin=new PhysicalInfo("조수진",25,167.5f,56.1f);
		printPhysicalInfo(sujin);
		sujin.update(5);
		printPhysicalInfo(sujin);
		sujin.update(6, 176.5f, 70);
		printPhysicalInfo(sujin);
		sujin.age=30;
		printPhysicalInfo(sujin);
	}
	static void printPhysicalInfo (PhysicalInfo obj) {
		System.out.println(obj.name +"의 정보");
		System.out.println(obj.age+"살");
		System.out.println(obj.height);
		System.out.println(obj.weight);
		System.out.println("");
	}

}
