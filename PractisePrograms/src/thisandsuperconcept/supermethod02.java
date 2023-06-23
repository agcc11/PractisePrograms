package thisandsuperconcept;

public class supermethod02 extends supermethod {
void m1()
{
	System.out.println("method of overiden m1");
}
	void m3()
	{
	     super.m1();
	}
	public static void main(String[] args) {
		supermethod02 obj=new supermethod02();
		obj.m1();
		obj.m3();
		
		
		
	}
}
