package jaydeepSirQuestions;

import java.util.Arrays;

public class lecture290322 {

	public static void main(String[] args) {
		//PROGRAM ON FACTORIAL NUMBER
		
		/*int num=3;
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial of number "+num+" is="+fact);*/
			
		//PROGRAM ON FACTORIAL NUMBER FROM AN ARRAY
		
	/*	int a[]= {2,4,5,3};
		for(int i=0;i<a.length;i++)
		{
				int fact=1;
				for(int j=a[i];j>0;j--)
				{
					fact=fact*j;
				}
				System.out.println("factorial of "+a[i]+" is "+fact);
		}
	*/	
		
		//PROGRAM ON SMALLEST AND LARGEST NUMBER FROM AN ARRAY
		/*	int a[]= {14,85,45,24};
			int max=a[0];
			int min=a[0];
			for(int i=1;i<a.length;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
				
				if(a[i]<min)
				{
					min=a[i];
				}
			}	System.out.println("maximun value is "+max);
				System.out.println("minimum value is "+min);
		*/
			
			//PROGRAM ON PRIME NUMBER FROM AM ARRAY;
	
	/*	int a[]= {2,17,45,51,87,3};
		
		for(int i=0;i<a.length;i++)
		{			int temp=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.println(a[i]);
			}
		}	
		*/
			//PROGRAM ON FIND PRIME NUMBER FROM 1 TO1 100
				
	/*		for(int i=2;i<=100;i++)
			{			int temp=0;
				for(int j=2;j<i;j++)
				{
						if(i%j==0)
					 {
							temp++;
					 }
				}
				if(temp==0)
				{
					System.out.println("prime numbers are "+i);
				}
		}
		*/
		
		//PROGRAM ON HIGHEST AND SECOND HIGHEST NUMBER FROM AN ARRAY
		
		//BY USING SORT METHOD
		
		
	/*	int a[]= {2,4,1,6,10,8};
		
		Arrays.sort(a);
		
		System.out.println(a[a.length-1]);   //highest number 
		System.out.println(a[a.length-2]);   //second highest number
	*/	
		
	}
}


