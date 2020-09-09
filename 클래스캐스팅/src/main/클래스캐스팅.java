package main;
class CarB{
	String name="차";
	String print() {
		return "나는"+name+"이다.";
	}
}
class Bus extends CarB{
	String name="버스";
	String print() {
		return "차의 종류는 "+name+"이다.";
	}
}
class TruckC extends CarB{
	String name="트럭";
	String print() {
		return "차의 종류는 "+name+"이다.";
	}
}


public class 클래스캐스팅 {
	public static void main(String[] args) {
		
		CarB myCar, yourCar;
		Bus myBus, yourBus;
		TruckC myTruck, yourTruck;
		
		myCar = new CarB();
		myBus = new Bus();
		myTruck = new TruckC();
		
		System.out.println(myCar.print());
		System.out.println(myBus.print());
		System.out.println(myTruck.print());
		
		yourCar = myBus; //업캐스팅
		//Car yourCar=new bus();
		yourBus = (Bus)yourCar;
		System.out.println(yourBus.print());
		
		yourCar = myTruck;
		yourTruck = (TruckC)yourCar;
		System.out.println(yourTruck.print());
		
		System.out.println(myBus);
		System.out.println(yourBus);
		System.out.println(myTruck);
		System.out.println(yourTruck);
	}
}
