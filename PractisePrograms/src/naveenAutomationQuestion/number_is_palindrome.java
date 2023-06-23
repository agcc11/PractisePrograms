package naveenAutomationQuestion;

public class number_is_palindrome {

	public static void main(String[] args) {
			int a=475;
			int c=a;
			int b;
			int rev=0;
			while(a>0)
			{
				b=a%10;
				rev=rev*10+b;
				a=a/10;
				
			}	if(rev==c)
			{
				System.out.println(c+" number is palindrome");
			}
			else
			{
				System.out.println(c+" number is not palindrome");
			}
		
		
	}

}
