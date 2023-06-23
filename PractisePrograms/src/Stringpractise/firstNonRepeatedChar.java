package Stringpractise;

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		//WAP TO FIND FIRST NON REPEATITIVE character FROM STRING
		String s="anikaent";
	   //   char b[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{	boolean result=true;
			for(int j=0;j<=s.length()-1;j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
					{
						result=false;
						break;
					}		
			}
			if(result)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
