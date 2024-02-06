package Stringpractise;

import java.util.HashMap;
import java.util.Map;

public class HashmapConcept {

	public static void main(String[] args) {
		//count of occurence of words in string
		String str=" i am learning learning java java programing java i java";
		Map<String,Integer>map=new HashMap<String,Integer>();
		int   count=1;
		String arr[]=str.split(" ");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], count);
			}
			else
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(String x:map.keySet())
		{
			System.out.println(x+" "+ map.get(x));
		}
		
		
		
		//New Approach
		
		int a[]= {2,2,3,4,2,3,4};
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		for(int i=0;i<=a.length-1;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		System.out.println("===========================================");
		
		
	String s[]= {"java","python","java","c++","java","c++","c"};
//	String s="aniket ghroade";			//for only string
//	String ss[]=s.toCharArray();
	HashMap<String,Integer>hh=new HashMap<String,Integer>();
    for(int i=0;i<=s.length-1;i++)
	{
		if(hh.containsKey(s[i]))
		{
			hh.put(s[i],hh.get(s[i])+1);
		}
		else
		{
			hh.put(s[i],1);
		}		
	}
	for(Map.Entry entry:hh.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	
		
			//Interview Question
		// Occurance of character from string
/*	String a=" i am learning learning java java programing java i java";
	String ss[]=a.split(" ");
	String d="";
	for(int i=0;i<ss.length;i++)
	{
		d=d+ss[i];
	}
	System.out.println(d);
	char ch[]=d.toCharArray();
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(hm.containsKey(ch[i]))
		{
			hm.put(ch[i],hm.get(ch[i])+1);
		}
		else
		{
			hm.put(ch[i],1);
		}
	}
	for(Map.Entry entry:hm.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	*/
	
	
	}

}
