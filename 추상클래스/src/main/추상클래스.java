package main;

abstract class Shape{
	abstract double getArea();
	abstract double getCircum();
	int number() {
		return 1;
	}
}
class ACircle extends Shape{
	double getArea() {
		return 3.14*2*2;
	}
	double getCircum() {
		return 2*3.14*2;
	}
	int number() {
		return 1;
	}
}
class Square extends Shape{
	double getArea() {
		return 3*5;
	}
	double getCircum() {
		return 3*3.14*5;
	}
}

public class 추상클래스 {
	public static void main(String[] args) {
		
		
	}
}
