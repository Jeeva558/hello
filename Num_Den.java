package z.set1;

public class Num_Den 
{
public static void main(String[] args) 
{
	String num="1000";
	String den="100";
	char[] cn=num.toCharArray();
	char[] dn=den.toCharArray();
	if(dn.length>=cn.length)
	{
		for(int i=cn.length-1;i>=0;i--)
		{
			if(String.valueOf(cn).replaceAll("\0", "").length()==1)
			{
				break;
			}
			char find=cn[i];
		
			for(int j=dn.length-1;j>=0;j--)
			{
				if(find==dn[j])
				{
					cn[i]='\0';
					dn[j]='\0';
					break;
				}
			}		
			
			
			
		}
		System.out.println(String.valueOf(cn)+"/ "+String.valueOf(dn));		
	}
	else if(cn.length>dn.length)
	{
		for(int i=dn.length-1;i>=0;i--)
		{
			if(String.valueOf(dn).replaceAll("\0", "").length()==1)
			{
				break;
			}
			char find=dn[i];
		
			for(int j=cn.length-1;j>=0;j--)
			{
				if(find==cn[j])
				{
					dn[i]='\0';
					cn[j]='\0';
					break;
				}
			}		
			
			
			
		}
		System.out.println(String.valueOf(cn)+"/"+String.valueOf(dn));		
	}
}
}
