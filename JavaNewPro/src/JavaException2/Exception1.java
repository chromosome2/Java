package JavaException2;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int num1=10;
			int num2=1;
			String str="안녕";
			
			int[] nums= {10,20,30};
			int result=(num1/num2);
			String data1="200";
			String data2="s300";
			
			System.out.println("계산결과:"+result);
			System.out.println(str.toString());//toString : str의 번지에 찾아가서 String을 찾아오는것.
			//str에 null이라 주소를 찾아갈수가 없음. 그래서 오류나는것. null은 주소를 차단시킴.
			System.out.println(nums[0]);
			System.out.println(Integer.parseInt(data1)+Integer.parseInt(data2));
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("0으로 나눌 수 없거나 문자를 참조하고 있지 않습니다.");
		}catch(Exception e) {
			System.out.println("개발자에게 문의하세요(010-1111-11111)-"+e.getMessage());
		}
		
		finally {
			System.out.println("값을 다시 확인하고 실행하세요.");
		}

	}

}
