package naveenAutomationQuestion;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num=10011011;
	int z=num;
	int b;
	int base=2;							//1
	int expo=0;
	int pro=1;
	int sum=0;
	
	while(z>0)
	{	
		b=z%10;	
		while(expo==0)
		{
		pro=pro*base;
		expo++;
		}
		sum=sum+b+pro;
		z=z/10;
		expo++;
	}
	System.out.println(sum);
			
			
		
	}

}
