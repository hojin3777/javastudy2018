package main;
import java.util.Scanner;

public class ��������� {
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
