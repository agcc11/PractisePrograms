package Hierarchicalinheritance;

public class subclass01 extends superclass{

	void pune() {
		System.out.println(" pune city");
	}

	void mumbai() {
		System.out.println("mumbai city");
	}

	void satara()
	{
		System.out.println("satar city");
	}
	void nashik()
	{
		System.out.println("nashik city");
	}
	
public static void main(String[] args) {
	
	subclass02 obj=new subclass02();  
	obj.pune();
	obj.mumbai();
	obj.satara();
}
		
	

}
