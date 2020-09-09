package main;
//2408 김호진
class Phone{
	String name;
	int num;
	int year;
	
	Phone(){}
	Phone(String name, int num, int year){
		this.name=name;
		if (year>=1900)
			this.year=year;
		else
			System.out.println("올바르지 않은 연도입니다.");
		this.num=num;
	}
	public void print(){
		System.out.println("기종명: "+name+" 번호: "+num+" 생산년도: "+year);
	}
}
class SmartPhone extends Phone {
	String corp;
	
	SmartPhone(){}
	SmartPhone(String name, int num, int year, String corp){
		this.name=name;
		if (year>=1900)
			this.year=year;
		else
			System.out.println("올바르지 않은 연도입니다.");
		this.num=num;
		this.corp=corp;
	}
	public void print(){
		System.out.println("기종명: "+name+" 번호: "+num+" 생산년도: "+year+" 회사명: "+corp);
	}
}
class FeaturePhone extends Phone{
	boolean net;
	
	FeaturePhone(){}
	FeaturePhone(String name, int num, int year, boolean net){
		this.name=name;
		if (year>=1900)
			this.year=year;
		else
			System.out.println("올바르지 않은 연도입니다.");
		this.num=num;
		this.net=net;
	}
	public void print(){
		System.out.println("기종명: "+name+" 번호: "+num+" 생산년도: "+year+" 인터넷접속: "+net);
	}
}

public class 핸드폰클래스 {
	public static void main(String[] args) {
		
		Phone S9 = new SmartPhone("S9",123456789,2018,"Samsung");
		Phone yuna = new FeaturePhone("yuna",987654231,2009,false);
		//Phone color = new Phone("color",123,1887);
		//Phone side = new Phone("side",456,1997);
		
		S9.print();
		yuna.print();
		//color.print();
		//side.print();
		
	}
}
