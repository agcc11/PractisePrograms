package shubhamsir;

public class starpattern {
 static public void main(String[] args) {
	

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
			System.out.println();
			
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{	if((i==5) || (j==1) || (j==i))
		{
				System.out.print("*"); 
		}
			else
			{
			System.out.print(" "); 
			}
		}System.out.println();
		}
	
	
	
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
				{   System.out.print(" ");
		
				}
		{
			for(int j=1;j<=i;j++)
			{	if((i==5) ||(j==1)||(j==i))
				{
				System.out.print("*");
				}
			else
			{
				System.out.print(" ");
			}

		}
	}System.out.println();
}
	//pattern 01
	System.out.println("pattern 01");

	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
System.out.println("------------------------------------------");	
	//pattern 02
System.out.println("pattern 02");

	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
System.out.println("----------------------------------------");	
	//pattern 03
System.out.println("pattern 03");

	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
System.out.println("------------------------------------");	
	
//pattern 04
System.out.println("pattern 04");

for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}

System.out.println("------------------------------");
//pattern 05
System.out.println("pattern 05");
for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<i;j++)
	{
		System.out.print("*");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();

}
System.out.println("-------------------");
//pattern 06
System.out.println("pattern 06");
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=i;j<=5;j++)
	{
		System.out.print("*");
	}
	for(int j=i;j<5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
System.out.println("-----------------------------------");
//pattern 07
System.out.println("pattern 07");
for(int i=1;i<5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	for(int j=1;j<i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
   for(int j=i;j<=5;j++)
   {
	System.out.print("*");
   }
   for(int j=i;j<5;j++)
   {
	System.out.print("*");
   }
System.out.println();
}
System.out.println("--------------------------------------");
System.out.println("pattern 08");
//pattern 08
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
     System.out.println();
}

for(int i=1;i<=5;i++)
{
	for(int j=i;j<5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
System.out.println("---------------------------------------");

System.out.println("pattern 09");

//pattern 09

for(int i=1;i<5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(int i=1;i<=5;i++)
{
for(int j=1;j<=i;j++)
{
	System.out.print(" ");
}
for(int j=i;j<=5;j++)
{
	System.out.print("*");
}
System.out.println();
}

System.out.println("--------------------------------------");

System.out.println("pattern 10");

//pattern 10
for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
System.out.println("---------------------------------------");

System.out.println("pattern 11");

for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=5;j++)
	{
		System.out.print("*");
	}
System.out.println();
}

System.out.println("-----------------------------------");
System.out.println("pattern 12");
 //pattern 12

for(int i=1;i<5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
	System.out.println();
}
	System.out.println("---------------------------------------");
	System.out.println("pattern 13");
	
	for(int i=1;i<5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("-------------------------------");
		System.out.println("pattern 14");
	
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				System.out.print(" *");
			}
		System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	System.out.println("-------------------------------------");		
System.out.println("pattern 15");

//pattern 15
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		if((j==i)|| (j==1)|| (i==5)) 
		{
			System.out.print("*");
		}
		else
		{
				System.out.print(" ");
		}
	}		System.out.println();	

	}
System.out.println("-----------------------------------");
System.out.println("pattern 16");

for(int i=1;i<=5;i++)
{
	for(int j=i;j<=5;j++)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		if((j==1)||(j==i)||(i==5))
		{
			System.out.print("*");
		}
		else
		{
			System.out.print(" ");
		}
	}System.out.println();
		
}
	
}
}

	
	

