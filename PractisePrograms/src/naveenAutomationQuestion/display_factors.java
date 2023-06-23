package naveenAutomationQuestion;

import java.util.Scanner;

public class display_factors {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Number");
			int num=sc.nextInt();
	//int num=6;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			System.out.println(i);
		}
	}
}
}
