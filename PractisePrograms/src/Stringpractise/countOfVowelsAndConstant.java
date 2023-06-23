package Stringpractise;

public class countOfVowelsAndConstant {

	public static void main(String[] args) {
		
		String s="eclipse ide";
		char sa[]=s.toCharArray();
		int length=sa.length;
		System.out.println("total length is "+length);
			int temp=0;
		for(int i=0;i<=sa.length-1;i++)
		{
			if((sa[i]=='a')|| (sa[i]=='e')|| (sa[i]=='i') || (sa[i]=='o') || (sa[i]=='u'))
			{
				temp++;
			}	
		}
		if(temp!=0)
		{
			System.out.println("no of vowels are "+ temp);
		}
		
		int constantnumber=length-temp;
		System.out.println("no of constant are "+constantnumber);
		System.out.println("====================================");
		
		
		String d="hello pune";
		int vowel=0;
		int cons=0;
		String dd=d.toUpperCase();
		for(int i=0;i<=dd.length()-1;i++)
		{
			char c=dd.charAt(i);
			if(c!=' ')
			{
				if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U')
				{
					vowel++;
				}
				else
				{
					cons++;
				}
			}
		}
		System.out.println("vowels count is "+vowel);
		System.out.println("constants count is "+cons);

	}

}
