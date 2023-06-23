package StringMain;

public class address {
	
	public static void main(String[] args) {
		
	// constant pool area          
String a="velocity";
String b="velocity";  

boolean r;

r=(a==b);
	System.out.println(r);


// non constant pool area
	
	String s=new String("velocity");
	
	String s2=new String("velocity");
	
	boolean x=(s==s2);
	System.out.println(x);
	


	}
}

