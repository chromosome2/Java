package javaClass2;

public class MessageListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("메시지를 보냈습니다. 또롱");
	}
}
