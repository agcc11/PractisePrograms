package Stringpractise;

public class SwappingOfNumberString {

	public static void main(String[] args) {

		
		//SWAPING OF NUMBER WITH USING THIRD VARIABLE
		
		int a=30;
		int b=20;
		int temp;
		
		System.out.println("Before Swaping");
		System.out.println(a);
		System.out.println(b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===========================================");
		
		
		//SWAPING OF NUMBER WITHOUT USING THIRD VARIABLE
		
		int c=40;
		int d=10;
		
		System.out.println("Before Swaping");
		System.out.println(c);
		System.out.println(d);
		
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("After Swaping");
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("===========================================");

		
		//SWAPING OF STRING WITH USING THIRD VARAIBLE
		
		String s1="hello";
		String s2="world";
		
		System.out.println("Before Swaping");
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1+s2;  //helloworld(10-5)
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("After Swaping");
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
