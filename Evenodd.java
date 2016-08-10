package github;

import java.util.Scanner;

public class Evenodd
{
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	if(n>0)
	{
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
	else
	{
		System.out.println("String");
		
	}
	}
}
