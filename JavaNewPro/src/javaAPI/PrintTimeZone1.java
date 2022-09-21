package javaAPI;

import java.util.TimeZone;

public class PrintTimeZone1 {

	public static void main(String[] args) {
		String[] TimeZoneID=TimeZone.getAvailableIDs();
		for(String tz:TimeZoneID) {
			System.out.println(tz);
		}

	}

}
