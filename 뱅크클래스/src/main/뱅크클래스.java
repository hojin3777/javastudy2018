package main;

class bank{
	String name;
	int in;
	int out;
	int money;
	
	bank(){}
	bank(String name, int money){
		this.name=name;
		this.money=money;
	}
	
	public void deposit(int in) {
		if(in<0)
			System.out.println("�߸��� �Է��Դϴ�");
		else {
			System.out.println(name+" ���࿡ "+in+"���� �����մϴ�");
			money=in+money;
			System.out.println("�ܾ�: "+money);
		}
	}
	
	public void withdraw(int out) {
		if(out<0)
			System.out.println("�߸��� �Է��Դϴ�");
		else {
			System.out.println(name+" ���࿡�� "+out+"���� ����մϴ�");
			money=money-out;
			System.out.println("�ܾ�: "+money);
		}
	}
}



public class ��ũŬ���� {
	public static void main(String[] args) {
		
		bank ���� = new bank("����", 50000);
		bank ���� = new bank("����", 100000);
		bank ���� = new bank("����", 200000);
	
		����.deposit(50000);
		����.withdraw(70000);
		����.deposit(17000);
		����.withdraw(98000);
		����.withdraw(-3000);
	}
}
