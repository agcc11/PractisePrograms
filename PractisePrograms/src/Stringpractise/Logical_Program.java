package Stringpractise;

public class Logical_Program {

	//Q3
	public static void strFunc(String str, int i)
	 {
	 if(i==str.length())
	 return;
	 System.out.println(str.charAt(i));
	 strFunc(str,i+1);
	 } 
	
	
	//Q4
	public static void strFunc1(String str1, int i)
	 {
	 if(i==str1.length())
	 return;
	 else if(str1.charAt(i)!=' ')
	 System.out.print(str1.charAt(i));
	 strFunc1(str1,i+1);
	 }
	
	public static void main(String[] args) {

		//Q1
		 int i = 5; 
		 System.out.println(i++ + i-- + ++i + --i + i);   //(5  + 6 + 6 + 5 + 5)
		 
		 
		 //prefix  add/sub first assign later
		 //post    assign first  add/sub later
		 
		 
		 //Q2
	/*	 for(int i1=0;;)     //RUN INFINITE TIME O/P IS 0
		 {
		 System.out.println(i1);
		 }
	*/	
		 
		 //Q3
		 String str = "Hello World";
		 strFunc(str, 0);
		
		 
		 //Q4
		 
		 String str1 = "Hello World";
		 strFunc1(str1, 0);
	}

}
