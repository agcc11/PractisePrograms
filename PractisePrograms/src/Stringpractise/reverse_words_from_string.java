package Stringpractise;

public class reverse_words_from_string {

	public static void main(String[] args) {
		
	
		String str="my name is aniket";
		String str1[]=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		
		
		String a="hello world";
		String aa[]=a.split(" ");
		String output=" ";
		for(String word:aa)
		{
			String revword=" ";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			output=output+revword;
		}
		System.out.println(output);
		
		
		
					
			
					
	}

}
