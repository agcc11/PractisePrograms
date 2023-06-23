package jaydeepSirQuestions;

public class largenumberfromarray {

	public static void main(String[] args) {
		//LARGEST NUMBER
		int a[]= {10,85,47,20,95};
			int max=a[0];
		for(int i=1;i<a.length;i++)
		{
		    if(a[i]>max)
		    {
		    	max=a[i];
		    }
		
		}	System.out.println("maximum value is:"+max);
		//SMALLEST NUMBER
	int b[]= {44,57,12,16};
	int min=b[0];
	for(int i=1;i<b.length;i++)
	{
		if(b[i]<min)
		{
			min=b[i];
		}
	}System.out.println("minimum value is:"+min);

}
}
