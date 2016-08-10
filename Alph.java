package Logic1;

import java.util.Scanner;

public class Alph
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		if(Character.isAlphabetic(c))
		{
			System.out.println("Is A Character");
		}
		else
		{
			System.out.println("Is A Number");
		}
	}

}
