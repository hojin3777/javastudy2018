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
			System.out.println("잘못된 입력입니다");
		else {
			System.out.println(name+" 은행에 "+in+"원을 저금합니다");
			money=in+money;
			System.out.println("잔액: "+money);
		}
	}
	
	public void withdraw(int out) {
		if(out<0)
			System.out.println("잘못된 입력입니다");
		else {
			System.out.println(name+" 은행에서 "+out+"원을 출금합니다");
			money=money-out;
			System.out.println("잔액: "+money);
		}
	}
}



public class 뱅크클래스 {
	public static void main(String[] args) {
		
		bank 신한 = new bank("신한", 50000);
		bank 국민 = new bank("국민", 100000);
		bank 제일 = new bank("제일", 200000);
	
		신한.deposit(50000);
		국민.withdraw(70000);
		제일.deposit(17000);
		제일.withdraw(98000);
		국민.withdraw(-3000);
	}
}
