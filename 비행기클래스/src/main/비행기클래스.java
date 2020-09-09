package main;

class Plane{
	String name;
	String model;
	int seat;
	
	Plane(){}
	Plane(String name){
		this.name=name;
	}
	Plane(String name, String model){
		this(name);
		this.model=model;
	}
	Plane(String n, String m, int s){
		name = n;
		model = m;
		seat = s;
	}
	public void print() {
		System.out.println(name);
		System.out.println(model);
		System.out.println(seat);
	}
	
	
}

public class 비행기클래스 {
	public static void main(String[] args) {
		
		Plane A123 = new Plane();
		Plane B123 = new Plane("대한항공");
		Plane C123 = new Plane("대한항공1","A380");
		Plane D123 = new Plane("대한항공2","A480",134);
		
		A123.print();
		B123.print();
		C123.print();
		D123.print();
		
		/*
		System.out.println(A123.name);
		System.out.println(B123.name);
		System.out.println(C123.name);
		System.out.println(C123.model);
		System.out.println(D123.name);
		System.out.println(D123.model);
		System.out.println(D123.seat);
		*/
	}
}
