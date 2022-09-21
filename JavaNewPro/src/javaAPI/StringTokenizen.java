package javaAPI;

import java.util.StringTokenizer;

public class StringTokenizen {

	public static void main(String[] args) {
		String text="πŸ∫∏,∏€√ª¿Ã,∏ªπÃ¿ﬂ,«ÿªÔ,∂À∞≥";
		StringTokenizer st=new StringTokenizer(text,",");
		int tokens=st.countTokens();
		/*for(int i=0;i<tokens; i++) {
			String str=st.nextToken();
			System.out.println(str);
		}*/
		while(st.hasMoreTokens()) {
			String str=st.nextToken();
			System.out.println(str);
		}
		
		String[] nText=text.split(",");
		for(int i=0;i<nText.length;i++) {
			System.out.println(nText[i]);
		}

	}

}
