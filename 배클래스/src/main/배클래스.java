package main;

class Ship{ //슈퍼클래스
	public String Name() { //메소드
		return "배 이름";
	}
}
class MyShip extends Ship { //슈퍼클래스 상속받는 서브클래스
	public String Name() { //오버라이딩
		return "뽀로로배";
	}
}
class YourShip extends Ship { //슈퍼클래스를 상속받는 서브클래스
	public String Name() { //오버라이딩
		return "통통배";
	}
}
class ShipName{ //일반클래스
	public static void search(Ship s) { //Ship 타입의 객체를 받는 메소드
		if(s instanceof MyShip) { //매개변수와 클래스 타입 비교
			MyShip b = (MyShip)s; //다운캐스팅(클래스명 표시)
			System.out.println("MyShip 이름 "+b.Name()); //Name 메소드 실행(오버라이딩)
		}
		else if(s instanceof YourShip) {
			YourShip b = (YourShip)s;
			System.out.println("YourShip 이름 "+b.Name());
		}
	}
}


public class 배클래스 {
	public static void main(String[] args) {
		
		Ship my = new MyShip(); //업캐스팅 객체 생성
		Ship you = new YourShip();
		ShipName.search(my); //클래스명으로 메소드 호출, 대입.
		ShipName.search(you);
		
	}
}
