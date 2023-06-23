package Stringpractise;

public class checkStringContainDigit {

	public static void main(String[] args) {
		
		//Approach 01
		String d="gugty12";
		int temp=0;
		for(int i=0;i<=d.length()-1;i++)
		{
			if(Character.isDigit(d.charAt(i)))
			{
				temp++;
			}
		}
		if(temp!=0)
		{
			System.out.println("String contain digit");
		}
		else
		{
			System.out.println("String dont contain digit");
		}
	
		System.out.println("======================================");
		
		
		//Approach 02
			String r="dog123";
			char rr[]=r.toCharArray();
			int local=0;
			for(int i=0;i<=rr.length-1;i++)
			{
				if(rr[i]>='0' && rr[i]<='9')
				{
					local++;
				}
			}
			if(local==0)
			{
				System.out.println("not an integer string");
			}
			else
			{
				System.out.println(" an integer string");
			}
		
			String str="i love india"; 
			String strr[]=str.split(" ");
			for(String yy:strr)
			{
				System.out.println(yy);
			}
	}

}
