package javaClass2;

public class Calculator {
	int total(int kor, int eng, int mat) {
		int hap=kor+eng+mat;
		return hap;
	}
	
	double average(int kor, int eng, int mat) {
		double avg=total(kor,eng,mat)/3.0;
		return avg;
	}
	
	double average(int ...kor) {
		int sum=0;
		for(int i=0; i<kor.length; i++) {
			sum+=kor[i];
		}
		return (double)sum/kor.length;
	}
}
