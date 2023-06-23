package string;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stu"
		String s="velocity is best institiude";
		int e=s.length();
		System.out.println(e);
		String rev="";
		for(int i=26;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		// another method
		
		
		
		String input="aniket ";
		String output=" ";
		for(int i=input.length()-1;i>=0;i--)
		
			
		
			output=output+input.charAt(i);

		System.out.println(output);

			// USING STRING BUFFER  CLASS        
		
		
		String name= "Sanskruti mam";                      //this are inbuild method
		StringBuffer obj=new StringBuffer(name);
		System.out.println(obj.reverse());
		
	// STRING BUILDER CLASS	
		
		String rev1=" velocity";
		StringBuilder objj=new StringBuilder(rev1);
		System.out.println(objj.reverse());
		
		
		// REVERSE NUMBER
		
		String madam="85210";
		StringBuffer ob=new StringBuffer(madam);
		System.out.println(ob.reverse());
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		float num=sc.nextFloat();
		StringBuffer obb=new StringBuffer(String.valueOf(num));
         StringBuffer act=obb.reverse();	
         System.out.println(act);
	}

}
