package jaydeepSirQuestions;

public class duplicateStringFromArray {

	public static void main(String[] args) {
	 String a[]= {"java","python","ruby","c++","python","java","java"};
	 int count=1;
		for(int i=0;i<a.length;i++)
		{		
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&& (i!=j))
				{		
					System.out.println(a[i]);

				}			

			}

		}			

	}

}
