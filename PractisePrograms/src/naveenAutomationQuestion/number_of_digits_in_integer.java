package naveenAutomationQuestion;

public class number_of_digits_in_integer {

	public static void main(String[] args) {
		int a =1565;
		int count=0;
		
		while(a!=0)
		{
			a=a/10;
			count++;
		}			System.out.println(count);

	}

}
