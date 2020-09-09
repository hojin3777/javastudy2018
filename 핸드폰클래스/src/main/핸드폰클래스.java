package main;
//2408 ��ȣ��
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
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
		this.num=num;
	}
	public void print(){
		System.out.println("������: "+name+" ��ȣ: "+num+" ����⵵: "+year);
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
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
		this.num=num;
		this.corp=corp;
	}
	public void print(){
		System.out.println("������: "+name+" ��ȣ: "+num+" ����⵵: "+year+" ȸ���: "+corp);
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
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
		this.num=num;
		this.net=net;
	}
	public void print(){
		System.out.println("������: "+name+" ��ȣ: "+num+" ����⵵: "+year+" ���ͳ�����: "+net);
	}
}

public class �ڵ���Ŭ���� {
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
