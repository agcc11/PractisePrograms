package Methods;

public class MethodDemo01 {

	static int addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		return c;
	}
	
	int substaction(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		
		addition(10,20);       // static method
		
		
		MethodDemo01 obj=new MethodDemo01();    //non static method
		obj.substaction(10,5);
		
	}
	
	}
	

		
		
	
	

