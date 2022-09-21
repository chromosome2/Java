package javaAPI;

public class String7 {

	public static void main(String[] args) {
		String text="È«±æµ¿, ±èÃ¶¼ö, ¹ÚÂùÈ£, ÀÌ¿µÈñ, Á¶¼öÁø";
		String[] names=text.split(",");
		for(int i=0;i<names.length; i++) {
			System.out.println(names[i]);
		}
		String text2="È«±æµ¿, ±èÃ¶¼ö$¹ÚÂùÈ£,ÀÌ¿µÈñ^¹ÚÁö¼º";
		String[] names2=text2.split(",|$|^");
		for(String na:names2) {
			System.out.println(na);
		}

	}

}
