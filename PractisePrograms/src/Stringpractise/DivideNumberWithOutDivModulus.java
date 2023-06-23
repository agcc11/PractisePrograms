package Stringpractise;

public class DivideNumberWithOutDivModulus {

	public static void main(String[] args) {
		
		//DIVIDE NUMBER WITHOUT DIVISION AND MODULUS
		int x=7;
		int y=2;
		int result=0;
		while(x>=y)
		{
			x=x-y;
			result++;
		}
		System.out.println(result+" "+x);    //result ==quotient    x==remainder
	}

}
