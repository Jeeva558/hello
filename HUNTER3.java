package github;

import java.util.Scanner;

public class HUNTER3
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{ 
			for (int j = 0; j <n; j++)
			{
				if(a[i]==a[j])
				{
				c++;	
				}
				
			}
				if(c==1)
				{
					System.out.println(a[i]);
				}	
c=0;
		}
	}

}
