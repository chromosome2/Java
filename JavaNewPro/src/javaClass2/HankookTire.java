package javaClass2;

public class HankookTire extends Tire{
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		accmulatedRotation++;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location+"Hankook Tire�� ���� : "+(maxRotation-accmulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println(location+"�ѱ�Ÿ�̾ ������ ���ؼ� ��ũ �����ϴ�.");
			return false;
		}
	}

}
