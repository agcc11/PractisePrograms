package overloading;

public class OverloadingDemo {
	
public void addition()
{
	int x=15,y=65;
	int z=x+y;
	
		System.out.println("value od z is" + z);
	}
	
	public void addition(int a,int b)
	{
		int c=a+b;
		System.out.println("value of c is "+ c);
	}

	public static void main(String[] args) {
		OverloadingDemo obj=new OverloadingDemo();
		obj.addition();
		obj.addition(10,20);
	}
	
}


