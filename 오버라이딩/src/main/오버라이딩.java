package main;

class Cars {
	String carName;
	String color;
	int velocity;
	
	public void speedUp() {
		velocity += 5;
		System.out.println("�ӵ���" + velocity);
	}
	public void speedDown() {
		velocity -= 5;
		System.out.println("�ӵ���" + velocity);
	}
}
class Truck extends Cars{
	int ton;
	
	public void speedUp() {
		velocity += 10;
		System.out.println("�ӵ���" + velocity);
	}
	//�����Ǵ� �������̵�
}

class Animal{
	public void print() {
		System.out.println("����");
	}
	public void test(int x,int y) {
		return;
	}
	public void test(double x, double y) {
		return;
	}
	//�� ��� �����ε�
}


public class �������̵� {
	public static void main(String[] args) {
		
		Truck t1=new Truck();
		t1.speedUp();
		t1.speedDown();
		
	}
}
