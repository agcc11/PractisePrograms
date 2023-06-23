package Stringpractise;

import java.util.Arrays;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7,8,9,10};
		int sum=0;
		int expected=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		for(int i=1;i<=10;i++)
		{
			expected=expected+i;
		}
		System.out.println(expected);
		System.out.println(Arrays.toString(a));
		System.out.println("misssing number is "+ (expected-sum));
		
		
		

	}

}
