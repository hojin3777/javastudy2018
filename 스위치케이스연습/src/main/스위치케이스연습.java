package main;
import java.util.Scanner;

public class 스위치케이스연습 {
	public static void main(String[] args) {
		
		int month;
		
		Scanner scan=new Scanner(System.in);
		month=scan.nextInt();
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: System.out.println("31일"); break;
		
			case 2: System.out.println("28일"); break;
		
			case 4:
			case 6:
			case 9:
			case 11: System.out.println("30일"); break;
			
		}
	}
}
