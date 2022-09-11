package javaClass2;

public class Television1 {

	public static void main(String[] args) {
		RemoteControl rc;
		rc=new Television();
		rc.turnOn();
		rc.setVol(3);
		rc.setVol(-3);
		rc.setVol(15);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		rc=new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.setVol(3);
		rc.setVol(-3);
		rc.setVol(15);
	}

}
