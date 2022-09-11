package javaClass2;

public class Television implements RemoteControl{
	private int vol;

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
		
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
		System.out.println("ÇöÀç TV º¼·ý : "+this.vol);
		
	}

}
