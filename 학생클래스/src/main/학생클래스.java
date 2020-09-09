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
		System.out.println(name+": "+num+"번 "+major+"과 "+grade+"학년 "+"학점: "+score);
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
		System.out.println(name+": "+num+"번 "+major+"과 "+grade+"학년 "+"학점: "+score);
		System.out.println("소속 동아리: "+crew);
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
		System.out.println(name+": "+num+"번 "+major+"과 "+grade+"학년 "+"학점: "+score);
		System.out.println("조교활동여부: "+assistant+" 장학금 유무: "+money);
	}
}



public class 학생클래스 {
	public static void main(String[] args) {
		
		Student s1 = new Student("김호진",1409,"웹플",2,3);
		Student d1 = new hakbu("김호진",1409,"웹플",2,3,"가우디움");
		Student f1 = new graduate("김호진",1409,"웹플",2,3,true,false);
		
		System.out.println(s1.printname());
		System.out.println(s1.getname("기모띠"));
		s1.print();
		d1.print();
		f1.print();
		
	}
}
