package main;

class Car{
	String name;
	int year;
	int price;
}

class Blog{
	String blogname;
	int visit;
}

class mall{
	String shopname;
	int visit;
}

public class Ŭ�������� {
	public static void main(String[] args) {
		
		Car K9 = new Car();
		K9.name = "K9";
		K9.year = 2016;
		K9.price = 50000000;
		
		Blog kdmhs = new Blog();
		kdmhs.blogname = "�������";
		kdmhs.visit = 10000;
		
		mall danawa = new mall();
		danawa.shopname = "�ٳ���";
		danawa.visit =1000000;
		
		System.out.println(K9.name);
		System.out.println(K9.year);
		System.out.println(K9.price);
		System.out.println(kdmhs.blogname);
		System.out.println(kdmhs.visit);
		System.out.println(danawa.shopname);
		System.out.println(danawa.visit);
	}
}
