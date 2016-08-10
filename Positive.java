package github;

import java.util.Scanner;

public class Positive 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else if(n>0)
		{
			System.out.println("Positive");
		}
	}

}
