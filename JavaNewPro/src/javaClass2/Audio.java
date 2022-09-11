package javaClass2;

public class Audio implements RemoteControl{
	private int vol;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");
		
	}

	@Override
	public void setVol(int vol) {
		if(vol>RemoteControl.MAX_VOL) {
			this.vol=RemoteControl.MAX_VOL;
		}else if(vol<RemoteControl.MIN_VOL) {
			this.vol=RemoteControl.MIN_VOL;
		}else {
			this.vol=vol;
		}
		System.out.println("���� ������� ���� : "+this.vol);
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("Audio ���� ó��");
		}else {
			System.out.println("Audio ���� ����");
		}
	}
	
}
