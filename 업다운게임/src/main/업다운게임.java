package main;
import java.util.Scanner;

public class 업다운게임 {
	public static void main(String[] args) {
		
		int n=64, i;
	
		Scanner scan= new Scanner(System.in);
		
		for(;;)
		{
			i=scan.nextInt();
			if(i==n)
				{
				System.out.println("정답!");
				break;
				}
			else if (i<n)
				System.out.println("UP");
			else
				System.out.println("Down");
		}
		
	}
}
