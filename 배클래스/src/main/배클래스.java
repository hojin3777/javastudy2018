package main;

class Ship{ //����Ŭ����
	public String Name() { //�޼ҵ�
		return "�� �̸�";
	}
}
class MyShip extends Ship { //����Ŭ���� ��ӹ޴� ����Ŭ����
	public String Name() { //�������̵�
		return "�Ƿηι�";
	}
}
class YourShip extends Ship { //����Ŭ������ ��ӹ޴� ����Ŭ����
	public String Name() { //�������̵�
		return "�����";
	}
}
class ShipName{ //�Ϲ�Ŭ����
	public static void search(Ship s) { //Ship Ÿ���� ��ü�� �޴� �޼ҵ�
		if(s instanceof MyShip) { //�Ű������� Ŭ���� Ÿ�� ��
			MyShip b = (MyShip)s; //�ٿ�ĳ����(Ŭ������ ǥ��)
			System.out.println("MyShip �̸� "+b.Name()); //Name �޼ҵ� ����(�������̵�)
		}
		else if(s instanceof YourShip) {
			YourShip b = (YourShip)s;
			System.out.println("YourShip �̸� "+b.Name());
		}
	}
}


public class ��Ŭ���� {
	public static void main(String[] args) {
		
		Ship my = new MyShip(); //��ĳ���� ��ü ����
		Ship you = new YourShip();
		ShipName.search(my); //Ŭ���������� �޼ҵ� ȣ��, ����.
		ShipName.search(you);
		
	}
}
