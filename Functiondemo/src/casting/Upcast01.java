package casting;

public class Upcast01 {

	
	
	String name;
	void animal()
	{
		System.out.println(" animal");
	}
		
	void cat()
	{
		System.out.println(" cat love");
	}
	
	void tree()
	{
		System.out.println(" tree is green");
	}
	
	public static void main(String[] args) {
		
		Upcast01 objj=new Upcast02();
		objj.tree();
		objj.animal();
		objj.cat();
		
	}
	
	
	
		
	}




