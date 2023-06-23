package Stringpractise;

import java.util.Arrays;

public class EdurekaStringProgram {

	public static void main(String[] args) {

	/*	String a="welcome to edureka";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
		System.out.println("=========================================");
		//PROGRAM 01
		String aa="welcome to velocity";
		String bb[]=aa.split(" ");
		for(String temp:bb)
		{
			System.out.println(temp);
		}
		for(int i=0;i<3;i++)
		{
			char cc[]=bb[i].toCharArray();
			for(int j=cc.length-1;j>=0;j--)
			{
				System.out.print(cc[j]);
			}
			System.out.println(" ");
		}
		System.out.println("=========================================");

			//program 02
		String c="welcome to";
		String d=c.concat(" pune");
		System.out.println(d);
		
		String s="welcome";
		String ss=" to mumbai ";
		String sss=s+ss;
		System.out.println(sss);
		
		System.out.println("=========================================");
		
		String e="you are good";
		String d1=e.replace("o", "");
		System.out.println(d1);
		System.out.println("=========================================");

	*/	
		
	/*	//PROGRAM TO CHECK STRING IS ANAGRAM OR NOT
		String a="bhava";
		String b="asnhs";
		char c[]=a.toCharArray();		//CONVERT STRING TO CHAR ARRAY
		char d[]=b.toCharArray();
		Arrays.sort(c);						//USE ARRAY SORT METHOD
		Arrays.sort(d);
		if(Arrays.equals(c, d))				//COMPARE SORTED ARRAYS BY USING ARRAY.SORT METHOD
		{
			System.out.println("it is angram");
		}
		else
		{
			System.out.println("it is not angram");
		}
	*/	
		//PROGRAM ON COUNT NO OF WORDS IN STRING
	/*	String s="velocity corporate institude best in pune check it out profile";
		String ss[]=s.split(" ");
				int count=0;
		for(int i=0;i<=ss.length-1;i++)
		{
			count++;
		}
		System.out.println(count++);
	*/
		//PROGRAM TO COUNT NO OF OCCU OF GIVEN CHAR WITHOUT USING LOOP
		String d="learn java ";
		int r=d.length();
		System.out.println("actual length "+r);
		String f=d.replace("e", "");
		int g=f.length();
		System.out.println("length after removing char "+g);
		int h=r-g;
		System.out.println("occurence of desire chracter is "+h);
		
		}
}			
