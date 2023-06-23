package Stringpractise;

public class reverse_string_preserving_spaces_position {

	public static void main(String[] args) {
		String str="welcome to pune";
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
		
		
		
		
			
	}		

}
