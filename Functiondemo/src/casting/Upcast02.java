package casting;

public class Upcast02 extends Upcast01 {

	
	String variable;
	
	
	void tree()
	{
		System.out.println(" tree is not green");
	}
	
	
	void animal()
	{
		System.out.println(" animal is wild");
	}
	
	
	public static void main(String[] args) {
		
		Upcast01 obj=new Upcast02();
		Upcast02 obj1=(Upcast02)obj;    // down casting
		obj1.animal();
		obj1.tree();
		
		
		
		
		
		
	}
}
