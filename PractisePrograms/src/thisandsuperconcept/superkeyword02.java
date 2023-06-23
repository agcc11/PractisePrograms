package thisandsuperconcept;

public class superkeyword02 extends superkeyword {

	int a=20;
	void sea(int a)
	{
		System.out.println(a);//30
		System.out.println(this.a);//20
		System.out.println(super.a);//10
	}
	public static void main(String[] args) {
		superkeyword02 obj=new superkeyword02();
		obj.sea(30);
		
	}
}
