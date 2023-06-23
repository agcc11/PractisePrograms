package ConditionalStatement;

import java.util.Scanner;


public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Amt;
		System.out.println("enter youe amt");
		Scanner s=new Scanner(System.in);
		Amt =s.nextInt();
		
if (Amt <=20)
{
	System.out.println("you can withdreaw ");
}
System.out.println("insufficent amt");
	}

}
