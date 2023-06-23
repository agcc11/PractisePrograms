package PalindromeNumber;

import java.util.Scanner;

public class palindrometest {

	public static void main(String[] code) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,rev=0,z;

		System.out.println("Enter Number:");
		
		 n=sc.nextInt();
		z=n;
		while(n>0)
		{
		rev=(rev*10)+n%10;
		n=n/10;
		}
		if(rev==z)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	
		
	}

}
