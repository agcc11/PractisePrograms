package naveenAutomationQuestion;

public class reverse_number {

	public static void main(String[] args) {
		
		int a=856;
		int z;
		int rev=0;
		while(a>0)
		{
			z=a%10;
			rev=rev*10+z;
			a=a/10;
			
		}System.out.println("reverse number is:"+rev);
		
		
		
		
}
}
