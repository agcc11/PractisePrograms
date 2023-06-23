package naveenAutomationQuestion;

import java.util.Scanner;

public class Factorial_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);					 //	!0=1
		System.out.println("Enter your Number");
		int input=sc.nextInt();
		//int input=3;
		int fact=1;
		for(int i=input;i>0;i--)
		{		
			fact=fact*i;
		}
		System.out.println("factorial of given number is "+fact);
		
	
		System.out.println("by using while loop");
		//using while loop
		int input1=3;
		int fact1=1;
		while(input1>0)
		{
			fact1=fact1*input1;
			input1--;
		}
		System.out.println("factorial of given number is "+fact1);

	}

}
