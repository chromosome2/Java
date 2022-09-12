package javaAPI;

public class String5 {

	public static void main(String[] args) {
		String ssn="921023-1368744";
		
		String star=ssn.substring(7);
		for(int i=0; i<=star.length()-1; i++) {
			star=star.replace(star.charAt(i), '*');
		}
		System.out.println(ssn.substring(0,7)+star);
		
		
	}

}
