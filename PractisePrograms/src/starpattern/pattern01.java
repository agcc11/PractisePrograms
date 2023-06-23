package starpattern;

public class pattern01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=1;i<=10;i++)				//upside pyramide
		{
			for(int j=i;j<=10;j++)
			{
				System.out.print(" ");
			}
					
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}		

		for(int i=1;i<=10;i++)					//downside pyaramide
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=10;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<7;i++)					// diamond pattern
		{
			for(int j=i;j<=7;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();

		}
		for(int i=1;i<=7;i++)					
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
			 System.out.print(" *");
			}
			System.out.println();


		}
		
		for(int i=1;i<7;i++)				///pattern04
		{
			for(int j=i;j<=7;j++)
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
				System.out.print("*");
			}
			System.out.println();


		}
		
	


for(int i=1;i<7;i++)				//pattern05
{
     for(int j=1;j<=i;j++)
     {
    	 System.out.print("*");
     }
     for(int j=i;j<=7;j++)
     {
    	 System.out.print("");
     }
     System.out.println();
    	 
}
for(int i=1;i<=7;i++)
{
    for(int j=i;j<=7;j++)
    {
   	 System.out.print("*");

    }
    
    for(int j=1;j<=i;j++)
    {
   	 System.out.print("");

    }
    System.out.println();


}

		for(int i=1;i<=10;i++)				//pyramid pattern no space
		{
		    for(int j=i;j<=10;j++)
		    {
		      	 System.out.print(" ");
	
		    }
		    for(int j=1;j<=i;j++)
		    {
		      	 System.out.print("*");

		    }
		    for(int j=2;j<=i;j++)
		    {
		      	 System.out.print("*");

		    }
		    System.out.println();

	}

		
		for(int i=1;i<=10;i++)					//inverse pyramid pattern
				
		{
		    for(int j=1;j<=i;j++)
		    {
		    	
		      	 System.out.print(" ");

		    }
		    for(int j=i;j<10;j++)
		    {
		      	 System.out.print("*");

		    }
		    for(int j=i;j<=10;j++)
		    {
		      	 System.out.print("*");

		    }
		    System.out.println();




		}
			int p=1;
			
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(p++);
				}
				System.out.println();
			}
					int p=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print(p++);
			}
			System.out.println();
		}
    
		
		
		for(int i=1;i<=4;i++)
		{	int p=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p++);
			}
		System.out.println();
		}
		
		for(int i=1;i<=4;i++)
		{		int p=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(p++);
			}
		System.out.println();

		}*/

//------------------------------------------------------------------------------------------
		String s="aniket";
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
				
		}System.out.println(rev);	
//------------------------------------------------------------------------------------		
		String a="sanskruti";
		
		StringBuffer ss=new StringBuffer(a);
	System.out.println(ss.reverse());
	
	//----------------------------------------------------------------------------------
	
	
/*	int d[]= {1,2,3};
	for(int i=d.length-1;i>=0;i--)
	{
		System.out.print(d[i]);
	}*/
	//---------------------------------------------------------
		
		int f[][]= {{74,75,76},{10,11,12}};
		for(int i=f.length-1;i>=0;i--)
		{
			for(int j=f[i].length-1;j>=0;j--)
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}


