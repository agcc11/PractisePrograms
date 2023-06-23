package Stringpractise;

import java.nio.ShortBuffer;

public class stringrevandpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="breaking news";
String b=" ";
for(int i=a.length()-1;i>=0;i--)
	b=b+a.charAt(i);
System.out.println(b);


String c="fortuna";
StringBuffer obj=new StringBuffer(c);
System.out.println((obj.reverse()));

String d="mercedeez benz";
StringBuilder obj1=new StringBuilder(d);
System.out.println((obj1.reverse()));


//number palindrome

int e=525;

int rev=0;
int z;
z=e;
while(e>0)
{
rev=(rev*10)+e%10;
e=e/10;

}
if(z==rev)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
	
}

//word is palindrome

String f="tot";
int i,j,k;
k=0;
i=0;
j=f.length()-1;
while(i<j && k==0)
{
	if(f.charAt(i)!=f.charAt(j))
	{
		k=1;
		
	}
	i++;
	j--;
	
}
if(k==0)
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not palindrome");
}
	

		
	
	
		
				


	

}
	}




