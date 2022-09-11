package javaClass2;

public class Animal1 {

	public static void main(String[] args) {
		Tiger tiger1=new Tiger();
		Eagle eagle1=new Eagle();
		tiger1.age=2;
		tiger1.name="호돌이";
		eagle1.name="이글스";
		eagle1.home="소나무둥지";
		System.out.println(tiger1.name+"는 "+tiger1.age+"살 입니다.");
		tiger1.voice();
		tiger1.move();
		System.out.println(eagle1.name+"는 "+eagle1.home+"에 삽니다.");
		eagle1.voice();
		eagle1.move();
	}

}
