package starpattrn;

public class Hollowpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		if(j==i)
		{
			System.out.print("* ");
		}
		else
		{
			System.out.print("  ");
		}
		
	}System.out.println();
	
}
for(int i=1;i<=4;i++ )
{
	for(int j=i;j<=4;j++)
	
		
		{
			System.out.print(" ");
		}
		
		
		
	}System.out.println();
	
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			if(j== 5)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
			}System.out.println();
		}
	}
}
	


