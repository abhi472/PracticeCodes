package hackerank;

import java.util.Scanner;

public class Sherlock {
	public static void main(String args[])
	{
	
	int a;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	int  b[] = new int[a];
	for(int i=0;i<a;i++)
	{
		b[i]=s.nextInt();
	}
	for(int i=0; i<a; i++)
	{
		
		int c= func(b[i]);
		if(c==-1)
			System.out.print(-1);
		else if(c==5)
		{
			for(int j=0;j<b[i];j++)
			{
				System.out.print("3");
			}
		
		}
		else if(c==a)
		{
			for(int j=0;j<b[i];j++)
			{
				System.out.print("5");
			}
		

		}
		else
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("5");
			}
			for(int j=0;j<b[i]-c;j++)
			{
				System.out.print("3");
			}
		

		}
		System.out.println();
	}
	

}
	static int func(int a)
	{
		if((a<15)&&(a%5==0))
		{
			return 5;
		}
//		if(a<5&&a%3!=0)
//			return -1;
		if(a<3)
			{return -1;}
		if(a%3==0)	
		{
			return a;
		}
		else
		{
			for(int i=1;i<=3;i++)
			{
			if((a-(5*i))>0&&(a-(5*i))%3==0)
				return a-(5*i);
			}
			return -1;
			
		}
	}
}
