package Numberpattern;

public class tempnumpattren {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("===============================================");
		System.out.println("pattern 02");
		for(int i=1,a=5;i<=5;i++,a--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 02");

		for(int i=1;i<=5;i++)
		{			//int b=1;
			for(int j=1;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 03");

		
		for(int i=1;i<=5;i++)
		{			int c=5;
			for(int j=1;j<=5;j++)
			{
				System.out.print(c--);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 04");

		for(int i=1,d=1;i<=5;i++,d++)
		{			int e=d;
			for(int j=1;j<=5;j++)
			{
				System.out.print(e++);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 05");

		for(int i=1,d=9;i<=5;i++,d--)
		{			int e=d;
			for(int j=1;j<=5;j++)
			{
				System.out.print(e--);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 06");

		for(int i=1,d=2;i<=5;i++,d++)
		{			int e=d;
			for(int j=1;j<=5;j++)
			{
				System.out.print(e++);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 07");

		for(int i=1,d=10;i<=5;i++,d--)
		{			int e=d;
			for(int j=1;j<=5;j++)
			{
				System.out.print(e--);
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 08");

		for(int i=1,f=1;i<=5;i++,f++)
		{			
			for(int j=1;j<=5;j++)
			{
				if(i==1)
				{
					System.out.print(" "+j);
				}
				else
				{
						int  d=f;
					{
						System.out.print(" "+d*j);
					}
				} 		
			}		
			System.out.println();
						
		}
		System.out.println("===============================================");

		System.out.println("pattern 09");

		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 10");

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i%2!=0)
				{		if(j%2!=0)
					{
					System.out.print("1");

					}
					else
					{
						System.out.print("0");
					}
				}
				else
				{		if(j%2!=0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}
		System.out.println("===============================================");

		System.out.println("pattern 11");

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2!=0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}System.out.println();
		
	}
		System.out.println("===============================================");
		System.out.println("pattern 12");

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}	
			
		System.out.println("===============================================");
		System.out.println("pattern 13");

		for(int i=1,g=1;i<=5;i++,g++)
		{			int h=g;
			for(int j=1;j<=i;j++)
			{
				System.out.print(h--);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 14");

		for(int i=1;i<=5;i++)
		{				int d=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(d++);
			}
			System.out.println();
		}
		
		System.out.println("===============================================");
		System.out.println("pattern 15");

				int d=1;
		for(int i=1;i<=4;i++)
		{					
			for(int j=1;j<=i;j++)
			{
				System.out.print(d++);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 16");

		for(int i=1;i<=5;i++)
		{					
			for(int j=i;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 17");

		for(int i=1;i<=5;i++)
		{			int dd=5;
			for(int j=i;j<=5;j++)
			{
				System.out.print(dd--);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 18");

		for(int i=1,f=5;i<=5;i++,f--)
		{			
			for(int j=i;j<=5;j++)
			{
				System.out.print(f);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 19");

		for(int i=1;i<=5;i++)
		{			int gg=1;
			for(int j=i;j<=5;j++)
			{
				System.out.print(gg++);
			}
			System.out.println();
		}
		System.out.println("===============================================");
		System.out.println("pattern 20");

		for(int i=1;i<=5;i++)
		{			
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
					
			}System.out.println();
		}
			System.out.println("===============================================");
			System.out.println("pattern 21");
						
			for(int i=1;i<=5;i++)			//not correct pattern
			{	int k=1;
		
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(k++);
				}
				for(int j=1;j<i;j++)
				{
					System.out.print(k++);
				}
				System.out.println();
			}
			System.out.println("===============================================");
			System.out.println("pattern 22");
			
			for(int i=1,h=1;i<=5;i++,h+=2)			
			{				
				for(int j=i;j<5;j++)
				{
					System.out.print(" ");
				}		
						
				for(int j=1;j<=i;j++)
				{
					System.out.print(h);
				}
				for(int j=1;j<i;j++)
				{
					System.out.print(h);
				}
				System.out.println();
			}	
			System.out.println("===============================================");
			System.out.println("pattern 22");
			
			for(int i=1,l=1;i<=5;i++,l+=2)
			{		int p=l;
				for(int j=i;j<=5;j++)
				{
					System.out.print(" ");	
				}	
				for(int j=1;j<=i;j++)
				{
					System.out.print(p--);	
				}		
				for(int j=1;j<i;j++)
				{		
					System.out.print(j);	
				}
				System.out.println();
				
			}
				
				
		
	

}
}

