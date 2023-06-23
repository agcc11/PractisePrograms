package Methods;

public class MethodDemo03 {

	static int addition(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	int substaction(int x,int y)
	{
		int z;
		z=x-y;
		return z;
	}
	
	public static void main(String[] args) {
		
		int c=addition(11,11);
		System.out.println();
		
		MethodDemo03 obj=new MethodDemo03();
		int z=obj.substaction(5,2);
		System.out.println(z);
		
		
	}
	
	
	
}

	
