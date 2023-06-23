package Stringpractise;

public class CapitalizeString {

	public static void main(String[] args) {

		String s="naveen automation labs";
		
		String ss[]=s.split(" ");
		
		for(int i=0;i<=ss.length-1;i++)
		{
			String first=ss[i].substring(0, 1);
			String cap=first.toUpperCase();
			String rest=ss[i].substring(1,ss[i].length());
			String d=cap+rest;
			System.out.print(d+" ");
		}
		
		for(String word:ss)
		{
			String first=word.substring(0, 1);
			String cap=first.toUpperCase();
			String rest=word.substring(1, word.length());
			String result=cap+rest;
			System.out.print(result+" ");
		}
		
		
	}

}
