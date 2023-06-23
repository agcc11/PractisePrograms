package Stringpractise;

public class CountOfOcuurenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,2,2,3,4};
		int b[]=new int[a.length];
		int visited=-1;
		
		for(int i=0;i<=a.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
				if(b[i]!= visited)
				{
					b[i]=count;
				}
					
				
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			if(b[i]!=visited)
			{
				System.out.println(a[i]+" "+b[i]);
			}
		}
	}

}
