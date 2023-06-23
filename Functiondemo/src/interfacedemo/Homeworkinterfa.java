package interfacedemo;

public class Homeworkinterfa implements interfa02 {

	
	public void interfaMethod01() {
		System.out.println("interfaMethod01 is completed");
	}

	public void interfaMethod02() {
		System.out.println("interfaMethod02 is completed");
	}
	public void interfaMethod03() {
		System.out.println("interfaMethod03 is completed");
	}

	public void interfaMethod04() {
		System.out.println("interfaMethod04 is completed");
	}
public static void main(String[] args) {
	 Homeworkinterfa obj=new  Homeworkinterfa();
	 obj.interfaMethod01();
	 obj.interfaMethod02();
	 obj.interfaMethod03();
	 obj.interfaMethod04();
	
}
}
