package javaClass2;

public class Television implements RemoteControl{
	private int vol;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVol(int vol) {
		if(vol>RemoteControl.MAX_VOL) {
			this.vol=RemoteControl.MAX_VOL;
		}
		else if(vol<RemoteControl.MIN_VOL) {
			this.vol=RemoteControl.MIN_VOL;
		}else {
			this.vol=vol;
		}
		System.out.println("���� TV ���� : "+this.vol);
		
	}

}
