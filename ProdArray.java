package z.set1;

public class ProdArray 
{
public static void main(String[] args) 
{
	int[] n= {1,2,3,4,5};
	int m=n.length;
	calculate(n, m);
}
public static void calculate(int[] arr,int length)
{
	int prod[]=new int[length];
	int temp=1;
	for (int i = 0; i < prod.length; i++) 
	{
	prod[i]=1;
	}
	for(int i=0;i<length;i++)
	{
		prod[i]=temp;		
		temp *=arr[i];
	}
	temp=1;
	for(int j=length-1;j>=0;j--)
	{
	prod[j]*=temp;
	temp*=arr[j];
	}
	for (int i = 0; i < prod.length; i++) 
	{
	System.out.print(prod[i]+" ");	
	}
}
}
