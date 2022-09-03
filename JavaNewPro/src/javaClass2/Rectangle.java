package javaClass2;

public class Rectangle {
	private int height, width;
	
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	int getArea() {
		return width*height;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) throws Exception{
		if(width<=0) {
			throw new Exception("너비는 양수여야함.");
		}
		this.height = height;
	}

}
