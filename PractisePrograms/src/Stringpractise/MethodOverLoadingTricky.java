package Stringpractise;

public class MethodOverLoadingTricky {

	//ORDER OF EXECUTION
	//int long Integer int...
/*	public void print(Integer i)
	{
		System.out.println("Integer");
	}
*/	
	public void print(int... i)
	{
		System.out.println("int...");
	}
/*	public void print(int  i)
	{
		System.out.println("int");
	}
	*/
	public void print(byte i)
	{
		System.out.println("byte");
	}
	public void print(short i)
	{
		System.out.println("short");
	}
/*	public void print(long i)
	{
		System.out.println("long");
	}
*/	
	
	
	
	public static void main(String[] args) {

		MethodOverLoadingTricky t=new MethodOverLoadingTricky();
		//t.print(10);
		t.print((byte)10);
		
		
		
		
		
		
		
	}

}
