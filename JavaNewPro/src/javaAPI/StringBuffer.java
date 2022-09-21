package javaAPI;

public class StringBuffer {

	public static void main(String[] args) {
		String str="korea";
		str+=" fighting";
		str+=" corona";
		System.out.println(str);
		
		StringBuilder sb=new StringBuilder();
		sb.append("korea");
		sb.append("fighting");
		sb.append("corona");
		
		sb.insert(5, "==>");
		System.out.println(sb);
		System.out.println(sb.toString());
		sb.replace(6, 16, "remember");
		System.out.println(sb);
		str=str.replace("fighting","remember");
		System.out.println(str);
		sb.delete(14, 20);
		System.out.println(sb.toString());
		String result=sb.toString();
		System.out.println(result);

	}

}
