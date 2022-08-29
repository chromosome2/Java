
public class JavaEx {

	public static void main(String[] args) {
		int j;
		/*for (int i=1; i<11; i++) {
			for(j=1; j<=10; j++) {
				System.out.println(i +"+"+ j +"="+ (i+j));
				if((i+j)==15) {
					break;
				}
			}
			if(i+j==15 && j!=11) {
				break;
			}
			
		}*/
		Outer:for(int i=1;i<=10; i++) {
				for(j=1; j<=10; j++) {
					System.out.println(i+"+"+j+"="+(i+j));
					if(i+j==15) {
						break Outer;
					}
				}
		}
	}

}
