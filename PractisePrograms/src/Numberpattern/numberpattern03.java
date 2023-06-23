package Numberpattern;

public class numberpattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)                // RIGHT TRAINGLE INCREASING
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(j);
	}
	System.out.println();
}
System.out.println("--------------------------------------------");

for(int i=1;i<=5;i++)     // LEFT TRAINGLE DECREASING
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=i,k=1;j<=5;j++,k++)
	{
		System.out.print(k);
	}
	System.out.println();

	}
System.out.println("-----------------------------------------------");
for(int i=1;i<=5;i++)        			//hill pattern
{int p=1;
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<i;j++)
	{
		System.out.print(p++);
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(p++);
	}
	System.out.println();
}
System.out.println("--------------------------------------------");
for(int i=1;i<=5;i++)
{ int p=5;
	for(int j=1;j<=i;j++)
	{
		System.out.print(p--);
	}
	System.out.println();
}
System.out.println("-------------------------------------------------------");
for(int i=1;i<=5;i++)
{ int p=5;
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=5;j++,p--)
	{
		System.out.print(p);
	}
	System.out.println();
}
	


}
}
