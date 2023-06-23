package naveenAutomationQuestion;

import java.util.Scanner;

public class numberpositiveornegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		double b=sc.nextDouble();
	//	double num=0;
		if(b>0 || b==0)
		{
			System.out.println(b+" is positive");
		}
		else 
		{
			System.out.println(b+" is negative");
		}
	}

}
