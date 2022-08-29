import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		while(true) {
			num=(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==4) {
				System.out.println("END");
				break;
			}
		}
		/*int num=0;
		while(num!=4) {
			num=(int)(Math.random()*6)+1;
			System.out.println(num);
		}
		/*byte b1=50;
		byte b2=30;
		byte result=(byte)(b1+b2);
		System.out.println(result);
		int re=b1+b2;
		System.out.println(re);
		/*Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		if(value<Byte.MIN_VALUE || value>Byte.MAX_VALUE) {
			System.out.println("바이트 타입으로 변환할 수 없습니다.");
			System.out.println("값이 byte타입에 담기에는 너무 커요.");
		}else {
			byte bval=(byte)value;
			System.out.println(bval);
		}
		System.out.println(Byte.MIN_VALUE+","+ Byte.MAX_VALUE);
		/*char a='A';
		int b=a;
		System.out.println(b);
		int val=299;
		byte bval=(byte)val;
		System.out.println(bval);
		/*double dval=300;
		int va=(int)dval;
		int num=66;
		byte val=(byte)num;
		char ch=(char)val;
		System.out.println(ch);
		System.out.println(val);
		/*boolean stop=false;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		/*float num=2.12f;
		System.out.println(num);
		/*long num=314783647L;
		System.out.println(num);
		char ch=44033;
		System.out.println(ch);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("점수는 ??");
		int score=sc.nextInt();
		if(score>=0 && score<=100) {
			System.out.println("당신의 점수는 "+score+"점 입니다.");
			switch(score/10) {
			case 10:
			case 9:
				System.out.println("A등급");
				break;
			case 8:
				System.out.println("B등급");
				break;
			case 7:
				System.out.println("C등급");
				break;
			case 6:
				System.out.println("D등급");
				break;
			default:
				System.out.println("F등급");
				break;
			}
		}else {
			System.out.println("측정 불가");
		}
		/*char fruit='G';
		switch(fruit) {
			case 'A':
			case 'a':
				System.out.println("apple은 개당 1200원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("banana은 개당 4200원입니다.");
				break;
			case 'G':
			case 'g':
				System.out.println("grape은 개당 7200원입니다.");
				break;
			default:
				System.out.println("없는 과일입니다.");
				break;
		}
		/*Scanner sc=new Scanner(System.in);
		System.out.println("여행지를 선택하세요. (1.미주 2.유럽 3.동남아)>>");
		int choice=sc.nextInt();
		switch(choice) {
			case 1: 
				System.out.println("1층 안내데스크로 가세요.");
				break;
			case 2:
				System.out.println("2층 안내데스크로 가세요.");
				break;
			case 3:
				System.out.println("별관 안내데스크로 가세요.");
				break;
			default:
				System.out.println("제대로 선택해주세요.");
		}
		
		/*Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		
		int man=money/10000;
		money=money%10000;
		int ochun=money/5000;
		money=money%5000;
		int chun=money/1000;
		money=money%1000;
		int oback=money/500;
		money=money%500;
		int back=money/100;
		money=money%100;
		int sip=money/10;
		money=money%10;
		
		System.out.println("만원은 "+man);
		System.out.println("오천원은 "+ochun);
		System.out.println("천원은 "+chun);
		System.out.println("오백원은 "+oback);
		System.out.println("백원은 "+back);
		System.out.println("십원은 "+sip);
		/*int kor=70;
		int eng=55, mat=72;
		int total=kor+eng+mat;
		double avg=(int)((total/3.)*100)/100.;
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		/*double num=5/2;
		System.out.println(num);
		/*Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>100) System.out.println("잘못 입력하셨습니다.");
		else if(score>=80) System.out.println("합격입니다.");
		else if(score>=70) System.out.println("대기자입니다.");
		else System.out.println("불합격입니다.");
		System.out.println("수고하셨습니다.");
		/*Scanner sc=new Scanner(System.in);
		System.out.println("점수 입력 >>");
		int score=sc.nextInt();
		
		if(score>100) {
			System.out.println("잘못 입력했습니다.");
		}else if(score>=90) {
			System.out.println("A등급입니다.");
		}else if(score>=80) {
			System.out.println("B등급입니다.");
		}else if(score>=70) {
			System.out.println("C등급입니다.");
		}else if(score>=60) {
			System.out.println("D등급입니다.");
		}else {
			if(score>=0) {
				System.out.println("F등급입니다.");
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		/*int foot=0;
		OuterA:for(int tazo=0; tazo<=17; tazo++) {
			for(int pig=17; pig>=0; pig--) {
				foot= tazo*2+pig*4;
				if(foot==56 && tazo+pig==17) {
					System.out.println("타조는 "+tazo+"마리, 돼지는 "+pig+"마리");
					break OuterA;
				}
			}
		}
		/*for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		/*int max=15;
		for(int i=1; i<=max; i++) {
			for(int j=max-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/*int i=1;
		int sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		int num=1;
		do {
			System.out.println(num);
			num++;
		}while(num>=10);
		/*int sum=0;
		int i=1;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("1부터 100까지의 합은 "+sum);
		/*int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합은 "+sum+"입니다.");
		while(true) {
			int a=(int)(Math.random()*6+1);
			int b=(int)(Math.random()*6+1);
			System.out.println("("+a+","+b+")");
			if(a+b==5) {
				break;
			}
		}
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i==j) {
					continue;
				}
					System.out.println(i+","+j);
				
			}
		}
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합은 "+ sum);*/

	}

}
