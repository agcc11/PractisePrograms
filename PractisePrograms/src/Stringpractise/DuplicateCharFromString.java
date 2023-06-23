package Stringpractise;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		
		String s="anikketi";
		for(int i=0;i<=s.length();i++)
		{
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					System.out.println(s.charAt(i));
				}
					
			}
		}
		
	}

}
