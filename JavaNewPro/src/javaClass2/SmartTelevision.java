package javaClass2;

public class SmartTelevision implements RemoteControl, Searchable{
	private int vol;
	
	@Override
	public void turnOn() {
		System.out.println("Turn on smartTV");
	}

	@Override
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Turn off smartTV");
		
	}

	@Override
	public void setVol(int Vol) {
		if(vol>RemoteControl.MAX_VOL) {
			this.vol=RemoteControl.MAX_VOL;
		}else if(vol<RemoteControl.MIN_VOL) {
			this.vol=RemoteControl.MIN_VOL;
		}else {
			this.vol=vol;
		}
		System.out.println("���� TV ���� : "+this.vol);
	}
}
