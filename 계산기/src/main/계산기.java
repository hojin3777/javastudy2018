package main;
import java.util.Scanner;

public class ���� {
	public static void main(String[] args) {
		
		int a,n1,n2;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("����1 �Է�");
		n1=scan.nextInt();
		System.out.println("����2 �Է�");
		n2=scan.nextInt();
		System.out.println("1.+ 2.- 3.* 4./");
		a=scan.nextInt();
		
		switch(a){
		case 1: System.out.println(n1+n2); break;
		case 2: System.out.println(n1-n2); break;
		case 3: System.out.println(n1*n2); break;
		case 4: System.out.println((double)(n1/n2));
		
		}
	}
}
