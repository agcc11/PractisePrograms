package naveenAutomationQuestion;

public class armstrong_number {

	public static void main(String[] args) {
		
		int num=153;
		int z=num;
		int count=0;
	
		while(z>0)
		{	count++;

			z=z/10;
			
		}
		
		z=num;
		
		int sum=0;
		int b;

		
		while(z>0)
		{	int pro=1;
			b=z%10;
			for(int i=1;i<=count;i++)
			
			{   
				pro=pro*b;
			}
				sum=sum+pro;
				z=z/10; 
		}
			if(sum==num)
			{
				System.out.println("armstrong number");
			}
			else
			{
				System.out.println("not armstrong number");		
			}
		
		
		
		
		
		
		}
			
	}


