package test;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum=0;
		int tot=0;
		for(int i=0;i<array.length; i++) {
			for(int j=0;j<array[i].length; j++) {
				sum+= array[i][j];
				tot++;
			}
		}
		double avg=sum/(double)tot;
		System.out.println(sum);
		System.out.println(avg);
	}

}
