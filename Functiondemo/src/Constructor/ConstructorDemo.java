package Constructor;

public class ConstructorDemo {
	ConstructorDemo()
	{
		System.out.println("zero argument constuctor");
	}
	
	ConstructorDemo(int x,String s)
	{
		
	System.out.println("parameterised constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new 	ConstructorDemo();
    new 	ConstructorDemo(10,"aniket") ;
Diffconstructordemo obj=new Diffconstructordemo();
Diffconstructordemo obj1=new Diffconstructordemo(10,20);

	}

}
