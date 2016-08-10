package github;

import java.util.Scanner;

public class vowels 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Not A Vowels");
		}
		
	}

}
