package Casting;

public class implementlClass implements interface01 {

	public void bank() {
		System.out.println("bank method");
	}

	public void city() {
		System.out.println("city method");
	}

	void school() {
		System.out.println("school method");
	}
	public static void main(String[] args) {
		
		interface01 obj=new implementlClass();  //upcasting
		obj.bank();
		obj.city();
		interface01.mylta();
		obj.labour();
	
		
		interface01 objj=new implementlClass();   //downcasting
		implementlClass objj1=(implementlClass)objj;
		objj1.school();
	}
}
