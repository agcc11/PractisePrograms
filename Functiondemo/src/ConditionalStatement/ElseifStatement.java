package ConditionalStatement;

import java.util.Scanner;

public class ElseifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float percentagef;
System.out.println("enter your percentage");
Scanner s=new Scanner(System.in);
percentagef=s.nextFloat();
if(percentagef>=90)
{
	System.out.println("distinction");
}
else if(percentagef<=89 && percentagef>=75)
{
	System.out.println("first class");
}
else if(percentagef<=74 && percentagef>=55)
{
	System.out.println("seceond class");
}
else if(percentagef<=55 && percentagef>=35   )
{
	System.out.println("third class");
}
else 
{
	System.out.println("fail");
}
System.out.println("thank you  !!!");


	}

}
