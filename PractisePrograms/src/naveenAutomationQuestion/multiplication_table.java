package naveenAutomationQuestion;

public class multiplication_table {

	public static void main(String[] args) {

		int input=13;
		int multiple=0;
		for(int i=1;i<=10;i++)
		{
			multiple=input*i;
			System.out.println(input+"x"+ i +  "="+multiple);
		}
	}

}
