package main;
class CarB{
	String name="��";
	String print() {
		return "����"+name+"�̴�.";
	}
}
class Bus extends CarB{
	String name="����";
	String print() {
		return "���� ������ "+name+"�̴�.";
	}
}
class TruckC extends CarB{
	String name="Ʈ��";
	String print() {
		return "���� ������ "+name+"�̴�.";
	}
}


public class Ŭ����ĳ���� {
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
		
		yourCar = myBus; //��ĳ����
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
