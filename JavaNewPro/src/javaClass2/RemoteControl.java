package javaClass2;

public interface RemoteControl {
	public int MAX_VOL=10;
	public int MIN_VOL=0;
	
	public void turnOn();
	public void turnOff();
	void setVol(int Vol);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
