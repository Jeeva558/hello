package github;

import java.util.Scanner;

public class hunter1 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int k[]=new int[num];
		int temp=0;
		for(int i=0;i<num;i++)
		{
		k[i]=s.nextInt();
		}
		int b[]=new int[num];
		for(int i=0;i<num;i++)
		{
		 for(int j=i+1;j<num;j++)
		{
		 if(k[i]<k[j])
		 {
		   temp=k[i];
		   k[i]=k[j];
		   k[j]=temp;
		}
		}
		}
		for(int i=0;i<num;i++)
		{
		 System.out.print(k[i]);
		}
		
	}

}
