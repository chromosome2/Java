package javaClass2;

public class Button1 {

	public static void main(String[] args) {
		Button button=new Button();
		button.setOnClickListener(new CallListener());
		button.touch();
		button.setOnClickListener(new MessageListener());
		button.touch();
	}

}
