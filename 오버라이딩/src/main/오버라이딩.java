package main;

class Cars {
	String carName;
	String color;
	int velocity;
	
	public void speedUp() {
		velocity += 5;
		System.out.println("속도는" + velocity);
	}
	public void speedDown() {
		velocity -= 5;
		System.out.println("속도는" + velocity);
	}
}
class Truck extends Cars{
	int ton;
	
	public void speedUp() {
		velocity += 10;
		System.out.println("속도는" + velocity);
	}
	//재정의는 오버라이딩
}

class Animal{
	public void print() {
		System.out.println("하이");
	}
	public void test(int x,int y) {
		return;
	}
	public void test(double x, double y) {
		return;
	}
	//위 경우 오버로딩
}


public class 오버라이딩 {
	public static void main(String[] args) {
		
		Truck t1=new Truck();
		t1.speedUp();
		t1.speedDown();
		
	}
}
