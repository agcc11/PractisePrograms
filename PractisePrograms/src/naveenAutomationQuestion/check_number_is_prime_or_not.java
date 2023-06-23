package naveenAutomationQuestion;

public class check_number_is_prime_or_not {

	public static void main(String[] args) {
			int a=9;
			for(int i=2;i<=8;i++) 
			{
				if(a%i==0)
				{
					System.out.println("not prime number");
				}
				else
				{
					System.out.println(" prime number");
				}
				break;
			}
				
			
	}

}
