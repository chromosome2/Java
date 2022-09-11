package javaClass2;

public interface RemoteControl {
	public int MAX_VOL=10;
	public int MIN_VOL=0;
	
	public void turnOn();
	public void turnOff();
	void setVol(int Vol);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
