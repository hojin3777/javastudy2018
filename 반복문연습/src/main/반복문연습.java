package main;
import java.util.Scanner;


public class 반복문연습 {
	public static void main(String[] args) {
		
		int i, t;
		int total=1;
		
		Scanner scan= new Scanner(System.in);
		
		i=scan.nextInt();
		
		for(t=1;t<=i;t++)
			total*=t;
		
		System.out.println(total);
	}
}
