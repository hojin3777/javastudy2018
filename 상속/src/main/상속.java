package main;

class Student{
	String name;
	int number;
	
	Student(){}
	Student(String name, int number){
		this.name=name;
		this.number=number;
	}
	public void print() {
		System.out.println(number+name);
	}
}

class School extends Student {
	String major;
	
	School(){}
	School(String name, int number, String major){
		this.name=name;
		this.number=number;
		this.major=major;
	}
}

public class »ó¼Ó {
	public static void main(String[] args) {
		
		School hojin= new School("±èÈ£Áø", 2408, "WC");
		
		hojin.print();
		System.out.println(hojin.major);
		
	}
}
