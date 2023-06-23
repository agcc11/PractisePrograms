package Stringpractise;

public class remove_white_spaces {

	public static void main(String[] args) {
		//method01
		String s="pune is best in india";
		String ss=s.replace(" ", "");
		System.out.println(ss);
		
		//method 02 					using char[]and for loop                                                                
		String a="java is programing langauge";
		    char aa[]=a.toCharArray();
		    String b=" ";
		    for(int i=0;i<=aa.length-1;i++)
		    {
		    	if(aa[i]!=' ')
		    	{
		    		 b =b+aa[i];
		    	}
		    }
		    System.out.println(b);
		    
		   
		   
	}

}
