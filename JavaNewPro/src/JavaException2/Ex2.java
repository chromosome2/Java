package JavaException2;

public class Ex2 {

	public static void main(String[] args) {
		String[] st= {"10","2a","30","2","1"};
		int val=0;
		for(int i=0;i<=st.length;i++) {
			try {
				val=Integer.parseInt(st[i]);
			}catch(NumberFormatException e) {
				System.out.println("숫자변환 노");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}finally {
				System.out.println(val);
			}
		}

	}

}
