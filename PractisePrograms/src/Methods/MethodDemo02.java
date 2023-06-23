package Methods;

public class MethodDemo02 {

	static void addition(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	void substaction(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		addition(15,20);
		
		MethodDemo02 obj=new MethodDemo02();
		
		
		
		
		obj.substaction(40,20);
	}
}
