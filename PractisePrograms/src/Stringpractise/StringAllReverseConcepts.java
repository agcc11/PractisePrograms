package Stringpractise;

public class StringAllReverseConcepts {

	public static void main(String[] args) {


		//simple reverse 
		String s="java is programing language";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//REVERSE ON SAME PLACE 			
		String ss="java is programing language";
		String sa[]=ss.split(" ");
		String output=" ";
		for(String word:sa)
		{
			String revv=" ";
					for(int i=word.length()-1;i>=0;i--)
					{
						revv=revv+word.charAt(i);
					}
					output=output+revv;
		}
		System.out.println(output);
		
		
		//REVERSE STRING PRESERVING POSITION OF WORDS
		
		String str="java is programing language";
		char ch1[]=str.toCharArray();
		char ch2[]=new char [ch1.length];
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]==' ')
			{
				ch2[i]=' ';
			}
		}
		int j=ch2.length-1;
		for(int i=0;i<=ch1.length-1;i++)
		{
			if(ch1[i]!=' ')
			{
				if(ch2[j]==' ')
				{
					j--;
				}
				ch2[j]=ch1[i];
				j--;
			}		
		}	
	     System.out.println(String.valueOf(ch2));
	
	     //REVERSE EACH WORD FROM STRING
	 	String f="java is programing language";
		String ff[]=f.split(" ");
		
		for(int i=ff.length-1;i>=0;i--)
		{
			System.out.print(ff[i]+" ");
		}
	
		
		
		
		
		
	}

}
