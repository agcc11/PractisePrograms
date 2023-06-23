package Stringpractise;

public class covertIntegerToString {

	public static void main(String[] args) {
		
		//integer to string conversion
		int num=10;
		String str=String.valueOf(num);
		System.out.println(str);
		String Str1=String.format("%d", num);
		System.out.println(Str1);
		
		
		//String to integer conversion
		
		String s="50";
		int i=Integer.parseInt(s);
		System.out.println(i);
		int in=Integer.valueOf(s);
		System.out.println(in);
		
	}

}
