package javaClass2;

public class PhysicalInfo {
	String name;
	int age;
	float weight, height;
	
	public PhysicalInfo(String name, int age, float weight, float height) {
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	void update(int age) {
		this.age=age;
	}
	void update(int age, float height) {
		this.age=age;
		this.height=height;
	}
	void update(int age, float height, float weight) {
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
}
