package jaydeepSirQuestions;

import java.util.Scanner;

public class evenNoddnumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int a=sc.nextInt();
	
	//int a=13;
	if(a%2==0)
	{
		System.out.println("Number is even");
	}
	else
	{
		System.out.println("Number is odd");
	}
}
}
