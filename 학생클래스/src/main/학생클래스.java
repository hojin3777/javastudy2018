package main;

class Student{
	String name;
	int num;
	String major;
	int grade;
	int score;
	
	Student(){}
	Student(String name, int num, String major, int grade, int score){
		this.name=name;
		this.num=num;
		this.major=major;
		this.grade=grade;
		this.score=score;
	}
	
	public void print() {
		System.out.println(name+": "+num+"�� "+major+"�� "+grade+"�г� "+"����: "+score);
	}
	public String printname() {
		return name;
	}
	public String getname(String name) {
		return this.name=name;
	}
}

class hakbu extends Student{
	String crew;
	
	hakbu(){}
	hakbu(String name, int num, String major, int grade, int score, String crew){
		this.name=name;
		this.num=num;
		this.major=major;
		this.grade=grade;
		this.score=score;
		this.crew=crew;
	}
	public void print() {
		System.out.println(name+": "+num+"�� "+major+"�� "+grade+"�г� "+"����: "+score);
		System.out.println("�Ҽ� ���Ƹ�: "+crew);
	}
}

class graduate extends Student{
	boolean assistant;
	boolean money;
	
	graduate(){}
	graduate(String name, int num, String major, int grade, int score, boolean assistant, boolean money){
		this.name=name;
		this.num=num;
		this.major=major;
		this.grade=grade;
		this.score=score;
		this.assistant=assistant;
		this.money=money;
	}
	public void print() {
		System.out.println(name+": "+num+"�� "+major+"�� "+grade+"�г� "+"����: "+score);
		System.out.println("����Ȱ������: "+assistant+" ���б� ����: "+money);
	}
}



public class �л�Ŭ���� {
	public static void main(String[] args) {
		
		Student s1 = new Student("��ȣ��",1409,"����",2,3);
		Student d1 = new hakbu("��ȣ��",1409,"����",2,3,"������");
		Student f1 = new graduate("��ȣ��",1409,"����",2,3,true,false);
		
		System.out.println(s1.printname());
		System.out.println(s1.getname("����"));
		s1.print();
		d1.print();
		f1.print();
		
	}
}
