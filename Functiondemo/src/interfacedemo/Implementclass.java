package interfacedemo;

public class Implementclass implements Interfaceconcept,Interfaceconcept01 {

	
	public void method03() {
		System.out.println("complete method 03");
	}

	public void method04() {
		System.out.println("complete method 04");
	}

	
	public void method01() {
		System.out.println(" complete method 01");
	}

	public void method02() {
		System.out.println("complete method 02");
	}
	public static void main(String[] args) {
		System.out.println("--------method execution start----------");
		Implementclass obj=new Implementclass();
		obj.method01();
		obj.method02();
		obj.method03();
		obj.method04();
		
	}

}
