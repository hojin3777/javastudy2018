//2408김호진
package main;

class Circle{
	double radius;
	String color;
	
	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
}

class Cylinder extends Circle{
	double height;
	
	Cylinder(){}
	Cylinder(double radius){
		this.radius=radius;
	}
	Cylinder(double radius, double height){
		this(radius);
		this.height=height;
	}
	
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea()*getHeight();
	}
}

public class 써클클래스 {
	public static void main(String[] args) {
		
		Cylinder obj1 = new Cylinder(3.0, 5.0);
		System.out.println(obj1.getVolume());
		
	}
}
