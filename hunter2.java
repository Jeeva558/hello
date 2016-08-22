package github;

import java.util.Scanner;

public class hunter2 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for (int i = 0; i < a.length; i++)
	{
		a[i]=s.nextInt();
	}
	for (int i = 0; i < a.length; i++)
	{
	
		if(i==a[i])
		{
			System.out.println(a[i]);
		}
		
	}
	
	
}
}
