package main;

public class 소수출력 {
	public static void main(String[] args) {
		
		int n[];
		int i,j;
		n=new int [100];
		
		for(i=2;i<=100;i++)
		{
			n[i-2]=i;
		}
		
		for (i=2;i<=100;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					n[i-2] = 0;
			}
		}	
		
		for(i=2;i<=100;i++)
		{
			if(n[i-2] != 0)
				System.out.println(i);
		}
		
	}
}
