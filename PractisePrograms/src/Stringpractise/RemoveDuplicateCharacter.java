package Stringpractise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {

		
		String s="pizza";
		String r=" ";
		char ch[]=s.toCharArray();
		
		Set<Character>hm=new LinkedHashSet<Character>();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			hm.add(ch[i]);
		}
		
		for(char c:hm)
		{
			r=r+c;	
		}
		System.out.println(r);
		
	
		
		
	
	}

}
