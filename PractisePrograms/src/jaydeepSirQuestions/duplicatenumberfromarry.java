package jaydeepSirQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicatenumberfromarry {

	public static void main(String[] args) {
	//	int a[]= {8,4,5,3,6,8,5};
		/*for(int i=0;i<a.length-1;i++)
		{			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if((a[i]==a[j])&&(i!=j))
				{		count++;
					System.out.println("Duplicate Number is "+a[j]+" "+count);
				}
			}
		}
		*/
		
	/*	Set<Integer> s=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(s.add(i)==false)
			{
				System.out.println(i);
			}
		}
	*/
		
		
		int a[]= {3,5,4,2,8};
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
