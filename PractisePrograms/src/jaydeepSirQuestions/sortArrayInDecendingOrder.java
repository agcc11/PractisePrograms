package jaydeepSirQuestions;

public class sortArrayInDecendingOrder {

	public static void main(String[] args) {
		int a[]= {50,14,45,49,41};
		{
			for(int i=0;i<a.length;i++)
			{			int temp=0;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]<a[j])
					{
						temp=a[j];
						a[j]=a[i];
						a[i]=temp;
					}
				}System.out.print(" "+a[i]);
			}
		}
		

	}

}
