package naveenAutomationQuestion;

import java.util.Scanner;

public class design_calculator {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		double firstnumber=sc.nextDouble();
		System.out.println("Enter second Number");
		double secondnumber=sc.nextDouble();
		System.out.println("Enter an operator");
		char operator=sc.next().charAt(0);
		double result=0;
		switch (operator) {
		case '+':
			result=firstnumber+secondnumber;
			break;
		case '-':
			result=firstnumber-secondnumber;
			break;
		case '*':
			result=firstnumber*secondnumber;
			break;
		case '/':
			result=firstnumber/secondnumber;
			break;
			

		default:
			System.out.println("Error:invalid operator");
			break;
		}
		System.out.println(result);
		
	}

}
