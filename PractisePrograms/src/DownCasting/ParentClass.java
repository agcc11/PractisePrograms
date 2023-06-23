package DownCasting;

public class ParentClass {

	
	void dynamo()
	{
		System.out.println("dynamo 01");
	}
	void shreeman()
	{
		System.out.println(" shreeman 01");
	}
	
	void mortal()
	{
		System.out.println("mortal 01");
	}
	
	void payal()
	{
		System.out.println("payal");
	}
	
	public static void main(String[] args) {
		
		ParentClass obj=new ChildClass();
		obj.dynamo();
		obj.shreeman();
		obj.mortal();
		obj.payal();
		ChildClass objj=(ChildClass)obj;
		objj.kani();
		
		
	}
	
}
