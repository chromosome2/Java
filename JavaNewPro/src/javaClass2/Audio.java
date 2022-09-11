package javaClass2;

public class Audio implements RemoteControl{
	private int vol;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
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
		System.out.println("현재 오디오의 볼륨 : "+this.vol);
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("Audio 무음 처리");
		}else {
			System.out.println("Audio 무음 해제");
		}
	}
	
}
