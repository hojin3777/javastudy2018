package main;
import java.util.Scanner;

public class 구구단출력 {
	public static void main(String[] args) {
		
		int i, t=1;
		
		Scanner scan= new Scanner(System.in);
		i=scan.nextInt();
		
		while (t<=9)
		{
			System.out.println(i+" * "+t+" = "+i*t);
			t++;
		}
		
	}
}
