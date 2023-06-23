package Numberpattern;

public class selfpatternlogic {

	public static void main(String[] args) {
//pattern 01
		System.out.println("pattern 01");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------");
System.out.println("pattern 02");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		System.out.println("pattern 03");

		int p=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+p++);
			}
			System.out.println();
}
		
		System.out.println("---------------------------------");
		
		System.out.println("pattern 04");

		int q=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
			System.out.print(" "+q++);	
			}
			System.out.println();
		}
System.out.println("---------------------------");
		
System.out.println("pattern 05");
		for(int i=1,r=5;i<=5;i++,r--)
		{	
			for(int j=1;j<=i;j++)
			{
				System.out.print(r);	
			}
			System.out.println();
		
}
		System.out.println("-------------------------------");

		System.out.println("pattern 06");
		for(int i=1;i<=5;i++)					//different logic
		{	
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);	
			}
			System.out.println();
		
}
		System.out.println("--------------------------------");
		
		System.out.println("pattern 07");
		for(int i=1;i<=5;i++)
		{	
			for(int j=1;j<i;j++)
			{
				System.out.print(" "+j);
			}
			{
			for(int k=i;k>=1;k--)
			{
				System.out.print(" "+k);
			}
			}System.out.println();
}
		
		System.out.println("--------------------------------------------------");
		System.out.println("pattern 08");
		
		for(int i=1;i<=5;i++)
		{	int s=5;
			for(int j=i;j<=5;j++)
			{
				System.out.print(s--);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		System.out.println("pattern 09");
		
		for(int i=1;i<=5;i++)
		{	int s=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(s--);
			}
			System.out.println();
		}
		
	System.out.println("------------------------------------------------------");
	System.out.println("pattern 10");
	
	for(int i=1,u=0;i<=5;i++,u+=2)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(u);
		}
		System.out.println();
	}
	System.out.println("------------------------------------------");
	
	System.out.println("pattern 11");
	for(int i=1,u=8;i<=5;i++,u-=2)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print(u);
		}

		System.out.println();
	}
	System.out.println("-------------------------------");
	System.out.println("pattern 12");
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{	if(i%2==0)
			{
			System.out.print("2");
			}
		else
			{
			System.out.print("1");
			}
			
		}		System.out.println();

	}
	System.out.println("--------------------------------");
	System.out.println("pattern 13");
	
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		int v=1;
		for(int j=i;j<=5;j++)
		{
			System.out.print(v++);
		}
		System.out.println();
	}
	System.out.println("_----------------------------------------------");
	System.out.println("pattern 14");
	
	for(int i=1,k=5;i<=5;i++,k--)				//imp pattern
	{	
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		int w=k;
		for(int j=i;j<=5;j++)
		{
			System.out.print(w--);
		}
		System.out.println();
	}
		
	System.out.println("---------------------------------------------------");
	System.out.println("pattern 15 ");
	
	for(int i=1;i<=5;i++)				//correct it
	{	
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		int o=1;
		for(int j=1;j<i;j++)
		{
			System.out.print(o++);
		}
		for(int j=1;j<=1;j++)
		{
			System.out.print(o--);
		}
		
		System.out.println();
	}
	
	
	

	
}
}
