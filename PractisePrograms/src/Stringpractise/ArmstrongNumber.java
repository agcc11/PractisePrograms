package Stringpractise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		
		int num=153;
		int temp=num;
		int rem;
		int pro=1;
		int sum=0;
		while(temp>0)
		{
			rem=temp%10;
			pro=rem*rem*rem;
			temp=temp/10;
			sum=sum+pro;
		}
		
		System.out.println(sum);
		if(sum==num)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("no arm");
		}
				
	}

}
