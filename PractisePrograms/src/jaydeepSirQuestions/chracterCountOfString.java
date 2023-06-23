

package jaydeepSirQuestions;

import java.util.Scanner;

public class chracterCountOfString {
	
	//BY CREATING METHOD 
	public static void getoccurance(String a,char value)
	{
		//String a="test engineer";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)==value)
			{
				count++;
			}
			
		}System.out.println("occurance of char "+" "+value+
				" "+count);
		
	}

	public static void main(String[] args) {
		String a="test engineer"; 
		String c="testing";
		
		//SIMPLE METHOD
		/*String a="test engineer";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)=='e')
			{
				count++;
			}
			
		}System.out.println("occurance of char e is:"+count);*/
		
		
		//BY USING SCANNER FUNCTION
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		String b=sc.nextLine();
		String a="test engineer";
		int count=0;
		for(int i=0;i<=a.length()-1;i++)
		{
			if(a.charAt(i)=='e')
			{
				count++;
			}
			
		}System.out.println("occurance of char e is:"+count);*/
		
		
		getoccurance( a,'e');
		getoccurance(c,'t');
	}

}
