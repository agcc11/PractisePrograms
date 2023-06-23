package Casting;

public class SuperClass {

	void star()
	{
	 System.out.println(" star 01");
	}
	
	void planet()
	{
		
		System.out.println(" planet 01");
	}
	void water()
	{
		System.out.println(" water");
		
	}
	public static void main(String[] args) {
		
		
		SuperClass objj=new SubClass();
		objj.star();
		objj.planet();
		objj.water();
	//	objj.space();  this method cant call in Superclass beacuse it is not overide
		
		
	
	}
	
		
	}

