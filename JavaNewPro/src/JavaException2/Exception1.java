package JavaException2;

public class Exception1 {

	public static void main(String[] args) {
		try {
			int num1=10;
			int num2=1;
			String str="�ȳ�";
			
			int[] nums= {10,20,30};
			int result=(num1/num2);
			String data1="200";
			String data2="s300";
			
			System.out.println("�����:"+result);
			System.out.println(str.toString());//toString : str�� ������ ã�ư��� String�� ã�ƿ��°�.
			//str�� null�̶� �ּҸ� ã�ư����� ����. �׷��� �������°�. null�� �ּҸ� ���ܽ�Ŵ.
			System.out.println(nums[0]);
			System.out.println(Integer.parseInt(data1)+Integer.parseInt(data2));
		}catch(ArithmeticException | NullPointerException e) {
			System.out.println("0���� ���� �� ���ų� ���ڸ� �����ϰ� ���� �ʽ��ϴ�.");
		}catch(Exception e) {
			System.out.println("�����ڿ��� �����ϼ���(010-1111-11111)-"+e.getMessage());
		}
		
		finally {
			System.out.println("���� �ٽ� Ȯ���ϰ� �����ϼ���.");
		}

	}

}
