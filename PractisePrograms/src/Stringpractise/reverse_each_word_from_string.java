package Stringpractise;

public class reverse_each_word_from_string {

	public static void main(String[] args) {
		String a="hello pune";
		String aa[]=a.split(" ");
		String output=" ";
		for(String word:aa)
		{		String revword=" ";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			output=output+revword;	
		}
		System.out.println(output);
	
		
	/*	String a="hello pune";
		String aa[]=a.split(" ");
		for(int i=0;i<=aa.length-1;i++)
		{
			System.out.print(aa[i]+" ");
		}
		
		System.out.println();
		
		for(int i=aa.length-1;i>=0;i--)
		{
			System.out.print(aa[i]+" ");
		}
	*/	
		
	
		
	
		
		
	} 

}
